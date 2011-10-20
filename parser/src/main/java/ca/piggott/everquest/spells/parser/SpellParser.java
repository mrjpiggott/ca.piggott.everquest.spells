package ca.piggott.everquest.spells.parser;

import static ca.piggott.everquest.spells.model.SpellUtil.describeCalc;
import static ca.piggott.everquest.spells.model.SpellUtil.getBodyType;
import static ca.piggott.everquest.spells.model.SpellUtil.getResistType;
import static ca.piggott.everquest.spells.model.SpellUtil.getSkillType;
import static ca.piggott.everquest.spells.model.SpellUtil.getSpellEffect;
import static ca.piggott.everquest.spells.model.SpellUtil.getTargetType;
import static ca.piggott.everquest.spells.model.SpellUtil.numeric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import ca.piggott.everquest.spells.model.Constants;
import ca.piggott.everquest.spells.model.Spell;
import ca.piggott.everquest.spells.model.SpellEffect;
import ca.piggott.everquest.spells.model.SpellFields;
import ca.piggott.everquest.spells.model.SpellUtil;

public class SpellParser {
	
	private static final String SEC = " sec";

	private static final String TO = " to ";

	private static final String EXCLUDED = " excluded)";

	private static final String ALLOWED = " allowed)";

	private static final String BY = " by ";

	private static final String FOR = " for ";

	private static final String INCREASE = "Increase";

	private static final String DECREASE = "Decrease";

	private static final String VAR_BASE = "$base";

	private static final String VAR_CLASS_BASE = "${classBase}";

	private static final String VAR_SKILL_BASE = "${skillBase}";

	private static final String VAR_VALUE = "${value}";

	private static final String VAR_INVERSE_BASE = "${invDirBase}";

	private static final String VAR_SPELL_SKILL_BASE = "${spellSkillBase}";

	private static final Integer DBSTR_DESC_TYPE = Integer.valueOf(6);

	private Map<Long, Spell> parsedSpells = new LinkedHashMap<Long, Spell>();

	private Map<DbStrKey, String> dbstr = new HashMap<DbStrKey, String>();

	private Map<Integer,Spell> set = new HashMap<Integer,Spell>();

