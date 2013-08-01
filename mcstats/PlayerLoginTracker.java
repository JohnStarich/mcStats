package mods.mcstats;

import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.IPlayerTracker;

public class PlayerLoginTracker implements IPlayerTracker{

	//override to load saved skill data to skill manager on player login
	@Override
	public void onPlayerLogin(EntityPlayer player) {
		
	}
	
	//override to save player skill data to file on logout
	@Override
	public void onPlayerLogout(EntityPlayer player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) {}

	@Override
	public void onPlayerRespawn(EntityPlayer player) {
		
	}

}
