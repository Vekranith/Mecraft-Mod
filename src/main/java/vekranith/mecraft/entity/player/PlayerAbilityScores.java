package vekranith.mecraft.entity.player;

import com.mojang.authlib.GameProfile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class PlayerAbilityScores extends EntityPlayer
{

	private static int STRENGTH;
	private static int DEXTERITY;
	private static int CONSTITUTION;
	private static int INTELLIGENCE;
	private static int WISDOM;
	private static int CHARISMA;
	private static GameProfile GameProfile;
	
	public PlayerAbilityScores(EntityPlayer player, World world, int Str, int Dex, int Con, int Int, int Wis, int Cha, GameProfile gameProfile) 
	{
		
		super(world, gameProfile);
		this.setUniqueId(getUUID(gameProfile));
        Str = STRENGTH;
        Dex = DEXTERITY;
        Con = CONSTITUTION;
        Int = INTELLIGENCE;
        Wis = WISDOM;
        Cha = CHARISMA;
        
	}
	
	@Override
	public boolean isSpectator() {return false;}

	@Override
	public boolean isCreative() {return false;}

	public static int getStrength() {return STRENGTH;}

	public static void setStrength(int strength) {STRENGTH = strength;}

	public static int getDexterity() {return DEXTERITY;}

	public static void setDexterity(int dexterity) {DEXTERITY = dexterity;}

	public static int getConstitution() {return CONSTITUTION;}

	public static void setConstitution(int constitution) {CONSTITUTION = constitution;}

	public static int getIntelligence() {return INTELLIGENCE;}

	public static void setIntelligence(int intelligence) {INTELLIGENCE = intelligence;}

	public static int getWisdom() {return WISDOM;}

	public static void setWisdom(int wisdom) {WISDOM = wisdom;}

	public static int getCharisma() {return CHARISMA;}

	public static void setCharisma(int charisma) {CHARISMA = charisma;}
	
}
