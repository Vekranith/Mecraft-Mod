package vekranith.mecraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import vekranith.mecraft.Main;
import vekranith.mecraft.init.ModBlocks;
import vekranith.mecraft.init.ModItems;
import vekranith.mecraft.util.IHasModel;

public class BlockBase extends Block implements IHasModel
{

	public BlockBase(String name, Material material)
	{
		
		super(material);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void registerModels() 
	{
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
	
}