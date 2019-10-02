package vekranith.mecraft.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vekranith.mecraft.Main;
import vekranith.mecraft.client.gui.GuiPlayersHandbook;
import vekranith.mecraft.init.ModItems;
import vekranith.mecraft.util.IHasModel;

public class PlayersHandbook extends Item implements IHasModel
{

	protected int maxStackSize = 1;
	
	public PlayersHandbook(String name) 
	{
	
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(Main.mecrafttab);
		
		ModItems.ITEMS.add(this);
		this.setMaxStackSize(maxStackSize);
		
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn)
    {
		if (!player.world.isRemote)
		{
			
				player.sendMessage(new TextComponentString("Open Gui Here."));
		
		} 
		else
		{
			
			Minecraft.getMinecraft().displayGuiScreen(new GuiPlayersHandbook());
			
		}
		
		return new ActionResult<ItemStack>(EnumActionResult.PASS, player.getHeldItem(handIn));
		
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
		
		    tooltip.add("Right Click to Open.");
		    tooltip.add("This is your new bible.");
	    
    }
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.RARE;
    }
	
	@Override
	public void registerModels() 
	{
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
}
