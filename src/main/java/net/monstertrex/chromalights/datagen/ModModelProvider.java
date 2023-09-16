package net.monstertrex.chromalights.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.monstertrex.chromalights.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GLOWGLASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_GLOWGLASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_GLOWGLASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_GLOWGLASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_GLOWGLASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_GLOWGLASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_GLOWGLASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_GLOWGLASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_GLOWGLASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_GLOWGLASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_GLOWGLASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_GLOWGLASS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_GLOWGLASS);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_GLOWSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_GLOWSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_GLOWSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_GLOWSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_GLOWSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_GLOWSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_GLOWSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_GLOWSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_GLOWSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_GLOWSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_GLOWSTONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_GLOWSTONE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_SEA_LANTERN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_SEA_LANTERN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_SEA_LANTERN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_SEA_LANTERN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_SEA_LANTERN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_SEA_LANTERN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_SEA_LANTERN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_SEA_LANTERN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_SEA_LANTERN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_SEA_LANTERN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_SEA_LANTERN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_SEA_LANTERN);

        registerBlueRedstoneLamp(blockStateModelGenerator);
        registerCyanRedstoneLamp(blockStateModelGenerator);
        registerGreenRedstoneLamp(blockStateModelGenerator);
        registerLightBlueRedstoneLamp(blockStateModelGenerator);
        registerLimeRedstoneLamp(blockStateModelGenerator);
        registerMagentaRedstoneLamp(blockStateModelGenerator);
        registerOrangeRedstoneLamp(blockStateModelGenerator);
        registerPinkRedstoneLamp(blockStateModelGenerator);
        registerPurpleRedstoneLamp(blockStateModelGenerator);
        registerRedRedstoneLamp(blockStateModelGenerator);
        registerWhiteRedstoneLamp(blockStateModelGenerator);
        registerYellowRedstoneLamp(blockStateModelGenerator);
    }

    //<editor-fold desc="Redstone Lamp Registries">
    private void registerBlueRedstoneLamp(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier identifier = TexturedModel.CUBE_ALL.upload(ModBlocks.BLUE_REDSTONE_LAMP, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = blockStateModelGenerator.createSubModel(ModBlocks.BLUE_REDSTONE_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.BLUE_REDSTONE_LAMP).coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, identifier2, identifier)));}
    private void registerCyanRedstoneLamp(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier identifier = TexturedModel.CUBE_ALL.upload(ModBlocks.CYAN_REDSTONE_LAMP, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = blockStateModelGenerator.createSubModel(ModBlocks.CYAN_REDSTONE_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.CYAN_REDSTONE_LAMP).coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, identifier2, identifier)));}
    private void registerGreenRedstoneLamp(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier identifier = TexturedModel.CUBE_ALL.upload(ModBlocks.GREEN_REDSTONE_LAMP, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = blockStateModelGenerator.createSubModel(ModBlocks.GREEN_REDSTONE_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.GREEN_REDSTONE_LAMP).coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, identifier2, identifier)));}
    private void registerLightBlueRedstoneLamp(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier identifier = TexturedModel.CUBE_ALL.upload(ModBlocks.LIGHT_BLUE_REDSTONE_LAMP, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = blockStateModelGenerator.createSubModel(ModBlocks.LIGHT_BLUE_REDSTONE_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.LIGHT_BLUE_REDSTONE_LAMP).coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, identifier2, identifier)));}
    private void registerLimeRedstoneLamp(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier identifier = TexturedModel.CUBE_ALL.upload(ModBlocks.LIME_REDSTONE_LAMP, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = blockStateModelGenerator.createSubModel(ModBlocks.LIME_REDSTONE_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.LIME_REDSTONE_LAMP).coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, identifier2, identifier)));}
    private void registerMagentaRedstoneLamp(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier identifier = TexturedModel.CUBE_ALL.upload(ModBlocks.MAGENTA_REDSTONE_LAMP, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = blockStateModelGenerator.createSubModel(ModBlocks.MAGENTA_REDSTONE_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.MAGENTA_REDSTONE_LAMP).coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, identifier2, identifier)));}
    private void registerOrangeRedstoneLamp(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier identifier = TexturedModel.CUBE_ALL.upload(ModBlocks.ORANGE_REDSTONE_LAMP, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = blockStateModelGenerator.createSubModel(ModBlocks.ORANGE_REDSTONE_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.ORANGE_REDSTONE_LAMP).coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, identifier2, identifier)));}
    private void registerPinkRedstoneLamp(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier identifier = TexturedModel.CUBE_ALL.upload(ModBlocks.PINK_REDSTONE_LAMP, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = blockStateModelGenerator.createSubModel(ModBlocks.PINK_REDSTONE_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.PINK_REDSTONE_LAMP).coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, identifier2, identifier)));}
    private void registerPurpleRedstoneLamp(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier identifier = TexturedModel.CUBE_ALL.upload(ModBlocks.PURPLE_REDSTONE_LAMP, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = blockStateModelGenerator.createSubModel(ModBlocks.PURPLE_REDSTONE_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.PURPLE_REDSTONE_LAMP).coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, identifier2, identifier)));}
    private void registerRedRedstoneLamp(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier identifier = TexturedModel.CUBE_ALL.upload(ModBlocks.RED_REDSTONE_LAMP, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = blockStateModelGenerator.createSubModel(ModBlocks.RED_REDSTONE_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.RED_REDSTONE_LAMP).coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, identifier2, identifier)));}
    private void registerWhiteRedstoneLamp(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier identifier = TexturedModel.CUBE_ALL.upload(ModBlocks.WHITE_REDSTONE_LAMP, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = blockStateModelGenerator.createSubModel(ModBlocks.WHITE_REDSTONE_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.WHITE_REDSTONE_LAMP).coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, identifier2, identifier)));}
    private void registerYellowRedstoneLamp(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier identifier = TexturedModel.CUBE_ALL.upload(ModBlocks.YELLOW_REDSTONE_LAMP, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = blockStateModelGenerator.createSubModel(ModBlocks.YELLOW_REDSTONE_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.YELLOW_REDSTONE_LAMP).coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, identifier2, identifier)));}
    //</editor-fold>

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
