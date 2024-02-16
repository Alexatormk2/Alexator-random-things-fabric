package net.alexatorv13.alexatorrandomthings.block;

import net.alexatorv13.alexatorrandomthings.AlexatorRandomThings;
import net.alexatorv13.alexatorrandomthings.block.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.BlockRotation;
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

    public static final Block TILES_1;
    public static final Block TILES_2;
    public static final Block TILES_3;
    public static final Block TILES_4;
    public static final Block TILES_5;
    public static final Block TILES_6;
    public static final Block FLOOR_TILES_2;
    public static final Block FLOOR_TILES_1;



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
        CASHREGISTER = registerBlock("cashregister", new CashRegister(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque().sounds(BlockSoundGroup.METAL).nonOpaque()));
        LETTUCE_CROP = (Block) Registry.register(Registries.BLOCK, new Identifier("alexatorrandomthings", "lettuce_crop"), new LettuceCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
        ONION_CROP = (Block) Registry.register(Registries.BLOCK, new Identifier("alexatorrandomthings", "onion_crop"), new OnionCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
        TOMATO_CROP = (Block) Registry.register(Registries.BLOCK, new Identifier("alexatorrandomthings", "tomato_crop"), new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
        PICKLE_CROP = (Block) Registry.register(Registries.BLOCK, new Identifier("alexatorrandomthings", "pickle_crop"), new PickleCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
        MUSTARD_CROP = (Block) Registry.register(Registries.BLOCK, new Identifier("alexatorrandomthings", "mustard_crop"), new MustardCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
//tiles

        TILES_1 = registerBlock("tiles1", new BaseTiles(FabricBlockSettings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));
        TILES_2 = registerBlock("tiles2", new BaseTiles(FabricBlockSettings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));
        TILES_3 = registerBlock("tiles3", new BaseTiles(FabricBlockSettings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));
        TILES_4= registerBlock("tiles4", new BaseTiles(FabricBlockSettings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));
        TILES_5 = registerBlock("tiles5", new BaseTiles(FabricBlockSettings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));
        TILES_6 = registerBlock("tiles6", new BaseTiles(FabricBlockSettings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));


        FLOOR_TILES_1 = registerBlock("floortiles1", new BaseTiles(FabricBlockSettings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));
        FLOOR_TILES_2 = registerBlock("floortiles2", new BaseTiles(FabricBlockSettings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));

    }
}
