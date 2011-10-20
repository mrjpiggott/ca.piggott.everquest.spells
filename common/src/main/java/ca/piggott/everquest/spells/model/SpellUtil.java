package ca.piggott.everquest.spells.model;


public final class SpellUtil {
	
	public static String getClass(int num) {
		num = (int) (Math.log(num) / Math.log(2));
		if (num > 0 && num < Constants.CLASSES_SHORT_ORDERED.length) {
			return Constants.CLASSES_SHORT_ORDERED[num];
		}
		return "UnknownClass("+num+")";
	}

	public static String getResistType(int type) {
		switch (type) {
			case 0:
				return "Unresistable";
			case 1:
				return "Magic";
			case 2:
				return "Fire";
			case 3:
				return "Cold";
			case 4:
				return "Poison";
			case 5:
				return "Disease";
			case 6:
				return "Chromatic";
			case 7:
				return "Prismatic";
			case 8:
				return "Physical";
			default:
				return "Unknown " + type;
		}
	}

	public static String getSkillType(int type) {
		switch (type) {
			case -1:
				return "All Skills";
			case 0:
				return "1H Blunt";
			case 1:
				return "1H Slashing";
			case 2:
				return "2H Blunt";
			case 3:
				return "2H Slashing";
			case 4:
				return "Abjuration";
			case 5:
				return "Alteration";
			case 6:
				return "Apply Poison";
			case 7:
				return "Archery";
			case 8:
				return "Backstab";
			case 9:
				return "Bind Wound";
			case 10:
				return "Bash";
			case 11:
				return "Block";
			case 12:
				return "Brass Instruments";
			case 13:
				return "Channeling";
			case 14:
				return "Conjuration";
			case 15:
				return "Defense";
			case 16:
				return "Disarm";
			case 17:
				return "Disarm Traps";
			case 18:
				return "Divination";
			case 19:
				return "Dodge";
			case 20:
				return "Double Attack";
			case 21:
				return "Dragon Punch";
			case 22:
				return "Dual Wield";
			case 23:
				return "Eagle Strike";
			case 24:
				return "Evocation";
			case 25:
				return "Feign Death";
			case 26:
				return "Flying Kick";
			case 27:
				return "Forage";
			case 28:
				return "Hand To Hand";
			case 29:
				return "Hide";
			case 30:
				return "Kick";
			case 31:
				return "Meditate";
			case 32:
				return "Mend";
			case 33:
				return "Offense";
			case 34:
				return "Parry";
			case 35:
				return "Pick Lock";
			case 36:
				return "Piercing";
			case 37:
				return "Riposte";
			case 38:
				return "Round Kick";
			case 39:
				return "Safe Fall";
			case 40:
				return "Sense Heading";
			case 41:
				return "Singing";
			case 42:
				return "Sneak";
			case 43:
				return "Specialize Abjure";
			case 44:
				return "Specialize Alteration";
			case 45:
				return "Specialize Conjuration";
			case 46:
				return "Specialize Divination";
			case 47:
				return "Specialize Evocation";
			case 48:
				return "Pick Pockets";
			case 49:
				return "Stringed Instruments";
			case 50:
				return "Swimming";
			case 51:
				return "Throwing";
			case 52:
				return "Tiger Claw";
			case 53:
				return "Tracking";
			case 54:
				return "Wind Instruments";
			case 55:
				return "Fishing";
			case 56:
				return "Make Poison";
			case 57:
				return "Tinkering";
			case 58:
				return "Research";
			case 59:
				return "Alchemy";
			case 60:
				return "Baking";
			case 61:
				return "Tailoring";
			case 62:
				return "Sense Traps";
			case 63:
				return "Blacksmithing";
			case 64:
				return "Fletching";
			case 65:
				return "Brewing";
			case 66:
				return "Alcohol Tolerance";
			case 67:
				return "Begging";
			case 68:
				return "Jewelry Making";
			case 69:
				return "Pottery";
			case 70:
				return "Percussion Instruments";
			case 71:
				return "Intimidation";
			case 72:
				return "Berserking";
			case 73:
				return "Taunt";
			case 74:
				return "Frenzy";
			case 76:
				return "Triple Attack";
			default:
				return "Unknown " + type;
		}
	}

