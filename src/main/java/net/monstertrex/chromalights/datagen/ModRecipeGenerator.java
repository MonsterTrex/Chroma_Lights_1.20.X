package net.monstertrex.chromalights.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.monstertrex.chromalights.block.ModBlocks;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLOWGLASS).group("glowglass")
                .pattern(" X ")
                .pattern("XYX")
                .pattern(" X ")
                .input('X', Items.GLOWSTONE_DUST)
                .input('Y', Blocks.GLASS)
                .criterion(hasItem(Items.GLOWSTONE_DUST), conditionsFromItem(Items.GLOWSTONE_DUST))
                .criterion(hasItem(Blocks.GLASS), conditionsFromItem(Blocks.GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GLOWGLASS)));
        offerGlowglassDyeingRecipe(exporter, ModBlocks.WHITE_GLOWGLASS, Items.WHITE_DYE);
        offerGlowglassDyeingRecipe(exporter, ModBlocks.RED_GLOWGLASS, Items.RED_DYE);
        offerGlowglassDyeingRecipe(exporter, ModBlocks.ORANGE_GLOWGLASS, Items.ORANGE_DYE);
        offerGlowglassDyeingRecipe(exporter, ModBlocks.YELLOW_GLOWGLASS, Items.YELLOW_DYE);
        offerGlowglassDyeingRecipe(exporter, ModBlocks.LIME_GLOWGLASS, Items.LIME_DYE);
        offerGlowglassDyeingRecipe(exporter, ModBlocks.GREEN_GLOWGLASS, Items.GREEN_DYE);
        offerGlowglassDyeingRecipe(exporter, ModBlocks.CYAN_GLOWGLASS, Items.CYAN_DYE);
        offerGlowglassDyeingRecipe(exporter, ModBlocks.LIGHT_BLUE_GLOWGLASS, Items.LIGHT_BLUE_DYE);
        offerGlowglassDyeingRecipe(exporter, ModBlocks.BLUE_GLOWGLASS, Items.BLUE_DYE);
        offerGlowglassDyeingRecipe(exporter, ModBlocks.PURPLE_GLOWGLASS, Items.PURPLE_DYE);
        offerGlowglassDyeingRecipe(exporter, ModBlocks.MAGENTA_GLOWGLASS, Items.MAGENTA_DYE);
        offerGlowglassDyeingRecipe(exporter, ModBlocks.PINK_GLOWGLASS, Items.PINK_DYE);

        offerGlowstoneDyeingRecipe(exporter, ModBlocks.WHITE_GLOWSTONE, Items.WHITE_DYE);
        offerGlowstoneDyeingRecipe(exporter, ModBlocks.RED_GLOWSTONE, Items.RED_DYE);
        offerGlowstoneDyeingRecipe(exporter, ModBlocks.ORANGE_GLOWSTONE, Items.ORANGE_DYE);
        offerGlowstoneDyeingRecipe(exporter, ModBlocks.YELLOW_GLOWSTONE, Items.YELLOW_DYE);
        offerGlowstoneDyeingRecipe(exporter, ModBlocks.LIME_GLOWSTONE, Items.LIME_DYE);
        offerGlowstoneDyeingRecipe(exporter, ModBlocks.GREEN_GLOWSTONE, Items.GREEN_DYE);
        offerGlowstoneDyeingRecipe(exporter, ModBlocks.CYAN_GLOWSTONE, Items.CYAN_DYE);
        offerGlowstoneDyeingRecipe(exporter, ModBlocks.LIGHT_BLUE_GLOWSTONE, Items.LIGHT_BLUE_DYE);
        offerGlowstoneDyeingRecipe(exporter, ModBlocks.BLUE_GLOWSTONE, Items.BLUE_DYE);
        offerGlowstoneDyeingRecipe(exporter, ModBlocks.PURPLE_GLOWSTONE, Items.PURPLE_DYE);
        offerGlowstoneDyeingRecipe(exporter, ModBlocks.MAGENTA_GLOWSTONE, Items.MAGENTA_DYE);
        offerGlowstoneDyeingRecipe(exporter, ModBlocks.PINK_GLOWSTONE, Items.PINK_DYE);

        offerSeaLanternDyeingRecipe(exporter, ModBlocks.WHITE_SEA_LANTERN, Items.WHITE_DYE);
        offerSeaLanternDyeingRecipe(exporter, ModBlocks.RED_SEA_LANTERN, Items.RED_DYE);
        offerSeaLanternDyeingRecipe(exporter, ModBlocks.ORANGE_SEA_LANTERN, Items.ORANGE_DYE);
        offerSeaLanternDyeingRecipe(exporter, ModBlocks.YELLOW_SEA_LANTERN, Items.YELLOW_DYE);
        offerSeaLanternDyeingRecipe(exporter, ModBlocks.LIME_SEA_LANTERN, Items.LIME_DYE);
        offerSeaLanternDyeingRecipe(exporter, ModBlocks.GREEN_SEA_LANTERN, Items.GREEN_DYE);
        offerSeaLanternDyeingRecipe(exporter, ModBlocks.CYAN_SEA_LANTERN, Items.CYAN_DYE);
        offerSeaLanternDyeingRecipe(exporter, ModBlocks.LIGHT_BLUE_SEA_LANTERN, Items.LIGHT_BLUE_DYE);
        offerSeaLanternDyeingRecipe(exporter, ModBlocks.BLUE_SEA_LANTERN, Items.BLUE_DYE);
        offerSeaLanternDyeingRecipe(exporter, ModBlocks.PURPLE_SEA_LANTERN, Items.PURPLE_DYE);
        offerSeaLanternDyeingRecipe(exporter, ModBlocks.MAGENTA_SEA_LANTERN, Items.MAGENTA_DYE);
        offerSeaLanternDyeingRecipe(exporter, ModBlocks.PINK_SEA_LANTERN, Items.PINK_DYE);

        offerRedstoneLampDyeingRecipe(exporter, ModBlocks.WHITE_REDSTONE_LAMP, Items.WHITE_DYE);
        offerRedstoneLampDyeingRecipe(exporter, ModBlocks.RED_REDSTONE_LAMP, Items.RED_DYE);
        offerRedstoneLampDyeingRecipe(exporter, ModBlocks.ORANGE_REDSTONE_LAMP, Items.ORANGE_DYE);
        offerRedstoneLampDyeingRecipe(exporter, ModBlocks.YELLOW_REDSTONE_LAMP, Items.YELLOW_DYE);
        offerRedstoneLampDyeingRecipe(exporter, ModBlocks.LIME_REDSTONE_LAMP, Items.LIME_DYE);
        offerRedstoneLampDyeingRecipe(exporter, ModBlocks.GREEN_REDSTONE_LAMP, Items.GREEN_DYE);
        offerRedstoneLampDyeingRecipe(exporter, ModBlocks.CYAN_REDSTONE_LAMP, Items.CYAN_DYE);
        offerRedstoneLampDyeingRecipe(exporter, ModBlocks.LIGHT_BLUE_REDSTONE_LAMP, Items.LIGHT_BLUE_DYE);
        offerRedstoneLampDyeingRecipe(exporter, ModBlocks.BLUE_REDSTONE_LAMP, Items.BLUE_DYE);
        offerRedstoneLampDyeingRecipe(exporter, ModBlocks.PURPLE_REDSTONE_LAMP, Items.PURPLE_DYE);
        offerRedstoneLampDyeingRecipe(exporter, ModBlocks.MAGENTA_REDSTONE_LAMP, Items.MAGENTA_DYE);
        offerRedstoneLampDyeingRecipe(exporter, ModBlocks.PINK_REDSTONE_LAMP, Items.PINK_DYE);

    }

    public static void offerGlowglassDyeingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output).input(ModBlocks.GLOWGLASS).input(input).group("dyed_glowglass").criterion(RecipeProvider.hasItem(ModBlocks.GLOWGLASS), RecipeProvider.conditionsFromItem(ModBlocks.GLOWGLASS)).offerTo(exporter);}
    public static void offerGlowstoneDyeingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output).input(Blocks.GLOWSTONE).input(input).group("dyed_glowstone").criterion(RecipeProvider.hasItem(Blocks.GLOWSTONE), RecipeProvider.conditionsFromItem(Blocks.GLOWSTONE)).offerTo(exporter);}
    public static void offerSeaLanternDyeingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output).input(Blocks.SEA_LANTERN).input(input).group("dyed_sea_lantern").criterion(RecipeProvider.hasItem(Blocks.SEA_LANTERN), RecipeProvider.conditionsFromItem(Blocks.SEA_LANTERN)).offerTo(exporter);}
    public static void offerRedstoneLampDyeingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output).input(Blocks.REDSTONE_LAMP).input(input).group("dyed_redstone_lamp").criterion(RecipeProvider.hasItem(Blocks.REDSTONE_LAMP), RecipeProvider.conditionsFromItem(Blocks.REDSTONE_LAMP)).offerTo(exporter);}

}
