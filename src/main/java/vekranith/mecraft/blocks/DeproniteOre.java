package vekranith.mecraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DeproniteOre extends BlockBase 
{

	public DeproniteOre(String name, Material material) 
	{
		
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(0.5f);
		setLightOpacity(0);
		//setBlockUnbreakable();
		
	}
	
}