	public static String getTargetType(int type) {
		switch (type) {
			case 1:
				return "Line of Sight";
			case 2:
				return "AE PC v1";
			case 3:
				return "Group v1";
			case 4:
				return "Area-Not-Group";
			case 5:
				return "Targeted-Other";
			case 6:
				return "Self";
			case 8:
				return "Targeted AE";
			case 9:
				return "Animal";
			case 10:
				return "Undead";
			case 11:
				return "Summoned";
			case 13:
				return "Lifetap";
			case 14:
				return "Pet";
			case 15:
				return "Corpse";
			case 16:
				return "Plant";
			case 17:
				return "Uber Giants";
			case 18:
				return "Uber Dragons";
			case 20:
				return "Targeted AE, Tap";
				// 21 -> 23 not used
			case 24:
				return "AE Undead";
			case 25:
				return "AE Summoned";
				// 26 -> 31 not unused
				/*
				 * 32 - 2x Unknown, Shyra Zone AE (DoD) Grel Strongboom AEx2
				 * (DoN) Guardian of the Sands AE (DoN) Discordling Warfiend AE
				 * (OoW) Ukun Fleshhunter (OoW)
				 */
			case 33:
				return "NPC Hatelist";
			case 34:
				return "Dungeon Object";
			case 35:
				return "MPG Weaponry Bosses"; // Lucy missing
			case 36:
				return "AE Players";
			case 37:
				return "AE NPCs";
			case 38:
				return "Summoned Pet";
				// 39 - 2x Unknown spells
			case 40:
				return "AE Players v2";
			case 41:
				return "Group v2";
			case 42:
				return "Directional AE";
			case 43:
				return "Group Member? (43)";
			case 44:
				return "Beam";
			case 45:
				return "Pointer AE";
			case 46:
				return "Target's Target";
			case 603:
				return "Undead";
			case 608:
				return "Summoned";
			default:
				return "Unknown " + type;
		}
	}

	public static String getDirection(int dir) {
		switch (dir) {
			case 58:
				return "East";
			case 96:
				return "South East";
			case 116:
				return "South";
			case 209:
				return "North West";
			case 303:
				return "North East";
			case 425:
				return "South West";
			case 454:
				return "West";
			case 510:
				return "North";
			default:
				return "Unknown " + dir;
		}
	}
	
	public static String getElementalType(int type) {
		switch (type) {
			case 0:
				return "Earth";
			case 1:
				return "Fire";
			case 2:
				return "Water";
			case 3: 
				return "Air";
			default:
				return "Unknown("+ type+")";
		}
	}

