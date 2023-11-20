package net.alexatorv13.alexatorrandomthings;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlexatorRandomThings implements ModInitializer {
	public static final String MOD_ID = "alexatorrandomthings";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}