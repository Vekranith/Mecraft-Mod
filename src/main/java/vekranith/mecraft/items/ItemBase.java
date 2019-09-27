package vekranith.mecraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import vekranith.mecraft.Main;
import vekranith.mecraft.init.ModItems;
import vekranith.mecraft.util.IHasModel;

public class ItemBase extends Item implements IHasModel
{

	public ItemBase(String name) 
	{
	
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(Main.mecrafttab);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
}
