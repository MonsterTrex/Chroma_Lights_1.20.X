package net.monstertrex.chromalights.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.monstertrex.chromalights.ChromaLightsMod;
import net.monstertrex.chromalights.block.ModBlocks;

public class ModItemGroup {

    public static final ItemGroup CHROMA_LIGHTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ChromaLightsMod.MOD_ID, "chroma_lights_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.chroma_lights_group"))
                    .icon(() -> new ItemStack(ModBlocks.BLUE_GLOWSTONE)).entries((displayContext, entries) -> {
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

                    }).build());

    public static void registerItemGroups(){

    }
}
