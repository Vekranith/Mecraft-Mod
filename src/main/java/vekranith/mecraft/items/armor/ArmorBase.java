package vekranith.mecraft.items.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import vekranith.mecraft.Main;
import vekranith.mecraft.init.ModItems;
import vekranith.mecraft.util.IHasModel;

public class ArmorBase extends ItemArmor implements IHasModel
{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{

		super(materialIn, renderIndexIn, equipmentSlotIn);
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
