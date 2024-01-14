package net.alexatorv13.alexatorrandomthings.block;

import net.alexatorv13.alexatorrandomthings.AlexatorRandomThings;
import net.alexatorv13.alexatorrandomthings.block.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block MIKUDOLL;
    public static final Block MIKUSTATUE;
    public static final Block CASHREGISTER;
    public static final Block TESTSIZE;
    public static final Block LETTUCE_CROP;
    public static final Block ONION_CROP;
    public static final Block TOMATO_CROP;
    public static final Block PICKLE_CROP;
    public static final Block MUSTARD_CROP;



    public ModBlocks() {
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return (Block)Registry.register(Registries.BLOCK, new Identifier("alexatorrandomthings", name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return (Item)Registry.register(Registries.ITEM, new Identifier("alexatorrandomthings", name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        AlexatorRandomThings.LOGGER.info("Registering Mod Blocks foralexatorrandomthings");
    }

    static {
        MIKUDOLL = registerBlock("mikudoll", new MikuDoll(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.WOOL).nonOpaque()));
        TESTSIZE = registerBlock("testsize", new TestSize(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.WOOL).nonOpaque()));
        MIKUSTATUE = registerBlock("mikustatue", new MikuStatue(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.WOOL).nonOpaque()));
        CASHREGISTER = registerBlock("cashregister", new CashRegister(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque().sounds(BlockSoundGroup.METAL).nonOpaque()));
        LETTUCE_CROP = (Block)Registry.register(Registries.BLOCK, new Identifier("alexatorrandomthings", "lettuce_crop"), new LettuceCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
        ONION_CROP = (Block)Registry.register(Registries.BLOCK, new Identifier("alexatorrandomthings", "onion_crop"), new OnionCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
        TOMATO_CROP = (Block)Registry.register(Registries.BLOCK, new Identifier("alexatorrandomthings", "tomato_crop"), new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
        PICKLE_CROP = (Block)Registry.register(Registries.BLOCK, new Identifier("alexatorrandomthings", "pickle_crop"), new PickleCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
        MUSTARD_CROP = (Block)Registry.register(Registries.BLOCK, new Identifier("alexatorrandomthings", "mustard_crop"), new MustardCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    }
}
