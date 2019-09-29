package vekranith.mecraft.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import vekranith.mecraft.blocks.BasiltBlock;
import vekranith.mecraft.blocks.CopperBlock;
import vekranith.mecraft.blocks.CopperOre;
import vekranith.mecraft.blocks.DeproniteBlock;
import vekranith.mecraft.blocks.DeproniteOre;
import vekranith.mecraft.blocks.EtchroniteBlock;
import vekranith.mecraft.blocks.EtchroniteOre;
import vekranith.mecraft.blocks.PlatinumBlock;
import vekranith.mecraft.blocks.PlatinumOre;
import vekranith.mecraft.blocks.SilverBlock;
import vekranith.mecraft.blocks.SilverOre;

public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block BASILT_BLOCK = new BasiltBlock("basilt_block", Material.ROCK);
	public static final Block COPPER_BLOCK = new CopperBlock("copper_block", Material.IRON);
	public static final Block SILVER_BLOCK = new SilverBlock("silver_block", Material.IRON);
	public static final Block PLATIUNUM_BLOCK = new PlatinumBlock("platinum_block", Material.IRON);
	public static final Block DEPRONITE_BLOCK = new DeproniteBlock("depronite_block", Material.IRON);
	public static final Block ETCHRONITE_BLOCK = new EtchroniteBlock("etchronite_block", Material.IRON);
	
	//Ore
	public static final Block COPPER_ORE = new CopperOre("copper_ore", Material.ROCK);
	public static final Block SILVER_ORE = new SilverOre("silver_ore", Material.ROCK);
	public static final Block PLATINUM_ORE = new PlatinumOre("platinum_ore", Material.ROCK);
	public static final Block DEPRONITE_ORE = new DeproniteOre("depronite_ore", Material.ROCK);
	public static final Block ETCHRONITE_ORE = new EtchroniteOre("etchronite_ore", Material.ROCK);
	
}
