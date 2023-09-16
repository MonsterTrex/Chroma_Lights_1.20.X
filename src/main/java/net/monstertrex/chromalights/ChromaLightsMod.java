package net.monstertrex.chromalights;

import net.fabricmc.api.ModInitializer;

import net.monstertrex.chromalights.block.ModBlocks;
import net.monstertrex.chromalights.item.ModItemGroup;
import net.monstertrex.chromalights.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChromaLightsMod implements ModInitializer {
	public static final String MOD_ID = "chromalights";
    public static final Logger LOGGER = LoggerFactory.getLogger("chromalights");

	@Override
	public void onInitialize() {

		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}