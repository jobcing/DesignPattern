package commandPattern;

public class GameLoader {
	public static void main(String[] ar){
		HankyongGame hkGame = new HankyongGame();
		
		CharacterJob warrior = new CharacterJob("Warrior");
		CharacterJob archer = new CharacterJob("Archer");
		SpecialCharacter magician = new SpecialCharacter("Magician");
		
		AttackCommand warriorAttack = new AttackCommand(warrior);
		DefendCommand warriorDefend = new DefendCommand(warrior);
		AttackCommand archerAttack = new AttackCommand(archer);
		DefendCommand archerDefend = new DefendCommand(archer);
		
		SkillCommand magicianSkill = new SkillCommand(magician);
		CancelSkillCommand magicianSkillCancel = new CancelSkillCommand(magician);
		
		Command[] macroOn = { warriorAttack, archerAttack, magicianSkill };
		Command[] macroOff = { warriorDefend, archerDefend, magicianSkillCancel };
		
		MacroCommand partyOnMacro = new MacroCommand(macroOn);
		MacroCommand partyOffMacro = new MacroCommand(macroOff);
		
			hkGame.setCommand(0, warriorAttack, warriorDefend);
			hkGame.setCommand(1, archerAttack, archerDefend);
			hkGame.setCommand(2, magicianSkill, magicianSkillCancel);
			hkGame.setCommand(3, partyOnMacro, partyOffMacro);
			
			System.out.println(hkGame);
			
			hkGame.onButtonPress(3);
			System.out.println();
			hkGame.offButtonPress(3);
		}
	}
