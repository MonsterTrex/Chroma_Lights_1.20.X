package net.monstertrex.chromalights.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.LimitCountLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.operator.BoundedIntUnaryOperator;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.monstertrex.chromalights.block.ModBlocks;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.GLOWGLASS, glowglassDrops(ModBlocks.GLOWGLASS));
        addDrop(ModBlocks.WHITE_GLOWGLASS, glowglassDrops(ModBlocks.WHITE_GLOWGLASS));
        addDrop(ModBlocks.RED_GLOWGLASS, glowglassDrops(ModBlocks.RED_GLOWGLASS));
        addDrop(ModBlocks.ORANGE_GLOWGLASS, glowglassDrops(ModBlocks.ORANGE_GLOWGLASS));
        addDrop(ModBlocks.YELLOW_GLOWGLASS, glowglassDrops(ModBlocks.YELLOW_GLOWGLASS));
        addDrop(ModBlocks.LIME_GLOWGLASS, glowglassDrops(ModBlocks.LIME_GLOWGLASS));
        addDrop(ModBlocks.GREEN_GLOWGLASS, glowglassDrops(ModBlocks.GREEN_GLOWGLASS));
        addDrop(ModBlocks.CYAN_GLOWGLASS, glowglassDrops(ModBlocks.CYAN_GLOWGLASS));
        addDrop(ModBlocks.LIGHT_BLUE_GLOWGLASS, glowglassDrops(ModBlocks.LIGHT_BLUE_GLOWGLASS));
        addDrop(ModBlocks.BLUE_GLOWGLASS, glowglassDrops(ModBlocks.BLUE_GLOWGLASS));
        addDrop(ModBlocks.PURPLE_GLOWGLASS, glowglassDrops(ModBlocks.PURPLE_GLOWGLASS));
        addDrop(ModBlocks.MAGENTA_GLOWGLASS, glowglassDrops(ModBlocks.MAGENTA_GLOWGLASS));
        addDrop(ModBlocks.PINK_GLOWGLASS, glowglassDrops(ModBlocks.PINK_GLOWGLASS));

        addDrop(ModBlocks.WHITE_GLOWSTONE, glowstoneDrops(ModBlocks.WHITE_GLOWSTONE));
        addDrop(ModBlocks.RED_GLOWSTONE, glowstoneDrops(ModBlocks.RED_GLOWSTONE));
        addDrop(ModBlocks.ORANGE_GLOWSTONE, glowstoneDrops(ModBlocks.ORANGE_GLOWSTONE));
        addDrop(ModBlocks.YELLOW_GLOWSTONE, glowstoneDrops(ModBlocks.YELLOW_GLOWSTONE));
        addDrop(ModBlocks.LIME_GLOWSTONE, glowstoneDrops(ModBlocks.LIME_GLOWSTONE));
        addDrop(ModBlocks.GREEN_GLOWSTONE, glowstoneDrops(ModBlocks.GREEN_GLOWSTONE));
        addDrop(ModBlocks.CYAN_GLOWSTONE, glowstoneDrops(ModBlocks.CYAN_GLOWSTONE));
        addDrop(ModBlocks.LIGHT_BLUE_GLOWSTONE, glowstoneDrops(ModBlocks.LIGHT_BLUE_GLOWSTONE));
        addDrop(ModBlocks.BLUE_GLOWSTONE, glowstoneDrops(ModBlocks.BLUE_GLOWSTONE));
        addDrop(ModBlocks.PURPLE_GLOWSTONE, glowstoneDrops(ModBlocks.PURPLE_GLOWSTONE));
        addDrop(ModBlocks.MAGENTA_GLOWSTONE, glowstoneDrops(ModBlocks.MAGENTA_GLOWSTONE));
        addDrop(ModBlocks.PINK_GLOWSTONE, glowstoneDrops(ModBlocks.PINK_GLOWSTONE));

        addDrop(ModBlocks.WHITE_SEA_LANTERN, seaLanternDrops(ModBlocks.WHITE_SEA_LANTERN));
        addDrop(ModBlocks.RED_SEA_LANTERN, seaLanternDrops(ModBlocks.RED_SEA_LANTERN));
        addDrop(ModBlocks.ORANGE_SEA_LANTERN, seaLanternDrops(ModBlocks.ORANGE_SEA_LANTERN));
        addDrop(ModBlocks.YELLOW_SEA_LANTERN, seaLanternDrops(ModBlocks.YELLOW_SEA_LANTERN));
        addDrop(ModBlocks.LIME_SEA_LANTERN, seaLanternDrops(ModBlocks.LIME_SEA_LANTERN));
        addDrop(ModBlocks.GREEN_SEA_LANTERN, seaLanternDrops(ModBlocks.GREEN_SEA_LANTERN));
        addDrop(ModBlocks.CYAN_SEA_LANTERN, seaLanternDrops(ModBlocks.CYAN_SEA_LANTERN));
        addDrop(ModBlocks.LIGHT_BLUE_SEA_LANTERN, seaLanternDrops(ModBlocks.LIGHT_BLUE_SEA_LANTERN));
        addDrop(ModBlocks.BLUE_SEA_LANTERN, seaLanternDrops(ModBlocks.BLUE_SEA_LANTERN));
        addDrop(ModBlocks.PURPLE_SEA_LANTERN, seaLanternDrops(ModBlocks.PURPLE_SEA_LANTERN));
        addDrop(ModBlocks.MAGENTA_SEA_LANTERN, seaLanternDrops(ModBlocks.MAGENTA_SEA_LANTERN));
        addDrop(ModBlocks.PINK_SEA_LANTERN, seaLanternDrops(ModBlocks.PINK_SEA_LANTERN));

        addDrop(ModBlocks.WHITE_REDSTONE_LAMP);
        addDrop(ModBlocks.RED_REDSTONE_LAMP);
        addDrop(ModBlocks.ORANGE_REDSTONE_LAMP);
        addDrop(ModBlocks.YELLOW_REDSTONE_LAMP);
        addDrop(ModBlocks.LIME_REDSTONE_LAMP);
        addDrop(ModBlocks.GREEN_REDSTONE_LAMP);
        addDrop(ModBlocks.CYAN_REDSTONE_LAMP);
        addDrop(ModBlocks.LIGHT_BLUE_REDSTONE_LAMP);
        addDrop(ModBlocks.BLUE_REDSTONE_LAMP);
        addDrop(ModBlocks.PURPLE_REDSTONE_LAMP);
        addDrop(ModBlocks.MAGENTA_REDSTONE_LAMP);
        addDrop(ModBlocks.PINK_REDSTONE_LAMP);




    }

    public LootTable.Builder glowglassDrops(Block drop) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop,
                (LootPoolEntry.Builder) this.applyExplosionDecay(drop, ((LeafEntry.Builder)((ItemEntry.builder(Items.GLOWSTONE_DUST)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f))))
                        .apply(ApplyBonusLootFunction.uniformBonusCount(Enchantments.FORTUNE)))
                        .apply(LimitCountLootFunction.builder(BoundedIntUnaryOperator.create(1, 4))))));}
    public LootTable.Builder glowstoneDrops(Block drop) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop,
                (LootPoolEntry.Builder) this.applyExplosionDecay(drop, ((LeafEntry.Builder)((ItemEntry.builder(Items.GLOWSTONE_DUST)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f))))
                        .apply(ApplyBonusLootFunction.uniformBonusCount(Enchantments.FORTUNE)))
                        .apply(LimitCountLootFunction.builder(BoundedIntUnaryOperator.create(1, 4))))));}
    public LootTable.Builder seaLanternDrops(Block drop) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop,
                (LootPoolEntry.Builder) this.applyExplosionDecay(drop, ((LeafEntry.Builder)((ItemEntry.builder(Items.PRISMARINE_CRYSTALS)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 3.0f))))
                        .apply(ApplyBonusLootFunction.uniformBonusCount(Enchantments.FORTUNE)))
                        .apply(LimitCountLootFunction.builder(BoundedIntUnaryOperator.create(1, 5))))));}

}