	public static SpellEffect getSpellEffect(int attrib) {
		switch (Math.abs(attrib)) {
			case 0:
				return SpellEffect.ATTRIB_0;
			case 1:
				return SpellEffect.ATTRIB_1;
			case 2:
				return SpellEffect.ATTRIB_2;
			case 3:
				return SpellEffect.ATTRIB_3;
			case 4:
				return SpellEffect.ATTRIB_4;
			case 5:
				return SpellEffect.ATTRIB_5;
			case 6:
				return SpellEffect.ATTRIB_6;
			case 7:
				return SpellEffect.ATTRIB_7;
			case 8:
				return SpellEffect.ATTRIB_8;
			case 9:
				return SpellEffect.ATTRIB_9;
			case 10:
				return SpellEffect.ATTRIB_10;
			case 11:
				return SpellEffect.ATTRIB_11;
			case 12:
				return SpellEffect.ATTRIB_12;
			case 13:
				return SpellEffect.ATTRIB_13;
			case 14:
				return SpellEffect.ATTRIB_14;
			case 15:
				return SpellEffect.ATTRIB_15;
			case 18:
				return SpellEffect.ATTRIB_18;
			case 19:
				return SpellEffect.ATTRIB_19;
			case 20:
				return SpellEffect.ATTRIB_20;
			case 21:
				return SpellEffect.ATTRIB_21;
			case 22:
				return SpellEffect.ATTRIB_22;
			case 23:
				return SpellEffect.ATTRIB_23;
			case 24:
				return SpellEffect.ATTRIB_24;
			case 25:
				return SpellEffect.ATTRIB_25;
			case 26:
				return SpellEffect.ATTRIB_26;
			case 27:
				return SpellEffect.ATTRIB_27;
			case 28:
				return SpellEffect.ATTRIB_28;
			case 29:
				return SpellEffect.ATTRIB_29;
			case 30:
				return SpellEffect.ATTRIB_30;
			case 31:
				return SpellEffect.ATTRIB_31;
			case 32:
				return SpellEffect.ATTRIB_32;
			case 33:
				return SpellEffect.ATTRIB_33;
			case 34:
				return SpellEffect.ATTRIB_34;
			case 35:
				return SpellEffect.ATTRIB_35;
			case 36:
				return SpellEffect.ATTRIB_36;
			case 40:
				return SpellEffect.ATTRIB_40;
			case 41:
				return SpellEffect.ATTRIB_41;
			case 42:
				return SpellEffect.ATTRIB_42;
			case 44:
				return SpellEffect.ATTRIB_44;
			case 46:
				return SpellEffect.ATTRIB_46;
			case 47:
				return SpellEffect.ATTRIB_47;
			case 48:
				return SpellEffect.ATTRIB_48;
			case 49:
				return SpellEffect.ATTRIB_49;
			case 50:
				return SpellEffect.ATTRIB_50;
			case 52:
				return SpellEffect.ATTRIB_52;
			case 53:
				return SpellEffect.ATTRIB_53;
			case 54:
				return SpellEffect.ATTRIB_54;
			case 55:
				return SpellEffect.ATTRIB_55;
			case 56:
				return SpellEffect.ATTRIB_56;
			case 57:
				return SpellEffect.ATTRIB_57;
			case 58:
				return SpellEffect.ATTRIB_58;
			case 59:
				return SpellEffect.ATTRIB_59;
			case 61:
				return SpellEffect.ATTRIB_61;
			case 63:
				return SpellEffect.ATTRIB_63;
			case 64:
				return SpellEffect.ATTRIB_64;
			case 65:
				return SpellEffect.ATTRIB_65;
			case 66:
				return SpellEffect.ATTRIB_66;
			case 67:
				return SpellEffect.ATTRIB_67;
			case 68:
				return SpellEffect.ATTRIB_68;
			case 69:
				return SpellEffect.ATTRIB_69;
			case 71:
				return SpellEffect.ATTRIB_71;
			case 73:
				return SpellEffect.ATTRIB_73;
			case 74:
				return SpellEffect.ATTRIB_74;
			case 75:
				return SpellEffect.ATTRIB_75;
			case 76:
				return SpellEffect.ATTRIB_76;
			case 77:
				return SpellEffect.ATTRIB_77;
			case 78:
				return SpellEffect.ATTRIB_78;
			case 79:
				return SpellEffect.ATTRIB_79;
			case 81:
				return SpellEffect.ATTRIB_81;
			case 82:
				return SpellEffect.ATTRIB_82;
			case 83:
				return SpellEffect.ATTRIB_83;
			case 84:
				return SpellEffect.ATTRIB_84;
			case 85:
				return SpellEffect.ATTRIB_85;
			case 86:
				return SpellEffect.ATTRIB_86;
			case 87:
				return SpellEffect.ATTRIB_87;
			case 88:
				return SpellEffect.ATTRIB_88;
			case 89:
				return SpellEffect.ATTRIB_89;
			case 90:
				return SpellEffect.ATTRIB_90;
			case 91:
				return SpellEffect.ATTRIB_91;
			case 92:
				return SpellEffect.ATTRIB_92;
			case 93:
				return SpellEffect.ATTRIB_93;
			case 94:
				return SpellEffect.ATTRIB_94;
			case 95:
				return SpellEffect.ATTRIB_95;
			case 96:
				return SpellEffect.ATTRIB_96;
			case 97:
				return SpellEffect.ATTRIB_97;
			case 98:
				return SpellEffect.ATTRIB_98;
			case 99:
				return SpellEffect.ATTRIB_99;
			case 100:
				return SpellEffect.ATTRIB_100;
			case 101:
				return SpellEffect.ATTRIB_101;
			case 102:
				return SpellEffect.ATTRIB_102;
			case 103:
				return SpellEffect.ATTRIB_103;
			case 104:
				return SpellEffect.ATTRIB_104;
			case 105:
				return SpellEffect.ATTRIB_105;
			case 106:
				return SpellEffect.ATTRIB_106;
			case 107:
				return SpellEffect.ATTRIB_107;
			case 108:
				return SpellEffect.ATTRIB_108;
			case 109:
				return SpellEffect.ATTRIB_109;
			case 110:
				return SpellEffect.ATTRIB_110;
			case 111:
				return SpellEffect.ATTRIB_111;
			case 112:
				return SpellEffect.ATTRIB_112;
			case 113:
				return SpellEffect.ATTRIB_113;
			case 114:
				return SpellEffect.ATTRIB_114;
			case 115:
				return SpellEffect.ATTRIB_115;
			case 116:
				return SpellEffect.ATTRIB_116;
			case 117:
				return SpellEffect.ATTRIB_117;
			case 118:
				return SpellEffect.ATTRIB_118;
			case 119:
				return SpellEffect.ATTRIB_119;
			case 120:
				return SpellEffect.ATTRIB_120;
			case 121:
				return SpellEffect.ATTRIB_121;
			case 123:
				return SpellEffect.ATTRIB_123;
			case 124:
				return SpellEffect.ATTRIB_124;
			case 125:
				return SpellEffect.ATTRIB_125;
			case 126:
				return SpellEffect.ATTRIB_126;
			case 127:
				return SpellEffect.ATTRIB_127;
			case 128:
				return SpellEffect.ATTRIB_128;
			case 129:
				return SpellEffect.ATTRIB_129;
			case 130:
				return SpellEffect.ATTRIB_130;
			case 131:
				return SpellEffect.ATTRIB_131;
			case 132:
				return SpellEffect.ATTRIB_132;
			case 134:
				return SpellEffect.ATTRIB_134;
			case 135:
				return SpellEffect.ATTRIB_135;
			case 136:
				return SpellEffect.ATTRIB_136;
			case 137:
				return SpellEffect.ATTRIB_137;
			case 138:
				return SpellEffect.ATTRIB_138;
			case 139:
				return SpellEffect.ATTRIB_139;
			case 140:
				return SpellEffect.ATTRIB_140;
			case 141:
				return SpellEffect.ATTRIB_141;
			case 142:
				return SpellEffect.ATTRIB_142;
			case 143:
				return SpellEffect.ATTRIB_143;
			case 144:
				return SpellEffect.ATTRIB_144;
			case 145:
				return SpellEffect.ATTRIB_145;
			case 146:
				return SpellEffect.ATTRIB_146;
			case 147:
				return SpellEffect.ATTRIB_147;
			case 148:
				return SpellEffect.ATTRIB_148;
			case 149:
				return SpellEffect.ATTRIB_149;
			case 150:
				return SpellEffect.ATTRIB_150;
			case 151:
				return SpellEffect.ATTRIB_151;
			case 152:
				return SpellEffect.ATTRIB_152;
			case 153:
				return SpellEffect.ATTRIB_153;
			case 154:
				return SpellEffect.ATTRIB_154;
			case 156:
				return SpellEffect.ATTRIB_156;
			case 157:
				return SpellEffect.ATTRIB_157;
			case 158:
				return SpellEffect.ATTRIB_158;
			case 159:
				return SpellEffect.ATTRIB_159;
			case 160:
				return SpellEffect.ATTRIB_160;
			case 161:
				return SpellEffect.ATTRIB_161;
			case 162:
				return SpellEffect.ATTRIB_162;
			case 163:
				return SpellEffect.ATTRIB_163;
			case 164:
				return SpellEffect.ATTRIB_164;
			case 165:
				return SpellEffect.ATTRIB_165;
			case 166:
				return SpellEffect.ATTRIB_166;
			case 167:
				return SpellEffect.ATTRIB_167;
			case 168:
				return SpellEffect.ATTRIB_168;
			case 169:
				return SpellEffect.ATTRIB_169;
			case 170:
				return SpellEffect.ATTRIB_170;
			case 171:
				return SpellEffect.ATTRIB_171;
			case 172:
				return SpellEffect.ATTRIB_172;
			case 173:
				return SpellEffect.ATTRIB_173;
			case 174:
				return SpellEffect.ATTRIB_174;
			case 175:
				return SpellEffect.ATTRIB_175;
			case 176:
				return SpellEffect.ATTRIB_176;
			case 177:
				return SpellEffect.ATTRIB_177;
			case 178:
				return SpellEffect.ATTRIB_178;
			case 179:
				return SpellEffect.ATTRIB_179;
			case 180:
				return SpellEffect.ATTRIB_180;
			case 181:
				return SpellEffect.ATTRIB_181;
			case 182:
				return SpellEffect.ATTRIB_182;
			case 183:
				return SpellEffect.ATTRIB_183;
			case 184:
				return SpellEffect.ATTRIB_184;
			case 185:
				return SpellEffect.ATTRIB_185;
			case 186:
				return SpellEffect.ATTRIB_186;
			case 188:
				return SpellEffect.ATTRIB_188;
			case 189:
				return SpellEffect.ATTRIB_189;
			case 191:
				return SpellEffect.ATTRIB_191;
			case 192:
				return SpellEffect.ATTRIB_192;
			case 193:
				return SpellEffect.ATTRIB_193;
			case 194:
				return SpellEffect.ATTRIB_194;
			case 195:
				return SpellEffect.ATTRIB_195;
			case 196:
				return SpellEffect.ATTRIB_196;
			case 197:
				return SpellEffect.ATTRIB_197;
			case 198:
				return SpellEffect.ATTRIB_198;
			case 199:
				return SpellEffect.ATTRIB_199;
			case 200:
				return SpellEffect.ATTRIB_200;
			case 201:
				return SpellEffect.ATTRIB_201;
			case 202:
				return SpellEffect.ATTRIB_202;
			case 203:
				return SpellEffect.ATTRIB_203;
			case 204:
				return SpellEffect.ATTRIB_204;
			case 205:
				return SpellEffect.ATTRIB_205;
			case 206:
				return SpellEffect.ATTRIB_206;
			case 207:
				return SpellEffect.ATTRIB_207;
			case 209:
				return SpellEffect.ATTRIB_209;
			case 210:
				return SpellEffect.ATTRIB_210;
			case 211:
				return SpellEffect.ATTRIB_211;
			case 214:
				return SpellEffect.ATTRIB_214;
			case 216:
				return SpellEffect.ATTRIB_216;
			case 219:
				return SpellEffect.ATTRIB_219;
			case 220:
				return SpellEffect.ATTRIB_220;
			case 221:
				return SpellEffect.ATTRIB_221;
			case 222:
				return SpellEffect.ATTRIB_222;
			case 225:
				return SpellEffect.ATTRIB_225;
			case 227:
				return SpellEffect.ATTRIB_227;
			case 232:
				return SpellEffect.ATTRIB_232;
			case 233:
				return SpellEffect.ATTRIB_233;
			case 243:
				return SpellEffect.ATTRIB_243;
			case 250:
				return SpellEffect.ATTRIB_250;
			case 254:
				return SpellEffect.ATTRIB_254;
			case 258:
				return SpellEffect.ATTRIB_258;
			case 259:
				return SpellEffect.ATTRIB_259;
			case 262:
				return SpellEffect.ATTRIB_262;
			case 266:
				return SpellEffect.ATTRIB_266;
			case 270:
				return SpellEffect.ATTRIB_270;
			case 272:
				return SpellEffect.ATTRIB_272;
			case 273:
				return SpellEffect.ATTRIB_273;
			case 274:
				return SpellEffect.ATTRIB_274;
			case 279:
				return SpellEffect.ATTRIB_279;
			case 280:
				return SpellEffect.ATTRIB_280;
			case 286:
				return SpellEffect.ATTRIB_286;
			case 287:
				return SpellEffect.ATTRIB_287;
			case 289:
				return SpellEffect.ATTRIB_289;
			case 291:
				return SpellEffect.ATTRIB_291;
			case 294:
				return SpellEffect.ATTRIB_294;
			case 295:
				return SpellEffect.ATTRIB_295;
			case 296:
				return SpellEffect.ATTRIB_296;
			case 297:
				return SpellEffect.ATTRIB_297;
			case 298:
				return SpellEffect.ATTRIB_298;
			case 299:
				return SpellEffect.ATTRIB_299;
			case 300:
				return SpellEffect.ATTRIB_300;
			case 302:
				return SpellEffect.ATTRIB_302;
			case 303:
				return SpellEffect.ATTRIB_303;
			case 305:
				return SpellEffect.ATTRIB_305;
			case 306:
				return SpellEffect.ATTRIB_306;
			case 307:
				return SpellEffect.ATTRIB_307;
			case 309:
				return SpellEffect.ATTRIB_309;
			case 310:
				return SpellEffect.ATTRIB_310;
			case 311:
				return SpellEffect.ATTRIB_311;
			case 312:
				return SpellEffect.ATTRIB_312;
			case 314:
				return SpellEffect.ATTRIB_314;
			case 315:
				return SpellEffect.ATTRIB_315;
			case 319:
				return SpellEffect.ATTRIB_319;
			case 320:
				return SpellEffect.ATTRIB_320;
			case 321:
				return SpellEffect.ATTRIB_321;
			case 322:
				return SpellEffect.ATTRIB_322;
			case 323:
				return SpellEffect.ATTRIB_323;
			case 324:
				return SpellEffect.ATTRIB_324;
			case 328:
				return SpellEffect.ATTRIB_328;
			case 329:
				return SpellEffect.ATTRIB_329;
			case 330:
				return SpellEffect.ATTRIB_330;
			case 331:
				return SpellEffect.ATTRIB_331;
			case 332:
				return SpellEffect.ATTRIB_332;
			case 333:
				return SpellEffect.ATTRIB_333;
			case 334:
				return SpellEffect.ATTRIB_334;
			case 335:
				return SpellEffect.ATTRIB_335;
			case 337:
				return SpellEffect.ATTRIB_337;
			case 338:
				return SpellEffect.ATTRIB_338;
			case 339:
				return SpellEffect.ATTRIB_339;
			case 340:
				return SpellEffect.ATTRIB_340;
			case 342:
				return SpellEffect.ATTRIB_342;
			case 343:
				return SpellEffect.ATTRIB_343;
			case 348:
				return SpellEffect.ATTRIB_348;
			case 350:
				return SpellEffect.ATTRIB_350;
			case 351:
				return SpellEffect.ATTRIB_351;
			case 353:
				return SpellEffect.ATTRIB_353;
			case 358:
				return SpellEffect.ATTRIB_358;
			case 360:
				return SpellEffect.ATTRIB_360;
			case 361:
				return SpellEffect.ATTRIB_361;
			case 364:
				return SpellEffect.ATTRIB_364;
			case 367:
				return SpellEffect.ATTRIB_367;
			case 368:
				return SpellEffect.ATTRIB_368;
			case 369:
				return SpellEffect.ATTRIB_369;
			case 370:
				return SpellEffect.ATTRIB_370;
			case 371:
				return SpellEffect.ATTRIB_371;
			case 373:
				return SpellEffect.ATTRIB_373;
			case 374:
				return SpellEffect.ATTRIB_374;
			case 375:
				return SpellEffect.ATTRIB_375;
			case 377:
				return SpellEffect.ATTRIB_377;
			case 378:
				return SpellEffect.ATTRIB_378;
			case 379:
				return SpellEffect.ATTRIB_379;
			case 380:
				return SpellEffect.ATTRIB_380;
			case 381:
				return SpellEffect.ATTRIB_381;
			case 382:
				return SpellEffect.ATTRIB_382;
			case 383:
				return SpellEffect.ATTRIB_383;
			case 385:
				return SpellEffect.ATTRIB_385;
			case 386:
				return SpellEffect.ATTRIB_386;
			case 387:
				return SpellEffect.ATTRIB_387;
			case 388:
				return SpellEffect.ATTRIB_388;
			case 389:
				return SpellEffect.ATTRIB_389;
			case 392:
				return SpellEffect.ATTRIB_392;
			case 393:
				return SpellEffect.ATTRIB_393;
			case 396:
				return SpellEffect.ATTRIB_396;
			case 398:
				return SpellEffect.ATTRIB_398;
			case 399:
				return SpellEffect.ATTRIB_399;
			case 400:
				return SpellEffect.ATTRIB_400;
			case 401:
				return SpellEffect.ATTRIB_401;
			case 402:
				return SpellEffect.ATTRIB_402;
			case 406:
				return SpellEffect.ATTRIB_406;
			case 408:
				return SpellEffect.ATTRIB_408;
			case 409:
				return SpellEffect.ATTRIB_409;
			case 410:
				return SpellEffect.ATTRIB_410;
			case 411:
				return SpellEffect.ATTRIB_411;
			case 413:
				return SpellEffect.ATTRIB_413;
			case 414:
				return SpellEffect.ATTRIB_414;
			case 416:
				return SpellEffect.ATTRIB_416;
			case 417:
				return SpellEffect.ATTRIB_417;
			case 419:
				return SpellEffect.ATTRIB_419;
			case 427:
				return SpellEffect.ATTRIB_427;
			case 428:
				return SpellEffect.ATTRIB_428;
			default:
				return SpellEffect.UNKNOWN;
		}
	}

