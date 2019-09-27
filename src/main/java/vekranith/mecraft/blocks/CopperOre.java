package vekranith.mecraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CopperOre extends BlockBase 
{

	public CopperOre(String name, Material material) 
	{
		
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(2.5f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(0.0f);
		setLightOpacity(0);
		//setBlockUnbreakable();
		
	}
	
}
