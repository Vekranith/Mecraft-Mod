package vekranith.mecraft;

import vekranith.mecraft.Mecraft;
import vekranith.mecraft.block.BlockCopperOre;
import vekranith.mecraft.block.BlockDeproniteOre;
import vekranith.mecraft.init.ModBlocks;
import vekranith.mecraft.item.ItemCopperCoin;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Mecraft.MODID)
public class EventSubscriber {

	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = {
				new BlockCopperOre(Material.IRON, SoundType.STONE, "blockCopperOre", "copper_ore"),
				new BlockDeproniteOre(Material.IRON, SoundType.STONE, "blockDeproniteOre", "depronite_ore"),
		};
		
		event.getRegistry().registerAll(blocks);
	}
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				new ItemCopperCoin("itemCopperCoin", "copper_coin"),
				};
	
		final Item[] itemBlocks = {
				new ItemBlock(ModBlocks.COPPER_ORE).setRegistryName(ModBlocks.COPPER_ORE.getRegistryName()),
				new ItemBlock(ModBlocks.DEPRONITE_ORE).setRegistryName(ModBlocks.DEPRONITE_ORE.getRegistryName()),
		};
		
		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
		
	}
	
	
}