	/**
	 * Parse a dbstr stream, this is used to populate descriptions, illusion names, etc.
	 *
	 * @param stream the stream
	 * @throws IOException
	 */
	public void parseDbstr(InputStream stream) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		try {
			String line = null;
			while ((line = in.readLine()) != null) {
				String[] fields = line.split("\\^");
				if (fields.length >= 3) {
					dbstr.put(new DbStrKey(Long.valueOf(fields[0]), Integer.valueOf(fields[1])), fields[2]);
				}
			}
		} finally {
			in.close();
		}
	}

	/**
	 * Parse the spells file, calls to this method should usually be preceded by {@code parseDbstr} to fully populate spells
	 *
	 * @param stream the stream
	 * @throws IOException
	 */
	public void parseSpells(InputStream stream) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		try {
			String line = null;
			while((line = in.readLine()) != null) {
				Spell spell = parse(line);
				spell.setDescription(description(spell, dbstr.get(new DbStrKey(spell.getId(), DBSTR_DESC_TYPE))));
				updateCategories(spell);
				setTargetType(spell);
				parsedSpells.put(spell.getId(), spell);
			}
		} finally {
			if (in != null)
				in.close();
		}

		for (Spell spell : getSpells()) {
			String[] slots = new String[Constants.EFFECT_SLOTS];
			for (int i=1; i<=Constants.EFFECT_SLOTS; i++) {
				String slotDesc = getDescription(spell, i);
				if (slotDesc != null && slotDesc.length() > 0) {
					slots[i-1] = slotDesc;
				}
			}
			spell.setSlots(slots);
		}
		for (Entry<Integer,Spell> i : set.entrySet()) {
			System.out.println(i.getKey() + "->" + i.getValue().getField(Constants.INDEX_NAME));
		}
	}

	/**
	 * The spells
	 * @return the spells
	 */
	public Collection<Spell> getSpells() {
		return parsedSpells.values();
	}

	private void setTargetType(Spell spell) {
		spell.getFields()[Constants.INDEX_TARGETTYPE] = SpellUtil.getTargetType(spell.getIntField(Constants.INDEX_TARGETTYPE)); 
	}

	private void updateCategories(Spell spell) {
		String[] fields = spell.getFields();
		if (!"".equals(spell.getField(Constants.INDEX_CATEGORY_1)) && !"0".equals(spell.getField(Constants.INDEX_CATEGORY_1))) {
			fields[Constants.INDEX_CATEGORY_1] = dbstr.get(new DbStrKey(Long.valueOf(spell.getField(Constants.INDEX_CATEGORY_1)), 5));
		}
		if (!"".equals(spell.getField(Constants.INDEX_CATEGORY_2)) && !"0".equals(spell.getField(Constants.INDEX_CATEGORY_2))) {
			fields[Constants.INDEX_CATEGORY_2] = dbstr.get(new DbStrKey(Long.valueOf(spell.getField(Constants.INDEX_CATEGORY_2)), 5));
		}
		if (!"".equals(spell.getField(Constants.INDEX_CATEGORY_3)) && !"0".equals(spell.getField(Constants.INDEX_CATEGORY_3))) {
			fields[Constants.INDEX_CATEGORY_3] = dbstr.get(new DbStrKey(Long.valueOf(spell.getField(Constants.INDEX_CATEGORY_3)), 5));
		}
	}

	/*
	 * Substitutes values
	 */
	private String description(Spell spell, String dbstr) {
		if (dbstr != null) {
			for (int i=1; i<=Constants.EFFECT_SLOTS; i++) {
				dbstr = dbstr.replace('@' + Integer.toHexString(i), String.valueOf(SpellFields.getMax(spell, i)));
				dbstr = dbstr.replace('#' + Integer.toHexString(i), SpellUtil.getMinValue(spell, i));
			}
			dbstr = dbstr.replace("%z", SpellUtil.getFormattedDuration(spell));
		}
		// TODO Fix truncated
		if (dbstr != null && dbstr.length() > 499) {
			return dbstr.substring(0, 499);
		}
		return dbstr;
	}

	public static Spell parse(String line) {
		Spell sp = new Spell();
		String[] fields = line.split("\\^");
		sp.setFields(fields);
		return sp;
	}

	private String getDescription(Spell spell, int slot) {
		SpellEffect effect = getSpellEffect(SpellFields.getAttrib(spell, slot));
		StringBuilder description = new StringBuilder();

		int calc = SpellFields.getCalc(spell, slot);
		double base = SpellFields.getBase(spell, slot);
		double base2 = SpellFields.getBase2(spell, slot);
		double max = SpellFields.getMax(spell, slot);

		switch (effect.display) {
			case -1:
				set.put(SpellFields.getAttrib(spell, slot), spell);
				description.append(effect.name).append("(base: ").append(numeric(base)).append(", base2: ").append(numeric(base2)).append(", max: ").append(numeric(max)).append(")");
				break;
			case 0:
				description.append(effect.name);
				break;
			case 1:
				if (base > 0)
					description.append(INCREASE);
				else
					description.append(DECREASE);
				description.append(' ').append(effect.name).append(BY).append(describeCalc(spell, slot));
				break;
			case 2:
				description.append(effect.name);
				break;
			case 3:
				if (base - 100 > 0)
					description.append(INCREASE);
				else
					description.append(DECREASE);
				description.append(' ').append(effect.name).append(BY).append(describeCalc(spell, slot, '%'));
				break;
			case 4:
				if (base == -6)
					description.append("Lure(6)");
				else if (base > 0)
					description.append(INCREASE).append(' ').append(effect.name).append(BY).append(describeCalc(spell, slot));
				else if (base < 0)
					description.append(DECREASE).append(' ').append(effect.name).append(BY).append(describeCalc(spell, slot));
				break;
			case 5:
				description.append(effect.name).append(" (").append(numeric(base)).append(")");
				if (base2 != 0)
					description.append(" lose ").append(numeric(base2)).append("% over cap");
				break;
			case 6:
				description.append(effect.name).append(' ').append(numeric(base));
				break;
			case 7:
				if (base > 0)
					description.append(INCREASE);
				else
					description.append(DECREASE);
				description.append(' ').append(effect.name).append(BY).append(describeCalc(spell, slot, '%'));
				break;
			case 8:
				// TODO Items?
				description.append(effect.name).append(' ').append(getItemLink((long)base));
				break;
			case 9:
				description.append(effect.name).append(" spell if slot ").append(numeric(calc - 200)).append(" is effect ").append(getSpellEffect((int) base).name).append(" and < ").append(numeric(max));
				break;
			case 10:
				description.append(effect.name).append(FOR).append(numeric(Math.round(base / 100) / 10)).append(SEC);
				if (max != 0)
					description.append('/').append(numeric(max));
				break;
			// Horses, Pets & Familiars
			case 11:
				description.append(effect.name).append(": ").append(spell.getField(Constants.INDEX_EXTRA));
				if (base > 1)
					description.append(" x ").append(numeric(base));
				if (max > 0)
					description.append(FOR).append(numeric(max)).append(SEC);
				break;
			case 12:
				if (base > 0)
					description.append(DECREASE);
				else
					description.append(INCREASE);
				description.append(' ').append(effect.name).append(BY).append(numeric(base / 1000)).append(SEC);
				break;
			case 13:
				if (base > 0)
					description.append(DECREASE);
				else
					description.append(INCREASE);
				description.append(' ').append(effect.name).append(FOR).append(getSkillType((int) base2)).append(' ').append(Math.abs(base)).append('%');
				break;
			case 14:
				description.append(effect.name).append(" and restore ").append(numeric(base)).append("% experience+");
				break;
			case 15:
				description.append(effect.name).append(": ");
				if (base == 75) {
					description.append(SpellUtil.getElementalType((int) base2));
				} else {
					description.append(dbstr.get(new DbStrKey((long)base, 11)));
				}
				break;
			case 16:
				description.append(effect.name).append(": ").append(getSpellLink((long) base));
				if (base2 != 0)
					description.append(" (").append(numeric(base2)).append(" rate mod)");
				break;
			case 17:
				if (base > 0)
					description.append(DECREASE);
				else
					description.append(INCREASE);
				description.append(' ').append(effect.name).append(BY).append(describeCalc(spell, slot));
				break;
			case 18:
				description.append(effect.name).append(TO);
				if (base == 1 && base2 == 0 && max == 0)
					description.append("their bind point");
				else if (base == -1 && base2 == 0 && max == 0)
					description.append("safe point in zone");
				else
					description.append(SpellFields.getBase(spell, 1)).append(", ").append(SpellFields.getBase(spell, 2)).append(", ").append(SpellFields.getBase(spell, 3)).append(" in ").append(spell.getField(Constants.INDEX_EXTRA));
				break;
			case 19:
				description.append(effect.name);
				if (base == 2)
					description.append(" - Full Health Restore");
				else
					description.append(" - Partial Health Restore");
				break;
			case 20:
				if (base > 0)
					description.append(DECREASE);
				else
					description.append(INCREASE);
				description.append(' ').append(effect.name).append(BY).append(describeCalc(spell, slot, '%'));
				break;
			case 21:
				description.append(effect.name).append(' ').append(getSpellLink((long) base));
				if (base > 0)
					description.append(ALLOWED);
				else
					description.append(EXCLUDED);
				break;
			case 22:
				description.append(effect.name).append(" (").append(getResistType((int) Math.abs(base))).append(' ');
				if (base > 0)
					description.append(ALLOWED);
				else
					description.append(EXCLUDED);
				break;
			case 23:
				description.append(effect.name).append(" (").append(getTargetType((int) Math.abs(base)));
				if (base > 0)
					description.append(ALLOWED);
				else
					description.append(EXCLUDED);
				break;
			case 24:
				description.append(effect.name).append(" (").append(getSpellEffect((int) base).name);
				if (base < 0)
					description.append(EXCLUDED);
				else
					description.append(ALLOWED);
				break;
			case 25:
				description.append(effect.name);
				if (base == 0)
					description.append("(Detrimental only)");
				else if (base == 1)
					description.append("(Beneficial only)");
				else
					description.append("(").append(numeric(base)).append(")");
				break;
			case 26:
				if (base > 0)
					description.append(INCREASE);
				else
					description.append(DECREASE);
				description.append(' ').append(effect.name).append(BY).append(describeCalc(spell, slot));
				if (spell.getIntField(Constants.INDEX_DURATION) > 0)
					description.append(" per tick");
				if (base2 != 0)
					description.append(TO).append(SpellUtil.getTargetType((int)base2));
				break;
			case 27:
				description.append(effect.name).append(" (").append(numeric(base)).append("% penalty)");
				break;
			case 28:
				description.append(effect.name).append(BY).append(numeric(base)).append("%, ").append(numeric(max)).append(" total");
				break;
			case 29:
				if (base > 0)
					description.append(INCREASE).append(' ');
				else
					description.append(DECREASE).append(' ');
				description.append(getSkillType((int) base2)).append(' ').append(effect.name).append(BY).append(numeric(Math.abs(base))).append('%');
				break;
			case 30:
				description.append(effect.name).append(" (").append(numeric(base)).append(")");
				break;
			case 31:
				description.append(effect.name).append(' ').append(getSpellLink((long)base2)).append(" (").append(numeric(base)).append("% chance)");
				break;
			case 32:
				description.append(effect.name).append(": ").append(getSpellNameSearchLink(stripRank(spell.getField(Constants.INDEX_NAME))));
				break;
			case 33:
				description.append(effect.name).append(' ').append(getBodyType(base));
				break;
			case 34:
				description.append(effect.name);
				if (max != 0)
					description.append(" up to level ").append(numeric(max));
				break;
			case 35:
				description.append(effect.name).append(' ').append(numeric(base)).append('%');
				break;
			case 36:
				description.append("Set ").append(effect.name).append(TO).append(numeric(base));
				if (max > 0)
					description.append("% on characters ").append(numeric(max)).append(" or lower");
				else
					description.append('%');
				break;
			case 37:
				description.append(getSkillType(Constants.INDEX_SKILL)).append(" Attack : ").append(numeric(base)).append(" Base Damage with ").append(numeric(base2)).append("% Accuracy Mod");
				break;
			case 38:
				description.append(effect.name).append(FOR).append(numeric(max)).append(" up to ").append(numeric(base)).append('%');
				break;
			case 39:
				description.append(effect.name).append(FOR).append(numeric(Math.abs(base)));
				break;
			case 40:
				description.append("Convert ").append(effect.name).append(" at ").append(numeric(base2 / 10)).append(" hp/mana, up to ").append(numeric(base)).append(" mana+ [Max ").append(numeric(Math.floor(base * base2 / 10))).append(" hp]");
				break;
			case 41:
				description.append(effect.name).append(" up to ").append(numeric(base2)).append("");
				break;
			case 42:
				if (base > 0)
					description.append(INCREASE);
				else
					description.append(DECREASE);
				description.append(' ').append(effect.name).append(BY).append(numeric(base)).append(FOR).append(getSkillType((int) base2));
				break;
			case 43:
				description.append("Push up ").append(numeric(base)).append(" and push back ").append(numeric(base2)).append("");
				break;
			case 44:
				if (base > 0)
					description.append(INCREASE);
				else
					description.append(DECREASE);
				description.append(' ').append(effect.name).append(BY).append(numeric(base)).append(" tick(s)");
				break;
			case 45:
				description.append("Limit: Spell group ").append(getSpellGroupSearchLink(numeric(base)));
				break;
			case 46:
				description.append(effect.name);
				if (base == 1)
					description.append(" (Saves Buffs/equip)");
				break;
			case 47:
				description.append(effect.name);
				int index = 0;
				if ((index = description.indexOf(VAR_INVERSE_BASE)) != -1) {
					description.replace(index, index+VAR_INVERSE_BASE.length(), base > 0 ? DECREASE : INCREASE);
				}
				if ((index = description.indexOf(VAR_BASE)) != -1) {
					description.replace(index, index+VAR_BASE.length(), numeric(base));
				}
				if ((index = description.indexOf("$base2")) != -1) {
					description.replace(index, index+6, numeric(base2));
				}
				if ((index = description.indexOf("$max")) != -1) {
					description.replace(index, index+4, numeric(max));
				}
				if ((index = description.indexOf("$skillBase2")) != -1) {
					description.replace(index, index+11, getSkillType((int)base2));
				}
				if ((index = description.indexOf(VAR_SKILL_BASE)) != -1) {
					description.replace(index,index+VAR_SKILL_BASE.length(), getSkillType((int) base));
				}
				if ((index = description.indexOf("$spellBase")) != -1) {
					description.replace(index, index+10, getSpellLink((int)base));
				}
				if ((index = description.indexOf(VAR_SPELL_SKILL_BASE)) != -1) {
					description.replace(index, index+VAR_SPELL_SKILL_BASE.length(), getSkillType((int)Math.abs(base)));
				}
				if ((index = description.indexOf(VAR_VALUE)) != -1) {
					description.replace(index, index + VAR_VALUE.length(), describeCalc(spell, slot));
				}
				if ((index = description.indexOf(VAR_CLASS_BASE)) != -1) {
					description.replace(index, index+VAR_CLASS_BASE.length(), SpellUtil.getClass((int) base));
				}
				System.out.println(description);
				break;
			case 48:
				description.append(base > 0 ? INCREASE : DECREASE).append(" chance to resist ");
				description.append(SpellUtil.getSpellEffect((int) base2)).append(' ').append(numeric(base2)).append('%');
				break;
			case 210:
				description.append(effect.name).append(' ').append(numeric(base * 12)).append(SEC);
				break;
			case 204:
				description.append(effect.name).append(numeric(base * 10)).append(SEC);
				break;
			case 416:
				description.append(effect.name).append(BY).append(numeric(Math.floor(base / (10.0 / 3.0))));
		}
		return description.toString();
	}
	
	private String stripRank(String name) {
		if (name.endsWith("Rk. II")) {
			return name.substring(0, name.length() - 6);
		} else if (name.endsWith("Rk. III")) {
			return name.substring(0, name.length() - 7);
		}
		return name;
	}

	private String getSpellLink(long id) {
		Spell spell = getSpell(Math.abs(id)); 
		StringBuilder sb = new StringBuilder();
		sb.append("{@spell|").append(spell.getId()).append('|').append(spell.getField(Constants.INDEX_NAME)).append("}");
		return sb.toString();
	}
	
	private Spell getSpell(long id) {
		Spell spell = parsedSpells.get(Math.abs(id));
		if (spell == null) {
			spell = new UnknownSpell(id);
		}
		return spell;
	}
	
	private static String getItemLink(long id) {
		StringBuilder sb = new StringBuilder();
		sb.append("{@item|").append(id).append('|').append(id).append("}");
		return sb.toString();
	}
	
	private static String getSpellNameSearchLink(String name) {
		StringBuilder sb = new StringBuilder();
		sb.append("{@spellsearch|name|").append(name).append("}");
		return sb.toString();
	}
	
	private static String getSpellGroupSearchLink(String groupId) {
		StringBuilder sb = new StringBuilder();
		sb.append("{@spellsearch|group|").append(groupId).append("}");
		return sb.toString();
	}

	private static class DbStrKey {
		private Long one;
		private Integer two;
		DbStrKey(Long one, Integer two) {
			this.one = one;
			this.two = two;
		}
		public boolean equals(Object obj) {
			return obj != null && obj instanceof DbStrKey && one.equals(((DbStrKey)obj).one) && two.equals(((DbStrKey)obj).two); 
		}
		
		@Override
		public int hashCode() {
			return one.hashCode() ^ two.hashCode();
		}
	}
	
	private static class UnknownSpell extends Spell {
		private long id;
		UnknownSpell(long id) {
			this.id = id;
		}
		
		public long getId() {
			return id;
		}

		public int getIntField(int index) {
			return (int) id;
		}

		public double getDoubleField(int index) {
			return (double) id;
		}

		public String getField(int index) {
			return "Dummy("+id+")";
		}
	}
}
