package net.thedarkgamer.fabrictest;

import net.fabricmc.api.ModInitializer;
import net.thedarkgamer.fabrictest.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FabricTest implements ModInitializer {

	public static final String MOD_ID = "fabrictest";
	public static final Logger LOGGER = LogManager.getLogger(FabricTest.MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}
