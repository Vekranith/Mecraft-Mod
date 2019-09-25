package vekranith.mecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import vekranith.mecraft.Mecraft;

public class BlockDeproniteOre extends Block {

	public BlockDeproniteOre(Material material, SoundType sound, String unlocalizedName, String registryName) {
		super(Material.IRON);
		setTranslationKey(Mecraft.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.MISC);
		setSoundType(SoundType.STONE);
	}
}