	private SpellUtil() {
	}

	/**
	 * Get the description for this spell slot
	 */
	public static String describeCalc(Spell spell, int slot, char unit) {
		String min = getMinValue(spell, slot);
		String[] max = getMaxValue(spell, slot);

		if (min.equals(max[0]))
			return min + unit;

		return min + unit + " (L" + SpellUtil.getBaseLevel(spell) + ") to " + max[0] + unit + " (L" + max[1] + ")";
	}

	/**
	 * Get the description for this spell slot
	 */
	public static String describeCalc(Spell spell, int slot) {
		String min = getMinValue(spell, slot);
		String[] max = getMaxValue(spell, slot);

		if (min.equals(max[0]))
			return min;

		return min + " (L" + SpellUtil.getBaseLevel(spell) + ") to " + max[0] + " (L" + max[1] + ")";
	}

	/**
	 * Get the maximum of this effect slot
	 */
	private static String[] getMaxValue(Spell spell, int slot) {
		String[] val = new String[2];
		double max = Math.abs(SpellFields.getMax(spell,slot));

		if (max == 0) {
			val[1] = numeric(Constants.MAX_LEVEL);
			val[0] = doCalc(spell, slot, Constants.MAX_LEVEL);
		} else {
			String value = "";
			int lvl = SpellUtil.getBaseLevel(spell);

			while (compare(max, value) && (lvl <= Constants.MAX_LEVEL))
				value = doCalc(spell, slot, lvl++);

			val[1] = numeric(--lvl);
			if (!compare(max, value)) {
				val[0] = numeric(max);
			} else {
				val[0] = value;
			}
		}
		return val;
	}

