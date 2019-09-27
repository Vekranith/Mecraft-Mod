package vekranith.mecraft.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import vekranith.mecraft.init.ModItems;

public class MecraftTab extends CreativeTabs
{

	public MecraftTab(String label) 
	{
        
		super("mecrafttab");
        
    }

	public ItemStack createIcon() 
	{
	
		return new ItemStack(ModItems.PLATINUM_COIN);
	
	}
	
}
