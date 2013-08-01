package mods.mcstats;

public abstract class GenericSkill {
	private int level;
	private int experience;
	private int xptonextlevel;
	
	public int getSkillLevel(){
		return level;
	}
	
	public int getExperience(){
		return experience;
	}
	
	public int getXPToNextLevel(){
		return xptonextlevel;
	}
	
	public abstract void gainExperience();
}
