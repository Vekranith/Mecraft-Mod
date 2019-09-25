package vekranith.mecraft.block;

import vekranith.mecraft.Mecraft;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCopperOre extends Block {

	public BlockCopperOre(Material material, SoundType sound, String unlocalizedName, String registryName) {
		super(Material.IRON);
		setTranslationKey(Mecraft.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.MISC);
		setSoundType(SoundType.STONE);
	}
	
}
