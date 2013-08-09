package mods.mcstats;

import java.util.HashMap;

public class SkillManager {
	
	/** hashmap storing skills the player has */
	private static HashMap<String,GenericSkill> playerSkills;

	/** enum type for skills to access skill from hashmap */
	public enum TypeSkill{WOODCUTTING, MINING, DIGGING;}
	
	/**
	 * Returns the skill of the given type.
	 * @param skilltype
	 * @return
	 */
	public GenericSkill getSkill(TypeSkill skilltype){
		GenericSkill skill = null;
		if(skilltype.equals(TypeSkill.WOODCUTTING)){
			skill =  playerSkills.get("woodcutting");
		}
		return skill;
	}
}
