package vekranith.mecraft.init;

import vekranith.mecraft.Mecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(Mecraft.MODID)

public class ModItems {

	public static final Item COPPER_COIN = null;
	
	@EventBusSubscriber(modid = Mecraft.MODID)
	public static class RegistrationHandler {
	
		@SubscribeEvent
		public static void registerItems(Register<Item> event) {
		final Item[] items = {
				new Item().setRegistryName(Mecraft.MODID, "COPPER_COIN").setTranslationKey(Mecraft.MODID + "." + "copper_coin").setCreativeTab(CreativeTabs.MISC)
			};
		
			event.getRegistry().registerAll(items);
		}
	}
	
}
