package vekranith.mecraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BasiltBlock extends BlockBase
{

	public BasiltBlock(String name, Material material) 
	{
		
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(2.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 0);
		setLightLevel(0.0f);
		setLightOpacity(0);
		//setBlockUnbreakable();
		
	}
	
}
