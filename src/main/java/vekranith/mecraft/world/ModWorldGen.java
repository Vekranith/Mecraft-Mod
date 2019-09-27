package vekranith.mecraft.world;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import vekranith.mecraft.init.ModBlocks;

public class ModWorldGen implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
	
		if (world.provider.getDimension() == 0)
		{
			
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
			
		}
		
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{

		generateOre(ModBlocks.COPPER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 30, 55, random.nextInt(7) + 4, 10);
		generateOre(ModBlocks.SILVER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 15, 35, random.nextInt(7) + 4, 8);
		generateOre(ModBlocks.PLATINUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 20, random.nextInt(7) + 4, 5);
		generateOre(ModBlocks.DEPRONITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 30, random.nextInt(7) + 4, 5);
		generateOre(ModBlocks.ETCHRONITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 15, 40, random.nextInt(7) + 4, 8);
		generateOre(ModBlocks.BASILT_BLOCK.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 50, random.nextInt(20) + 4, 15);
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances)
	{
		
		int deltaY = maxY - minY;
		
		for (int i = 0; i < chances; i++)
		{
			
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
			
		}
		
	}
	
}
