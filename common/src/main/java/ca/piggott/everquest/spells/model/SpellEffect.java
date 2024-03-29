package ca.piggott.everquest.spells.model;


public enum SpellEffect {
 
	ATTRIB_0("Hitpoints", 26),
	ATTRIB_1("Armour Class", 1),
	ATTRIB_2("Attack", 1),
	ATTRIB_3("Movement speed", 7),
	ATTRIB_4("Strength", 1),
	ATTRIB_5("Dexterity", 1),
	ATTRIB_6("Agility", 1),
	ATTRIB_7("Stamina", 1),
	ATTRIB_8("Intellegence", 1),
	ATTRIB_9("Wisdom", 1),
	ATTRIB_10("Charisma", 4),
	ATTRIB_11("Attack Speed", 3),
	ATTRIB_12("Invisibility", 5),
	ATTRIB_13("See invisible", 5),
	ATTRIB_14("Enduring breath", 2),
	ATTRIB_15("Mana", 26),
	ATTRIB_18("Pacify", 0),
	ATTRIB_19("Add faction", 1),
	ATTRIB_20("Blind", 2),
	ATTRIB_21("Stun", 10),
	ATTRIB_22("Charm", 34),
	ATTRIB_23("Fear", 34),
	ATTRIB_24("Current stamina", 1),
	ATTRIB_25("Bind affinity", 5),
	ATTRIB_26("Gate", 2),
	ATTRIB_27("Cancel magic", 5),
	ATTRIB_28("Invisibility vs. Undead", 5),
	ATTRIB_29("Invisibility vs. Animals", 5),
	ATTRIB_30("Agro Radius", 36),
	ATTRIB_31("Mezmerize", 34),
	ATTRIB_32("Summon Item", 8),
	ATTRIB_33("Summon Pet", 11),
	ATTRIB_34("Shadowstep", 0),
	ATTRIB_35("Disease Counter(s),", 1),
	ATTRIB_36("Poison Counter(s),", 1),
	ATTRIB_40("Divine Aura", 2),
	ATTRIB_41("Destroy Target", 2),
	ATTRIB_42("Shadow step", 5),
	ATTRIB_44("Lycanthropy", 3),
	ATTRIB_46("Fire Resist", 1),
	ATTRIB_47("Cold Resist", 1),
	ATTRIB_48("Poison Resist", 1),
	ATTRIB_49("Disease Resist", 1),
	ATTRIB_50("Magic Resist", 1),
	ATTRIB_52("Sense Undead", 2),
	ATTRIB_53("Sense Summoned", 2),
	ATTRIB_54("Sense Animals", 2),
	ATTRIB_55("Absorb Damage", 1),
	ATTRIB_56("True North", 2),
	ATTRIB_57("Levitate", 5),
	ATTRIB_58("Illusion", 15),
	ATTRIB_59("Damage Shield", 17),
	ATTRIB_61("Identify", 2),
	ATTRIB_63("Memory Blur", 35),
	ATTRIB_64("whirl till you hurl", 2),
	ATTRIB_65("Infravision", 2),
	ATTRIB_66("Ultravision", 2),
	ATTRIB_67("Eye of Zomm", 2),
	ATTRIB_68("Reclaim Pet", 2),
	ATTRIB_69("Max Hitpoints", 1),
	ATTRIB_71("Summon Skeleton", 11),
	ATTRIB_73("Bind Sight", 2),
	ATTRIB_74("Feign Death", 30),
	ATTRIB_75("Voice Graft", 2),
	ATTRIB_76("Sentinel", 2),
	ATTRIB_77("Locate Corpse", 2),
	ATTRIB_78("Absorb Magic Damage", 1),
	ATTRIB_79("HP when cast", 1),
	ATTRIB_81("Resurrection", 14),
	ATTRIB_82("Summon Player", 2),
	ATTRIB_83("Teleport", 18),
	ATTRIB_84("Gravity flux", 13),
	ATTRIB_85("Add Proc", 16),
	ATTRIB_86("Assist Radius", 36),
	ATTRIB_87("Magnification", 3),
	ATTRIB_88("Evacuate", 18),
	ATTRIB_89("Player Size", 3),
	ATTRIB_90("Cloak", 2),
	ATTRIB_91("Summon Corpse", 2),
	ATTRIB_92("Hate", 1),
	ATTRIB_93("Stop Rain", 2),
	ATTRIB_94("Make Fragile", 2),
	ATTRIB_95("Sacrifice", 2),
	ATTRIB_96("Silence", 2),
	ATTRIB_97("Mana Pool", 1),
	ATTRIB_98("Haste v2", 7),
	ATTRIB_99("Root", 2),
	ATTRIB_100("Hitpoints v2", 26),
	ATTRIB_101("Complete Heal (with Duration),", 2),
	ATTRIB_102("Fearless", 2),
	ATTRIB_103("Summon Pet", 2),
	ATTRIB_104("Translocate", 18),
	ATTRIB_105("Anchor", 5),
	ATTRIB_106("BST Pet Summon", 11),
	ATTRIB_107("BST Pet Rank", 33),
	ATTRIB_108("Summon Familiar", 11),
	ATTRIB_109("Summon Item v2", 8),
	ATTRIB_110("Improve Archery", 7),
	ATTRIB_111("Resist All", 1),
	ATTRIB_112("Effective Casting Level", 1),
	ATTRIB_113("Horse Summon", 11),
	ATTRIB_114("Aggro Multiplier", 7),
	ATTRIB_115("Food/Water", 2),
	ATTRIB_116("Curse Counter(s),", 1),
	ATTRIB_117("Addon Magic Attribute", 2),
	ATTRIB_118("Singing Skill", 7),
	ATTRIB_119("Haste v3", 7),
	ATTRIB_120("Healing Effectiveness", 7),
	ATTRIB_121("Reverse Damage Shield", 39),
	ATTRIB_123("Screech", 5),
	ATTRIB_124("Spell Damage", 7),
	ATTRIB_125("Healing", 7),
	ATTRIB_126("Spell Resist Rate", 35),
	ATTRIB_127("Spell Haste", 7),
	ATTRIB_128("Spell Duration", 7),
	ATTRIB_129("Spell Range", 7),
	ATTRIB_130("Spell/Bash Hate", 7),
	ATTRIB_131("Chance of Using Reagent", 7),
	ATTRIB_132("Mana Cost", 20),
	ATTRIB_134("Limit: Max Level", 5),
	ATTRIB_135("Limit: Resist", 22),
	ATTRIB_136("Limit: Target", 23),
	ATTRIB_137("Limit: Effect", 24),
	ATTRIB_138("Limit: Spell Type", 25),
	ATTRIB_139("Limit: Spell", 21),
	ATTRIB_140("Limit: Min Duration (ticks),", 5),
	ATTRIB_141("Limit: Instant Spells Only", 2),
	ATTRIB_142("Limit: Min Level", 5),
	ATTRIB_143("Limit: Min Casting Time", 26),
	ATTRIB_144("Limit: Combat Procs", 2),
	ATTRIB_145("Teleport v2", 18),
	ATTRIB_146("Electricity Resist(?)", 1),  // TODO See Lightning Rod
	ATTRIB_147("Percentage Heal", 38),
	ATTRIB_148("Stacking: Block new", 9),
	ATTRIB_149("Stacking: Overwrite existing", 9),
	ATTRIB_150("Death Save", 2),
	ATTRIB_151("Suspended Minion", 46),
	ATTRIB_152("Summon Pets", 11),
	ATTRIB_153("Balance Party Health", 27),
	ATTRIB_154("Remove Detrimental", 5),
	ATTRIB_156("Illusion: Target", 15),
	ATTRIB_157("Spell-damage Shield", 5),
	ATTRIB_158("Chance to Reflect Spell", 7),
	ATTRIB_159("Stats", 1),
	ATTRIB_160("Drunk if tolerence is not at least", 6),
	ATTRIB_161("Mitigate Spell Damage", 28),
	ATTRIB_162("Mitigate Melee Damage", 28),
	ATTRIB_163("Mitigate Damage", 28),
	ATTRIB_164("Sense (Cursed) Trap", 33),
	ATTRIB_165("Disarm (Cursed) Trap", 33),
	ATTRIB_166("Destroy (Cursed) Lock", 33),
	ATTRIB_167("Pet Focus", 5),
	ATTRIB_168("Incoming Damage Interval", 7),
	ATTRIB_169("Chance to Critical Hit", 29),
	ATTRIB_170("Chance to Critical Nuke", 7),
	ATTRIB_171("Chance to Crippling Blow", 29),
	ATTRIB_172("Chance to Avoid Melee", 7),
	ATTRIB_173("Chance to Riposte", 7),
	ATTRIB_174("Chance to Dodge", 7),
	ATTRIB_175("Chance to Parry", 7),
	ATTRIB_176("Chance to Duel Wield", 7),
	ATTRIB_177("Chance to Double Attack", 7),
	ATTRIB_178("Lifetap from Weapon Damage", 30),
	ATTRIB_179("Instrument Modifier", 30),
	ATTRIB_180("Chance to Resist Spell", 7),
	ATTRIB_181("Chance to Resist Fear", 7),
	ATTRIB_182("Hundred Hands", 2),
	ATTRIB_183("Melee Skill Check", 29),
	ATTRIB_184("Chance to Hit", 13),
	ATTRIB_185("Damage Modifier", 29),
	ATTRIB_186("Minimum Damage Modifier", 29),
	ATTRIB_188("Chance to Block", 7),
	ATTRIB_189("Endurance Regen", 1),
	ATTRIB_191("Amnesia (no combat effects)", 0),
	ATTRIB_192("Hate", 26),
	ATTRIB_193("Skill Attack", 37),
	ATTRIB_194("Fade", 2),
	ATTRIB_195("Stun Resist", 7),
	ATTRIB_196("Strikethrough", 33),
	ATTRIB_197("Damage", 29),
	ATTRIB_198("Endurance when cast", 1),
	ATTRIB_199("Taunt ", -1),
	ATTRIB_200("Proc Chance", 3),
	ATTRIB_201("Ranged Proc", 33),
	ATTRIB_202("Illusion Other", 0),
	ATTRIB_203("Mass Group Buff", 0),
	ATTRIB_204("Fear Immunity", 204),
	ATTRIB_205("Rampage", 0),
	ATTRIB_206("AE Taunt", 35),
	ATTRIB_207("Convert meat to bone chips", 0),
	ATTRIB_209("Beneficial Dispell Rank", 6),
	ATTRIB_210("Pet shielding", 210),
	ATTRIB_211("AE Melee", 6),
	ATTRIB_214("Max Hitpoints", 1),
	ATTRIB_216("Accuracy", 7),
	ATTRIB_219("Slay Undead", 7),
	ATTRIB_220("Damage", 42),
	ATTRIB_221("Reduce Weight", -1),
	ATTRIB_222("Block Behind", 7),
	ATTRIB_225("Set Double Attack Skill ", 6),
	ATTRIB_227("Skill Timer", 29),
	ATTRIB_232("Near Death Cast", 31),
	ATTRIB_233("Metabolism", 5),
	ATTRIB_243("${invDirBase} chance of charm break by $base", 47),
	ATTRIB_250("Spell Proc Chance", 7),
	ATTRIB_254("Empty Slot", -2),
	ATTRIB_258("Triple Backstab", 5),
	ATTRIB_259("Limit: Skill ${spellSkillBase}", 47),
	ATTRIB_262("Stamina Cap", 1),
	ATTRIB_266("Chance for Extra Attack", 7),
	ATTRIB_270("Bard Song Range", 1),
	ATTRIB_272("Effective Casting Level v2", 1),
	ATTRIB_273("Chance to Critical DoT", 7),
	ATTRIB_274("Chance to Critical Heal", 7),
	ATTRIB_279("Flurry Chance", 30),
	ATTRIB_280("Pet Flurry Chance", 30),
	ATTRIB_286("Spell Damage", 1),
	ATTRIB_287("Spell Duration", 44),
	ATTRIB_289("Cast on break ", 16),
	ATTRIB_291("Remove Detrimental Effects: ", 6),
	ATTRIB_294("Chance to Critical Spell", 7),
	ATTRIB_295("Chance to Critical Spell", 7),
	ATTRIB_296("Incoming Spell Damage", 7),
	ATTRIB_297("Add Damage", 1),
	ATTRIB_298("Pet Size", 3),
	ATTRIB_299("Wake the Dead", 2),
	ATTRIB_300("Summon Doppleganger", 11),
	ATTRIB_302("Crit Damage", -1),
	ATTRIB_303("next spell damage", 1),
	ATTRIB_305("Damage Shield", 1),
	ATTRIB_306("Summon Pet",11),
	ATTRIB_307("Appraisal", 0),
	ATTRIB_309("Gate to caster's bind", 0),
	ATTRIB_310("Reuse Timer", 12),
	ATTRIB_311("Limit: Combat Skills not Allowed", 2),
	ATTRIB_312("Sanctuary (Remove Agro)", 0),
	ATTRIB_314("Fixed Invisibility", 5),
	ATTRIB_315("Fixed Invisibility vs. Undead", 5),
	ATTRIB_319("Chance to critical", 7),
	ATTRIB_320("Chance to Shield Block", 7),
	ATTRIB_321("Hate on Target's Target", 17),
	ATTRIB_322("Gate to Starting City", 0),
	ATTRIB_323("Defensive Proc", 16),
	ATTRIB_324("Use HP instead of Mana ($base hp : 1 mana exchange rate) ", 47),
	ATTRIB_328("Negative HP Limit", 5),
	ATTRIB_329("Transfer Damage to Mana", 35),
	ATTRIB_330("Critical Damage", 7),
	ATTRIB_331("Salvage", 35),
	ATTRIB_332("Summon to Corpse", 0),
	ATTRIB_333("Trigger Effect on Fade", 16),
	ATTRIB_334("Hitpoints", 1),
	ATTRIB_335("Block Spells", 5),
	ATTRIB_337("Experience Gain", 7),
	ATTRIB_338("Summon all corpses (across zonelines)", 0),
	ATTRIB_339("Trigger on Cast", 31),
	ATTRIB_340("Chance to add ", 31),
	ATTRIB_342("Supress flee on low health", 0),
	ATTRIB_343("Chance to Interrupt", 35),
	ATTRIB_348("Limit: Minimum Mana ", 6),
	ATTRIB_350("Mana to HP", 40),
	ATTRIB_351("Persistent Effect", 32),
	ATTRIB_353("Increase max auras by $base", 47),
	ATTRIB_358("Mana", 1),
	ATTRIB_360("On killing blow of a significant opponent cast", 31),
	ATTRIB_361("Upon death cast", 31),
	ATTRIB_364("Triple Attack", 7),
	ATTRIB_367("Change Body Type", 33),
	ATTRIB_368("Faction Modifier", -1),
	ATTRIB_369("Corruption Counter(s),", 1),
	ATTRIB_370("Corruption Resist", 1),
	ATTRIB_371("Attack Speed v4", 3),
	ATTRIB_373("Trigger on fade", 16),
	ATTRIB_374("Trigger", 31),
	ATTRIB_375("Critical Spell Damage", 7),
	ATTRIB_377("Trigger on Fade", 16),
	ATTRIB_378("", 48),
	ATTRIB_379("Move forward", 6),
	ATTRIB_380("", 43),
	ATTRIB_381("Pull towards caster ", 6),
	ATTRIB_382("Negate Damage Shield", 41),
	ATTRIB_383("Add on cast ", 31),
	ATTRIB_385("", 45),
	ATTRIB_386("Cast on curer", 16),
	ATTRIB_387("Trigger on cure", 16),
	ATTRIB_388("Summon Remains", 0),
	ATTRIB_389("Clear Spell Timers", 0),
	ATTRIB_392("Increase Healing Effectivess by $base",47),
	ATTRIB_393("Increase Incoming Healing Effectivess by $base%",47),
	ATTRIB_396("Amount Healed", 1),
	ATTRIB_398("Pet Duration", 12),
	ATTRIB_399("Twincast", 35),
	ATTRIB_400("caster's mana", 40),
	ATTRIB_401("target's mana", 40),
	ATTRIB_402("Drain up to $base of target's endurance dealing $base2 for every 10.",47),
	ATTRIB_406("Trigger on NumHits exhausted: $spellBase", 47),
	ATTRIB_408("Cap Hitpoints at $base% or $base2", 47),
	ATTRIB_409("Cap Mana at $base% or $base2", 47),
	ATTRIB_410("Cap Endurance $base or $base2", 47),
	ATTRIB_411("Limit: Class ${classBase}", 47),
	ATTRIB_413("Spell Effectiveness", 7),
	ATTRIB_414("Limit: $skillBase2", 47),
	ATTRIB_416("AC_v2", 416),
	ATTRIB_417("Mana Regen", -1),
	ATTRIB_419("Melee Proc", 16),
	ATTRIB_427("Trigger $spellBase on fade", 47),
	ATTRIB_428("Limit: Skill ${skillBase}",47),
	UNKNOWN("UNKNOWN",-1);

	public final String name;

	public final int display;

	private SpellEffect(String name, int display) {
		this.display = display;
		this.name = name;
	}
}