	private static boolean compare(double max, String value) {
		try {
			double v = Double.parseDouble(value);
			return max > v;
		} catch (NumberFormatException e) {
			return true;
		}
	}

	/**
	 * Get the minimum (initial) of this effect slot.
	 */
	public static String getMinValue(Spell spell, int slot) {
		int level = SpellUtil.getBaseLevel(spell);

		return doCalc(spell, slot, level);
	}

	/**
	 * Perform the appropriate calculation for this slot at the specified level
	 */
	private static String doCalc(Spell spell, int slot, int level) {
		double base = Math.abs(SpellFields.getBase(spell, slot));
		int attrib = SpellFields.getAttrib(spell, slot);
		double max = SpellFields.getMax(spell, slot);

		int calc = (int) SpellFields.getCalc(spell, slot);
		int baseLevel = SpellUtil.getBaseLevel(spell);
		// Spell haste & player size reduction
		if (attrib == 11 || attrib == 89) {
			base = Math.abs(base - 100);
			max = Math.abs(base - 100);
		}
		String value = "";
		switch (calc) {
			case 0:
				value = numeric(base);
				break;
			case 1:
				value = numeric(level);
				break;
			case 2:
				value = numeric(base + level * 2);
				break;
			case 3:
				value = numeric(base + level * 3);
				break;
			case 4:
				value = numeric(base + level * 4);
				break;
			case 5:
				value = numeric(base + level * 5);
				break;
			case 6:
				value = numeric(base + level * 6);
				break;
			case 7:
				value = numeric(base + level * 7);
				break;
			case 8:
				value = numeric(base + level * 8);
				break;
			case 9:
				value = numeric(base + level * 9);
				break;
			case 10:
				value = numeric(base + level * 10);
				break;
			case 14:
				value = numeric(base + level * 14);
				break;
			case 15:
				value = numeric(base + level * 15);
				break;
			case 20:
				value = numeric(base + level * 20);
				break;
			case 32:
				if (level > 40)
					value = numeric(33 + ((level - 1) * 32) + ((level - 40) * 44));
				else
					value = numeric(33 + ((level - 1) * 32));
				break;
			case 60:
			case 70:
				value = "(" + base + " / 100 sec) / " + max + ")";
				break;
			case 100:
				value = numeric(base);
				break;
			case 101:
				value = numeric(level / 2 + base);
				break;
			case 102:
				value = numeric(base + level);
				break;
			case 103:
				value = numeric(base + level * 2);
				break;
			case 104:
				value = numeric(base + level * 3);
				break;
			case 105:
				value = numeric(base + level * 4);
				break;
			case 107:
				value = numeric(base + level / 2);
				break;
			case 108:
				value = numeric(base + level / 3);
				break;
			case 109:
				value = numeric(base + level / 4);
				break;
			case 110:
				value = numeric(base + level / 5);
				break;
			case 111:
				value = numeric(base + (level - baseLevel * 6));
				break;
			case 112:
				value = numeric(base + (level - baseLevel * 8));
				break;
			case 113:
				value = numeric(base + (level - baseLevel * 10));
				break;
			case 114:
				value = numeric(base + (level - baseLevel * 15));
				break;
			case 115:
				value = numeric(base + (level - baseLevel * 6));
				break;
			case 116:
				value = numeric(base + (level - baseLevel * 8));
				break;
			case 117:
				value = numeric(base + (level - baseLevel * 12));
				break;
			case 118:
				value = numeric(base + (level - baseLevel * 20));
				break;
			case 119:
				value = numeric(base + level / 8);
				break;
			case 121:
				value = numeric((base + level * 0.3));
				break;
			case 122:
				value = numeric((level / 65) * 100);
				break;
			case 123:
				value = numeric(base) + " to " + numeric(max);
				break;
			case 132:
				value = numeric(base);
				break;
			/*
			 * Stacking rules for spells start here
			 */
			case 201:
				value = "if slot 1 is " + numeric(base) + " and < " + numeric(max);
				break;
			case 202:
				value = "if slot 2 is " + numeric(base) + " and < " + numeric(max);
				break;
			case 203:
				value = "if slot 3 is $min and < $$max";
				break;
			case 204:
				value = "if slot 4 is $min and < $$max";
				break;
			case 205:
				value = "if slot 5 is $min and < $$max";
				break;
			case 206:
				value = "if slot 6 is $min and < $$max";
				break;
			case 207:
				value = "if slot 7 is $min and < $$max";
				break;
			case 208:
				value = "if slot 8 is $min and < $$max";
				break;
			case 209:
				value = "if slot 9 is $min and < $$max";
				break;
			case 210:
				value = "if slot 10 is $min and < $$max";
				break;
			case 211:
				value = "if slot 11 is $min and < $$max";
				break;
			case 212:
				value = "if slot 12 is $min and < $$max";
				break;
			case 1104:
				value = max + " decreasing to " + (max - (spell.getIntField(Constants.INDEX_DURATION) * 104)) + " by 104/tick";
				break;
			case 2048:
				value = numeric(1 + level * 48);
				break;
			default:
				if ( calc > 1000 && calc < 2000) {
					int chg = calc - 1000;
					value = max + " decreasing to " + (max - (spell.getIntField(Constants.INDEX_DURATION) * chg)) + " by " + chg + "/tick";
				} else {
					value = "Unknown Calc(" + calc + ")";
				}
		}

		try {
			double v = Double.parseDouble(value);
			if (attrib == 1) {
				v *= 0.3;
				max *= 0.3;
			}
			v = Math.floor(v);
			value = numeric(v);
			if (v > max && max > 0)
				value = numeric(max);
		} catch (NumberFormatException e) {
			// do nothing
		}
		return value;
	}
	public static String getBodyType(double base) {
		// TODO Auto-generated method stub
		return null;
	}

