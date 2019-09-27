package vekranith.mecraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PlatinumBlock extends BlockBase 
{

	public PlatinumBlock(String name, Material material) 
	{
		
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.5f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.0f);
		setLightOpacity(0);
		//setBlockUnbreakable();
		
	}
	
}
