package vekranith.mecraft.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import vekranith.mecraft.items.ItemAssessor;
import vekranith.mecraft.items.ItemBase;
import vekranith.mecraft.items.PlayersHandbook;
import vekranith.mecraft.items.armor.ArmorBase;
import vekranith.mecraft.items.tools.ToolAxe;
import vekranith.mecraft.items.tools.ToolHoe;
import vekranith.mecraft.items.tools.ToolPickaxe;
import vekranith.mecraft.items.tools.ToolSpade;
import vekranith.mecraft.items.tools.ToolSword;
import vekranith.mecraft.util.Reference;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_COPPER = EnumHelper.addToolMaterial("material_copper", 1, 125, 5.0f, 1.5f, 8);
	public static final ToolMaterial MATERIAL_SILVER = EnumHelper.addToolMaterial("material_silver", 2, 750, 7.0f, 2.0f, 15);
	public static final ToolMaterial MATERIAL_PLATINUM = EnumHelper.addToolMaterial("material_platinum", 3, 1000, 8.0f, 2.5f, 12);
	
	public static final ArmorMaterial ARMOR_MATERIAL_COPPER = EnumHelper.addArmorMaterial("armor_material_copper", Reference.MODID + ":copper", 13, new int[] {2, 4, 5, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_SILVER = EnumHelper.addArmorMaterial("armor_material_silver", Reference.MODID + ":silver", 20, new int[] {2, 5, 7, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_PLATINUM = EnumHelper.addArmorMaterial("armor_material_platinum", Reference.MODID + ":platinum", 27, new int[] {3, 5, 7, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	
	//Items
	public static final Item COPPER_COIN = new ItemBase("copper_coin");
	public static final Item SILVER_COIN = new ItemBase("silver_coin");
	public static final Item GOLD_COIN = new ItemBase("gold_coin");
	public static final Item PLATINUM_COIN = new ItemBase("platinum_coin");

	public static final Item COPPER_DUST = new ItemBase("copper_dust");
	public static final Item SILVER_DUST = new ItemBase("silver_dust");
	public static final Item PLATINUM_DUST = new ItemBase("platinum_dust");
	public static final Item DEPRONITE_DUST = new ItemBase("depronite_dust");
	public static final Item ETCHRONITE_DUST = new ItemBase("etchronite_dust");
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item SILVER_INGOT = new ItemBase("silver_ingot");
	public static final Item PLATINUM_INGOT = new ItemBase("platinum_ingot");
	public static final Item DEPRONITE_INGOT = new ItemBase("depronite_ingot");
	public static final Item ETCHRONITE_INGOT = new ItemBase("etchronite_ingot");
	
	public static final Item COPPER_NUGGET = new ItemBase("copper_nugget");
	public static final Item SILVER_NUGGET = new ItemBase("silver_nugget");
	public static final Item PLATINUM_NUGGET = new ItemBase("platinum_nugget");
	
	//Misc Items
	public static final Item ASSESSOR = new ItemAssessor("assessor");
	public static final Item PLAYERS_HANDBOOK = new PlayersHandbook("players_handbook");
	
	//Tools
	public static final ItemSword COPPER_SWORD = new ToolSword("copper_sword", MATERIAL_COPPER);
	public static final ItemSpade COPPER_SHOVEL = new ToolSpade("copper_shovel", MATERIAL_COPPER);
	public static final ItemPickaxe COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", MATERIAL_COPPER);
	public static final ItemAxe COPPER_AXE = new ToolAxe("copper_axe", MATERIAL_COPPER);
	public static final ItemHoe COPPER_HOE = new ToolHoe("copper_hoe", MATERIAL_COPPER);
	
	public static final ItemSword SILVER_SWORD = new ToolSword("silver_sword", MATERIAL_SILVER);
	public static final ItemSpade SILVER_SHOVEL = new ToolSpade("silver_shovel", MATERIAL_SILVER);
	public static final ItemPickaxe SILVER_PICKAXE = new ToolPickaxe("silver_pickaxe", MATERIAL_SILVER);
	public static final ItemAxe SILVER_AXE = new ToolAxe("silver_axe", MATERIAL_SILVER);
	public static final ItemHoe SILVER_HOE = new ToolHoe("silver_hoe", MATERIAL_SILVER);
	
	public static final ItemSword PLATINUM_SWORD = new ToolSword("platinum_sword", MATERIAL_PLATINUM);
	public static final ItemSpade PLATINUM_SHOVEL = new ToolSpade("platinum_shovel", MATERIAL_PLATINUM);
	public static final ItemPickaxe PLATINUM_PICKAXE = new ToolPickaxe("platinum_pickaxe", MATERIAL_PLATINUM);
	public static final ItemAxe PLATINUM_AXE = new ToolAxe("platinum_axe", MATERIAL_PLATINUM);
	public static final ItemHoe PLATINUM_HOE = new ToolHoe("platinum_hoe", MATERIAL_PLATINUM);
	
	//Armor
	public static final Item COPPER_ARMOR_HEAD = new ArmorBase("copper_armor_head", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item COPPER_ARMOR_BODY = new ArmorBase("copper_armor_body", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item COPPER_ARMOR_LEGGINGS = new ArmorBase("copper_armor_leggings", ARMOR_MATERIAL_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item COPPER_ARMOR_BOOTS = new ArmorBase("copper_armor_boots", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.FEET);
	
	public static final Item SILVER_ARMOR_HEAD = new ArmorBase("silver_armor_head", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.HEAD);
	public static final Item SILVER_ARMOR_BODY = new ArmorBase("silver_armor_body", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.CHEST);
	public static final Item SILVER_ARMOR_LEGGINGS = new ArmorBase("silver_armor_leggings", ARMOR_MATERIAL_SILVER, 2, EntityEquipmentSlot.LEGS);
	public static final Item SILVER_ARMOR_BOOTS = new ArmorBase("silver_armor_boots", ARMOR_MATERIAL_SILVER, 1, EntityEquipmentSlot.FEET);
	
	public static final Item PLATINUM_ARMOR_HEAD = new ArmorBase("platinum_armor_head", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item PLATINUM_ARMOR_BODY = new ArmorBase("platinum_armor_body", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item PLATINUM_ARMOR_LEGGINGS = new ArmorBase("platinum_armor_leggings", ARMOR_MATERIAL_PLATINUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item PLATINUM_ARMOR_BOOTS = new ArmorBase("platinum_armor_boots", ARMOR_MATERIAL_PLATINUM, 1, EntityEquipmentSlot.FEET);
	
}
