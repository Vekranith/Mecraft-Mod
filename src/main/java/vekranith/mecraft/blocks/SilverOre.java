package vekranith.mecraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SilverOre extends BlockBase 
{

	public SilverOre(String name, Material material) 
	{
		
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(4.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(0.0f);
		setLightOpacity(0);
		//setBlockUnbreakable();
		
	}
	
}