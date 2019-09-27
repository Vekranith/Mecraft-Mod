package vekranith.mecraft.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import vekranith.mecraft.items.ItemBase;
import vekranith.mecraft.items.tools.ToolAxe;
import vekranith.mecraft.items.tools.ToolHoe;
import vekranith.mecraft.items.tools.ToolPickaxe;
import vekranith.mecraft.items.tools.ToolSpade;
import vekranith.mecraft.items.tools.ToolSword;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_COPPER = EnumHelper.addToolMaterial("material_copper", 2, 125, 5.0f, 1.5f, 8);
	public static final ToolMaterial MATERIAL_SILVER = EnumHelper.addToolMaterial("material_silver", 2, 750, 7.0f, 2.5f, 12);
	public static final ToolMaterial MATERIAL_PLATINUM = EnumHelper.addToolMaterial("material_platinum", 3, 1000, 7.0f, 2.5f, 14);
	
	//Items
	public static final Item COPPER_COIN = new ItemBase("copper_coin");
	public static final Item COPPER_DUST = new ItemBase("copper_dust");
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item COPPER_NUGGET = new ItemBase("copper_nugget");
	public static final Item DEPRONITE_DUST = new ItemBase("depronite_dust");
	public static final Item DEPRONITE_INGOT = new ItemBase("depronite_ingot");
	public static final Item ETCHRONITE_DUST = new ItemBase("etchronite_dust");
	public static final Item ETCHRONITE_INGOT = new ItemBase("etchronite_ingot");
	public static final Item GOLD_COIN = new ItemBase("gold_coin");
	public static final Item PLATINUM_COIN = new ItemBase("platinum_coin");
	public static final Item PLATINUM_DUST = new ItemBase("platinum_dust");
	public static final Item PLATINUM_INGOT = new ItemBase("platinum_ingot");
	public static final Item PLATINUM_NUGGET = new ItemBase("platinum_nugget");
	public static final Item SILVER_COIN = new ItemBase("silver_coin");
	public static final Item SILVER_DUST = new ItemBase("silver_dust");
	public static final Item SILVER_INGOT = new ItemBase("silver_ingot");
	public static final Item SILVER_NUGGET = new ItemBase("silver_nugget");
	
	//Tools
	public static final ItemSword COPPER_SWORD = new ToolSword("copper_sword", MATERIAL_COPPER);
	public static final ItemSpade COPPER_SHOVEL = new ToolSpade("copper_shovel", MATERIAL_COPPER);
	public static final ItemPickaxe COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", MATERIAL_COPPER);
	public static final ItemAxe COPPER_AXE = new ToolAxe("copper_axe", MATERIAL_COPPER);
	public static final ItemHoe COPPER_HOE = new ToolHoe("copper_hoe", MATERIAL_COPPER);
	
	public static final ItemSword SILVER_SWORD = new ToolSword("silver_sword", MATERIAL_SILVER);
	
	public static final ItemSword PLATINUM_SWORD = new ToolSword("platinum_sword", MATERIAL_PLATINUM);
	
}
