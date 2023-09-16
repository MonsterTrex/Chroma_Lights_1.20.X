package net.monstertrex.chromalights.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.monstertrex.chromalights.ChromaLightsMod;

public class ModBlocks {

    //<editor-fold desc="Glowglass">
    public static final Block GLOWGLASS = registerBlock("glowglass", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLASS).luminance(15)));
    public static final Block BLUE_GLOWGLASS = registerBlock("blue_glowglass", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLASS).luminance(15)));
    public static final Block CYAN_GLOWGLASS = registerBlock("cyan_glowglass", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLASS).luminance(15)));
    public static final Block GREEN_GLOWGLASS = registerBlock("green_glowglass", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLASS).luminance(15)));
    public static final Block LIGHT_BLUE_GLOWGLASS = registerBlock("light_blue_glowglass", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLASS).luminance(15)));
    public static final Block LIME_GLOWGLASS = registerBlock("lime_glowglass", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLASS).luminance(15)));
    public static final Block MAGENTA_GLOWGLASS = registerBlock("magenta_glowglass", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLASS).luminance(15)));
    public static final Block ORANGE_GLOWGLASS = registerBlock("orange_glowglass", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLASS).luminance(15)));
    public static final Block PINK_GLOWGLASS = registerBlock("pink_glowglass", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLASS).luminance(15)));
    public static final Block PURPLE_GLOWGLASS = registerBlock("purple_glowglass", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLASS).luminance(15)));
    public static final Block RED_GLOWGLASS = registerBlock("red_glowglass", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLASS).luminance(15)));
    public static final Block WHITE_GLOWGLASS = registerBlock("white_glowglass", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLASS).luminance(15)));
    public static final Block YELLOW_GLOWGLASS = registerBlock("yellow_glowglass", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLASS).luminance(15)));
    //</editor-fold>
    
    //<editor-fold desc="Glowstone">
    public static final Block BLUE_GLOWSTONE = registerBlock("blue_glowstone", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLOWSTONE).luminance(15)));
    public static final Block CYAN_GLOWSTONE = registerBlock("cyan_glowstone", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLOWSTONE).luminance(15)));
    public static final Block GREEN_GLOWSTONE = registerBlock("green_glowstone", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLOWSTONE).luminance(15)));
    public static final Block LIGHT_BLUE_GLOWSTONE = registerBlock("light_blue_glowstone", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLOWSTONE).luminance(15)));
    public static final Block LIME_GLOWSTONE = registerBlock("lime_glowstone", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLOWSTONE).luminance(15)));
    public static final Block MAGENTA_GLOWSTONE = registerBlock("magenta_glowstone", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLOWSTONE).luminance(15)));
    public static final Block ORANGE_GLOWSTONE = registerBlock("orange_glowstone", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLOWSTONE).luminance(15)));
    public static final Block PINK_GLOWSTONE = registerBlock("pink_glowstone", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLOWSTONE).luminance(15)));
    public static final Block PURPLE_GLOWSTONE = registerBlock("purple_glowstone", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLOWSTONE).luminance(15)));
    public static final Block RED_GLOWSTONE = registerBlock("red_glowstone", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLOWSTONE).luminance(15)));
    public static final Block WHITE_GLOWSTONE = registerBlock("white_glowstone", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLOWSTONE).luminance(15)));
    public static final Block YELLOW_GLOWSTONE = registerBlock("yellow_glowstone", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.GLOWSTONE).luminance(15)));
    //</editor-fold>

    //<editor-fold desc="Sea Lantern">
    public static final Block BLUE_SEA_LANTERN = registerBlock("blue_sea_lantern", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.SEA_LANTERN).luminance(15)));
    public static final Block CYAN_SEA_LANTERN = registerBlock("cyan_sea_lantern", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.SEA_LANTERN).luminance(15)));
    public static final Block GREEN_SEA_LANTERN = registerBlock("green_sea_lantern", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.SEA_LANTERN).luminance(15)));
    public static final Block LIGHT_BLUE_SEA_LANTERN = registerBlock("light_blue_sea_lantern", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.SEA_LANTERN).luminance(15)));
    public static final Block LIME_SEA_LANTERN = registerBlock("lime_sea_lantern", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.SEA_LANTERN).luminance(15)));
    public static final Block MAGENTA_SEA_LANTERN = registerBlock("magenta_sea_lantern", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.SEA_LANTERN).luminance(15)));
    public static final Block ORANGE_SEA_LANTERN = registerBlock("orange_sea_lantern", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.SEA_LANTERN).luminance(15)));
    public static final Block PINK_SEA_LANTERN = registerBlock("pink_sea_lantern", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.SEA_LANTERN).luminance(15)));
    public static final Block PURPLE_SEA_LANTERN = registerBlock("purple_sea_lantern", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.SEA_LANTERN).luminance(15)));
    public static final Block RED_SEA_LANTERN = registerBlock("red_sea_lantern", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.SEA_LANTERN).luminance(15)));
    public static final Block WHITE_SEA_LANTERN = registerBlock("white_sea_lantern", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.SEA_LANTERN).luminance(15)));
    public static final Block YELLOW_SEA_LANTERN = registerBlock("yellow_sea_lantern", new GlassBlock(FabricBlockSettings
            .copyOf(Blocks.SEA_LANTERN).luminance(15)));
    //</editor-fold>

    //<editor-fold desc="Redstone Lamp">
    public static final Block BLUE_REDSTONE_LAMP = registerBlock("blue_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .copyOf(Blocks.REDSTONE_LAMP).luminance(Blocks.createLightLevelFromLitBlockState(15))));
    public static final Block CYAN_REDSTONE_LAMP = registerBlock("cyan_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .copyOf(Blocks.REDSTONE_LAMP).luminance(Blocks.createLightLevelFromLitBlockState(15))));
    public static final Block GREEN_REDSTONE_LAMP = registerBlock("green_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .copyOf(Blocks.REDSTONE_LAMP).luminance(Blocks.createLightLevelFromLitBlockState(15))));
    public static final Block LIGHT_BLUE_REDSTONE_LAMP = registerBlock("light_blue_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .copyOf(Blocks.REDSTONE_LAMP).luminance(Blocks.createLightLevelFromLitBlockState(15))));
    public static final Block LIME_REDSTONE_LAMP = registerBlock("lime_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .copyOf(Blocks.REDSTONE_LAMP).luminance(Blocks.createLightLevelFromLitBlockState(15))));
    public static final Block MAGENTA_REDSTONE_LAMP = registerBlock("magenta_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .copyOf(Blocks.REDSTONE_LAMP).luminance(Blocks.createLightLevelFromLitBlockState(15))));
    public static final Block ORANGE_REDSTONE_LAMP = registerBlock("orange_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .copyOf(Blocks.REDSTONE_LAMP).luminance(Blocks.createLightLevelFromLitBlockState(15))));
    public static final Block PINK_REDSTONE_LAMP = registerBlock("pink_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .copyOf(Blocks.REDSTONE_LAMP).luminance(Blocks.createLightLevelFromLitBlockState(15))));
    public static final Block PURPLE_REDSTONE_LAMP = registerBlock("purple_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .copyOf(Blocks.REDSTONE_LAMP).luminance(Blocks.createLightLevelFromLitBlockState(15))));
    public static final Block RED_REDSTONE_LAMP = registerBlock("red_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .copyOf(Blocks.REDSTONE_LAMP).luminance(Blocks.createLightLevelFromLitBlockState(15))));
    public static final Block WHITE_REDSTONE_LAMP = registerBlock("white_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .copyOf(Blocks.REDSTONE_LAMP).luminance(Blocks.createLightLevelFromLitBlockState(15))));
    public static final Block YELLOW_REDSTONE_LAMP = registerBlock("yellow_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings
            .copyOf(Blocks.REDSTONE_LAMP).luminance(Blocks.createLightLevelFromLitBlockState(15))));
    //</editor-fold>



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ChromaLightsMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ChromaLightsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        ChromaLightsMod.LOGGER.info("Registering ModBlocks for " + ChromaLightsMod.MOD_ID);
    }
}
