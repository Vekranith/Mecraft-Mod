package vekranith.mecraft.items;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

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
import vekranith.mecraft.entity.player.PlayerAbilityScores;
import vekranith.mecraft.init.ModItems;
import vekranith.mecraft.util.IHasModel;

public class ItemAssessor extends Item implements IHasModel
{

	protected int maxStackSize = 1;
	public static int max = 9;
	public static int value;
	Random rand = new Random(); 
	
	public ItemAssessor(String name) 
	{
	
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(Main.mecrafttab);
		
		ModItems.ITEMS.add(this);
		this.setMaxStackSize(maxStackSize);
		
	}
	
	public int setScore(Random rand)
	{
		
		value = rand.nextInt(max) + 8;
		
		return value;
		
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn)
    {
		if (!player.world.isRemote)
		{
			
			if (PlayerAbilityScores.getStrength() != 0 && PlayerAbilityScores.getDexterity() != 0 && PlayerAbilityScores.getConstitution() != 0 
					&& PlayerAbilityScores.getIntelligence() != 0 && PlayerAbilityScores.getWisdom() != 0 && PlayerAbilityScores.getCharisma() != 0)
			{
				
				player.sendMessage(new TextComponentString("Fate has already decided."));
			
			}
			if (PlayerAbilityScores.getStrength() == 0 && PlayerAbilityScores.getDexterity() == 0 && PlayerAbilityScores.getConstitution() == 0 
					&& PlayerAbilityScores.getIntelligence() == 0 && PlayerAbilityScores.getWisdom() == 0 && PlayerAbilityScores.getCharisma() == 0)
			{
				
				setScore(rand);
				PlayerAbilityScores.setStrength(value);
				setScore(rand);
				PlayerAbilityScores.setDexterity(value);
				setScore(rand);
				PlayerAbilityScores.setConstitution(value);
				setScore(rand);
				PlayerAbilityScores.setIntelligence(value);
				setScore(rand);
				PlayerAbilityScores.setWisdom(value);
				setScore(rand);
				PlayerAbilityScores.setCharisma(value);
				player.sendMessage(new TextComponentString("Fate has decided."));
        	
			}
			
		
		}
		
		return new ActionResult<ItemStack>(EnumActionResult.PASS, player.getHeldItem(handIn));
		
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
		super.addInformation(stack, worldIn, tooltip, flagIn);
		if (PlayerAbilityScores.getStrength() != 0 && PlayerAbilityScores.getDexterity() != 0 && PlayerAbilityScores.getConstitution() != 0 
				&& PlayerAbilityScores.getIntelligence() != 0 && PlayerAbilityScores.getWisdom() != 0 && PlayerAbilityScores.getCharisma() != 0)
		{
			
			tooltip.add("Player Ability Scores:");
		    tooltip.add("Strength: " + PlayerAbilityScores.getStrength());
		    tooltip.add("Dexterity: " + PlayerAbilityScores.getDexterity());
		    tooltip.add("Constitution: " + PlayerAbilityScores.getConstitution());
		    tooltip.add("Intelligence: " + PlayerAbilityScores.getIntelligence());
		    tooltip.add("Wisdom: " + PlayerAbilityScores.getWisdom());
		    tooltip.add("Charisma: " + PlayerAbilityScores.getCharisma());
		
		}
		if (PlayerAbilityScores.getStrength() == 0 && PlayerAbilityScores.getDexterity() == 0 && PlayerAbilityScores.getConstitution() == 0 
				&& PlayerAbilityScores.getIntelligence() == 0 && PlayerAbilityScores.getWisdom() == 0 && PlayerAbilityScores.getCharisma() == 0)
		{

		    tooltip.add("Right Click to Get Assessed.");
		    tooltip.add("This can only be done once per world.");
    	
		}
	    
    }
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }

	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
	    return true;
	}
	
	@Override
	public void registerModels() 
	{
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
}
