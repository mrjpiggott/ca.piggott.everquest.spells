package ca.piggott.everquest.spells.model;

/**
 * Helper methods for accessing common fields on {@code Spell}
 */
public final class SpellFields {

	private SpellFields() {
		// private constructor
	}
	
	/**
	 * Get the attrib field for a specified slot
	 * 
	 * @param spell the {@code Spell}
	 * @param slot the spell slot (index starts at 1)
	 * @return the attrib value
	 */
	public static int getAttrib(Spell spell, int slot) {
		switch(slot) {
			case 1:
				return spell.getIntField(Constants.INDEX_ATTRIB1);
			case 2:
				return spell.getIntField(Constants.INDEX_ATTRIB2);
			case 3:
				return spell.getIntField(Constants.INDEX_ATTRIB3);
			case 4:
				return spell.getIntField(Constants.INDEX_ATTRIB4);
			case 5:
				return spell.getIntField(Constants.INDEX_ATTRIB5);
			case 6:
				return spell.getIntField(Constants.INDEX_ATTRIB6);
			case 7:
				return spell.getIntField(Constants.INDEX_ATTRIB7);
			case 8:
				return spell.getIntField(Constants.INDEX_ATTRIB8);
			case 9:
				return spell.getIntField(Constants.INDEX_ATTRIB9);
			case 10:
				return spell.getIntField(Constants.INDEX_ATTRIB10);
			case 11:
				return spell.getIntField(Constants.INDEX_ATTRIB11);
			case 12:
				return spell.getIntField(Constants.INDEX_ATTRIB12);
		}
		throw new IllegalArgumentException("Attribute out of range!");
	}

	/**
	 * Get the calc id for a specified slot
	 * 
	 * @param spell the {@code Spell}
	 * @param slot the spell slot (index starts at 1)
	 * @return the calc id
	 */
	public static int getCalc(Spell spell, int slot) {
		switch(slot) {
			case 1:
				return spell.getIntField(Constants.INDEX_CALC1);
			case 2:
				return spell.getIntField(Constants.INDEX_CALC2);
			case 3:
				return spell.getIntField(Constants.INDEX_CALC3);
			case 4:
				return spell.getIntField(Constants.INDEX_CALC4);
			case 5:
				return spell.getIntField(Constants.INDEX_CALC5);
			case 6:
				return spell.getIntField(Constants.INDEX_CALC6);
			case 7:
				return spell.getIntField(Constants.INDEX_CALC7);
			case 8:
				return spell.getIntField(Constants.INDEX_CALC8);
			case 9:
				return spell.getIntField(Constants.INDEX_CALC9);
			case 10:
				return spell.getIntField(Constants.INDEX_CALC10);
			case 11:
				return spell.getIntField(Constants.INDEX_CALC11);
			case 12:
				return spell.getIntField(Constants.INDEX_CALC12);
		}
		throw new IllegalArgumentException("Calc out of range!");
	}

	/**
	 * Get the base field for a specified slot
	 * 
	 * @param spell the {@code Spell}
	 * @param slot the spell slot (index starts at 1)
	 * @return the base value
	 */
	public static int getBase(Spell spell, int slot) {
		switch(slot) {
			case 1:
				return spell.getIntField(Constants.INDEX_BASE1);
			case 2:
				return spell.getIntField(Constants.INDEX_BASE2);
			case 3:
				return spell.getIntField(Constants.INDEX_BASE3);
			case 4:
				return spell.getIntField(Constants.INDEX_BASE4);
			case 5:
				return spell.getIntField(Constants.INDEX_BASE5);
			case 6:
				return spell.getIntField(Constants.INDEX_BASE6);
			case 7:
				return spell.getIntField(Constants.INDEX_BASE7);
			case 8:
				return spell.getIntField(Constants.INDEX_BASE8);
			case 9:
				return spell.getIntField(Constants.INDEX_BASE9);
			case 10:
				return spell.getIntField(Constants.INDEX_BASE10);
			case 11:
				return spell.getIntField(Constants.INDEX_BASE11);
			case 12:
				return spell.getIntField(Constants.INDEX_BASE12);
		}
		throw new IllegalArgumentException("Base out of range!");
	}

	/**
	 * Get the base2 field for a specified slot
	 * 
	 * @param spell the {@code Spell}
	 * @param slot the spell slot (index starts at 1)
	 * @return the base2 value
	 */
	public static int getBase2(Spell spell, int slot) {
		switch(slot) {
			case 1:
				return spell.getIntField(Constants.INDEX_BASE2_1);
			case 2:
				return spell.getIntField(Constants.INDEX_BASE2_2);
			case 3:
				return spell.getIntField(Constants.INDEX_BASE2_3);
			case 4:
				return spell.getIntField(Constants.INDEX_BASE2_4);
			case 5:
				return spell.getIntField(Constants.INDEX_BASE2_5);
			case 6:
				return spell.getIntField(Constants.INDEX_BASE2_6);
			case 7:
				return spell.getIntField(Constants.INDEX_BASE2_7);
			case 8:
				return spell.getIntField(Constants.INDEX_BASE2_8);
			case 9:
				return spell.getIntField(Constants.INDEX_BASE2_9);
			case 10:
				return spell.getIntField(Constants.INDEX_BASE2_10);
			case 11:
				return spell.getIntField(Constants.INDEX_BASE2_11);
			case 12:
				return spell.getIntField(Constants.INDEX_BASE2_12);
		}
		throw new IllegalArgumentException("Base2 out of range!");
	}

	/**
	 * Get the max field for a specified slot
	 * 
	 * @param spell the {@code Spell}
	 * @param slot the spell slot (index starts at 1)
	 * @return the max value
	 */
	public static int getMax(Spell spell, int slot) {
		switch(slot) {
			case 1:
				return spell.getIntField(Constants.INDEX_MAX1);
			case 2:
				return spell.getIntField(Constants.INDEX_MAX2);
			case 3:
				return spell.getIntField(Constants.INDEX_MAX3);
			case 4:
				return spell.getIntField(Constants.INDEX_MAX4);
			case 5:
				return spell.getIntField(Constants.INDEX_MAX5);
			case 6:
				return spell.getIntField(Constants.INDEX_MAX6);
			case 7:
				return spell.getIntField(Constants.INDEX_MAX7);
			case 8:
				return spell.getIntField(Constants.INDEX_MAX8);
			case 9:
				return spell.getIntField(Constants.INDEX_MAX9);
			case 10:
				return spell.getIntField(Constants.INDEX_MAX10);
			case 11:
				return spell.getIntField(Constants.INDEX_MAX11);
			case 12:
				return spell.getIntField(Constants.INDEX_MAX12);
		}
		throw new IllegalArgumentException("Max out of range!");
	}
}
