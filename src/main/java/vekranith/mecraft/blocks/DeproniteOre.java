package vekranith.mecraft.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import vekranith.mecraft.init.ModItems;

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
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		
		return ModItems.DEPRONITE_DUST;
		
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		
		int max = 4;
		int min = 1;
		return rand.nextInt(max) + min;
		
	}
	
}
