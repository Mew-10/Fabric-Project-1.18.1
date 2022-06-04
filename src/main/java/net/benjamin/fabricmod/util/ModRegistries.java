package net.benjamin.fabricmod.util;

import net.benjamin.fabricmod.FabricMod;
import net.benjamin.fabricmod.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }


    private static void registerFuels() {
        FabricMod.LOGGER.info("Registering Fuels for " + FabricMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.LILAC_FLOWER_BULB, 200);
    }
}