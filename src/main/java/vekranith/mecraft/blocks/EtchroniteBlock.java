package vekranith.mecraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class EtchroniteBlock extends BlockBase 
{

	public EtchroniteBlock(String name, Material material) 
	{
		
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(3.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.5f);
		setLightOpacity(0);
		//setBlockUnbreakable();
		
	}
	
}
