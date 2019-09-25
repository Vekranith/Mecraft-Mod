package vekranith.mecraft.item;

import vekranith.mecraft.Mecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCopperCoin extends Item {

	public ItemCopperCoin(String unlocalizedName, String registryName) {
		setTranslationKey(Mecraft.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.MISC);
	}
	
}
