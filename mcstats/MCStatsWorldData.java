package mods.mcstats;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.WorldSavedData;
import net.minecraft.world.storage.MapStorage;

/**
 * This is the class which saves ALL mod data
 * to the world save and loads ALL mod data to
 * the SkillManager.
 */
public class MCStatsWorldData extends WorldSavedData{

	final static String key = "MCStats.Saved.Data";
	
	// 
	
	public MCStatsWorldData() {
		super(key);
	}

	public static MCStatsWorldData forWorld(World world){
		//retrieves mcstatsworlddata instance for given world, creating it if necessary
		MapStorage storage = world.perWorldStorage;
		
		MCStatsWorldData result = (MCStatsWorldData)storage.loadData(MCStatsWorldData.class, key);
		if(result == null){
			result = new MCStatsWorldData();
			storage.setData(key, result);
		}
		return result;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound) {
		System.out.println("READ!");//DEBUG
		// TODO Auto-generated method stub
	}

	@Override
	public void writeToNBT(NBTTagCompound nbttagcompound) {
		System.out.println("WRITE!");//DEBUG
		// TODO Auto-generated method stub
	}

}
