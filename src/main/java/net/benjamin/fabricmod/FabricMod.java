package net.benjamin.fabricmod;

import net.benjamin.fabricmod.block.ModBlocks;
import net.benjamin.fabricmod.item.ModItems;
import net.benjamin.fabricmod.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FabricMod implements ModInitializer {
	public static final String MOD_ID = "fabricmod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

	}
}