	public static int getBaseLevel(Spell spell) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static String numeric(double num) {
		if (num == (int) num)
			return String.valueOf((int) num);
		return String.valueOf(num);
	}
	
	public static int getDuration(Spell spell) {
		int value = 0;
		int level = Constants.MAX_LEVEL;
		int max = spell.getIntField(Constants.INDEX_DURATION);
		switch (spell.getIntField(Constants.INDEX_DURATIONFORMULA))
		{
		case 0:
			value = 0;
			break;
		case 1:
			value = level / 2;
			if (value < 1)
				value = 1;
			break;
		case 2:
			value = (level / 2) + 5;
			if (value < 6)
				value = 6;
			break;
		case 3:
			value = level * 30;
			break;
		case 4:
			value = 50;
			break;
		case 5:
			value = 2;
			break;
		case 6:
			value = level / 2;
			break;
		case 7:
			value = level;
			break;
		case 8:
			value = level + 10;
			break;
		case 9:
			value = level * 2 + 10;
			break;
		case 10:
			value = level * 30 + 10;
			break;
		case 11:
			value = (level + 3) * 30;
			break;
		case 12:
			value = level / 2;
			if (value < 1)
				value = 1;
			break;
		case 13:
			value = level * 3 + 10;
			break;
		case 14:
			value = (level + 2) * 5;
			break;
		case 15:
			value = (level + 10) * 10;
			break;
		case 50:
			value = 72000;
			break;
		case 3600:
			value = 3600;
			break;
		default:
			value = max;
			break;
		}

		if (max > 0 && value > max)
			value = max;
		return max;
	}

	public static CharSequence getFormattedDuration(Spell spell) {
		int value = getDuration(spell);

		int[] duration = new int[3];
		duration[0] = (int) Math.floor(((double) value)/600);
		value %= 600;
		duration[1] = (int) Math.floor(((double) value)/10);
		value %= 10;
		duration[2] = value*6;
		
		StringBuilder sb = new StringBuilder();
		
		if ( duration[0] > 0 )
			sb.append(duration[0]).append(':');
		if ( sb.length() > 0 && duration[1] < 10 )
			sb.append('0');
		sb.append(duration[1]).append(':');
		if ( sb.length() > 0 && duration[2] * 6 < 10 )
			sb.append('0');
		sb.append(duration[2]);
		
		return sb.toString();
	}
}
