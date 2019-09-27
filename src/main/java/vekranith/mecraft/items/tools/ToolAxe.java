package vekranith.mecraft.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import vekranith.mecraft.Main;
import vekranith.mecraft.init.ModItems;
import vekranith.mecraft.util.IHasModel;

public class ToolAxe extends ItemAxe implements IHasModel
{

	public ToolAxe(String name, ToolMaterial material) 
	{
		super(material, 3.0f, -3.2f);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
}
