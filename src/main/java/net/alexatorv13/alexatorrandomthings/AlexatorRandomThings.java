package net.alexatorv13.alexatorrandomthings;

import net.alexatorv13.alexatorrandomthings.block.ModBlocks;

import net.alexatorv13.alexatorrandomthings.block.entity.ModBlockEntities;
import net.alexatorv13.alexatorrandomthings.item.ModItemGroups;
import net.alexatorv13.alexatorrandomthings.item.ModItems;

import net.alexatorv13.alexatorrandomthings.screen.ModScreenHandlers;
import net.alexatorv13.alexatorrandomthings.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlexatorRandomThings implements ModInitializer {
	public static final String MOD_ID = "alexatorrandomthings";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), new Block[]{ModBlocks.MIKUDOLL});
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), new Block[]{ModBlocks.MIKUSTATUE});
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), new Block[]{ModBlocks.LETTUCE_CROP});
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), new Block[]{ModBlocks.TOMATO_CROP});
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), new Block[]{ModBlocks.ONION_CROP});
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), new Block[]{ModBlocks.PICKLE_CROP});
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), new Block[]{ModBlocks.MUSTARD_CROP});
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
		ModLootTableModifiers.modifyLootTable();
		ModScreenHandlers.registerScreenHandlers();
	}
}