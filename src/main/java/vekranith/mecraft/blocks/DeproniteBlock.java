package vekranith.mecraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DeproniteBlock extends BlockBase 
{

	public DeproniteBlock(String name, Material material) 
	{
		
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(3.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(1.0f);
		setLightOpacity(0);
		//setBlockUnbreakable();
		
	}
	
}
