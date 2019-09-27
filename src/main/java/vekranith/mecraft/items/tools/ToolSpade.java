package vekranith.mecraft.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import vekranith.mecraft.Main;
import vekranith.mecraft.init.ModItems;
import vekranith.mecraft.util.IHasModel;

public class ToolSpade extends ItemSpade implements IHasModel
{

	public ToolSpade(String name, ToolMaterial material) 
	{
		super(material);
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