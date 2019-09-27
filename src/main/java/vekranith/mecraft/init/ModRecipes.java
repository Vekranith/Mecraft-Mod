package vekranith.mecraft.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{

	public static void init() 
	{
		
		//Items
		GameRegistry.addSmelting(ModItems.COPPER_DUST, new ItemStack(ModItems.COPPER_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(ModItems.SILVER_DUST, new ItemStack(ModItems.SILVER_INGOT, 1), 2.0f);
		GameRegistry.addSmelting(ModItems.PLATINUM_DUST, new ItemStack(ModItems.PLATINUM_INGOT, 1), 2.5f);
		
		//Blocks
		GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.SILVER_ORE, new ItemStack(ModItems.SILVER_INGOT, 1), 2.0f);
		GameRegistry.addSmelting(ModBlocks.PLATINUM_ORE, new ItemStack(ModItems.PLATINUM_INGOT, 1), 2.5f);
		
	}
	
}
