package net.monstertrex.chromalights.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.monstertrex.chromalights.ChromaLightsMod;
import net.monstertrex.chromalights.block.ModBlocks;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ChromaLightsMod.MOD_ID, name), item);



    }

    public static void itemGroupFunctional(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.GLOWGLASS);
        entries.add(ModBlocks.WHITE_GLOWGLASS);
        entries.add(ModBlocks.RED_GLOWGLASS);
        entries.add(ModBlocks.ORANGE_GLOWGLASS);
        entries.add(ModBlocks.YELLOW_GLOWGLASS);
        entries.add(ModBlocks.LIME_GLOWGLASS);
        entries.add(ModBlocks.GREEN_GLOWGLASS);
        entries.add(ModBlocks.CYAN_GLOWGLASS);
        entries.add(ModBlocks.LIGHT_BLUE_GLOWGLASS);
        entries.add(ModBlocks.BLUE_GLOWGLASS);
        entries.add(ModBlocks.PURPLE_GLOWGLASS);
        entries.add(ModBlocks.MAGENTA_GLOWGLASS);
        entries.add(ModBlocks.PINK_GLOWGLASS);

        entries.add(ModBlocks.WHITE_GLOWSTONE);
        entries.add(ModBlocks.RED_GLOWSTONE);
        entries.add(ModBlocks.ORANGE_GLOWSTONE);
        entries.add(ModBlocks.YELLOW_GLOWSTONE);
        entries.add(ModBlocks.LIME_GLOWSTONE);
        entries.add(ModBlocks.GREEN_GLOWSTONE);
        entries.add(ModBlocks.CYAN_GLOWSTONE);
        entries.add(ModBlocks.LIGHT_BLUE_GLOWSTONE);
        entries.add(ModBlocks.BLUE_GLOWSTONE);
        entries.add(ModBlocks.PURPLE_GLOWSTONE);
        entries.add(ModBlocks.MAGENTA_GLOWSTONE);
        entries.add(ModBlocks.PINK_GLOWSTONE);

        entries.add(ModBlocks.WHITE_SEA_LANTERN);
        entries.add(ModBlocks.RED_SEA_LANTERN);
        entries.add(ModBlocks.ORANGE_SEA_LANTERN);
        entries.add(ModBlocks.YELLOW_SEA_LANTERN);
        entries.add(ModBlocks.LIME_SEA_LANTERN);
        entries.add(ModBlocks.GREEN_SEA_LANTERN);
        entries.add(ModBlocks.CYAN_SEA_LANTERN);
        entries.add(ModBlocks.LIGHT_BLUE_SEA_LANTERN);
        entries.add(ModBlocks.BLUE_SEA_LANTERN);
        entries.add(ModBlocks.PURPLE_SEA_LANTERN);
        entries.add(ModBlocks.MAGENTA_SEA_LANTERN);
        entries.add(ModBlocks.PINK_SEA_LANTERN);
    }

    public static void itemGroupRedstone(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.WHITE_REDSTONE_LAMP);
        entries.add(ModBlocks.RED_REDSTONE_LAMP);
        entries.add(ModBlocks.ORANGE_REDSTONE_LAMP);
        entries.add(ModBlocks.YELLOW_REDSTONE_LAMP);
        entries.add(ModBlocks.LIME_REDSTONE_LAMP);
        entries.add(ModBlocks.GREEN_REDSTONE_LAMP);
        entries.add(ModBlocks.CYAN_REDSTONE_LAMP);
        entries.add(ModBlocks.LIGHT_BLUE_REDSTONE_LAMP);
        entries.add(ModBlocks.BLUE_REDSTONE_LAMP);
        entries.add(ModBlocks.PURPLE_REDSTONE_LAMP);
        entries.add(ModBlocks.MAGENTA_REDSTONE_LAMP);
        entries.add(ModBlocks.PINK_REDSTONE_LAMP);
    }

    public static void registerModItems() {
        ChromaLightsMod.LOGGER.info("Registering Mod Items for " + ChromaLightsMod.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::itemGroupBuildingBlocks);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(ModItems::itemGroupColoredBlocks);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::itemGroupNatural);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::itemGroupFunctional);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(ModItems::itemGroupRedstone);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::itemGroupTools);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::itemGroupCombat);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::itemGroupFoodAndDrink);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(ModItems::itemGroupSpawnEggs);
    }
}
