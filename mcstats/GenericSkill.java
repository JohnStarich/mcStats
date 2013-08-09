package mods.mcstats;

/**
 * Abstract base skill class which
 * all skills are based on.
 *
 */
public abstract class GenericSkill {
	/** Skill level */
	private int level;
	/** Total skill experience for current level */
	private int experience;
	/** Total skill experience to gain new level  */
	private int xptonextlevel;
	
	/**
	 * Returns skill level
	 * @return
	 */
	public int getSkillLevel(){
		return level;
	}
	
	/**
	 * Returns skill experience
	 * @return
	 */
	public int getExperience(){
		return experience;
	}
	
	/**
	 * Returns total experience to gain new level
	 * @return
	 */
	public int getXPToNextLevel(){
		return xptonextlevel;
	}
	
	/**
	 * 
	 */
	public abstract void gainExperience();
}
