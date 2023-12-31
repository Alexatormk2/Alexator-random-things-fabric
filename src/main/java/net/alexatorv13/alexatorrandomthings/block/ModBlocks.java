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



    public  static final  Block MIKUDOLL = registerBlock("mikudoll",
            new MikuDoll(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.WOOL).nonOpaque()));
    public  static final  Block MIKUSTATUE = registerBlock("mikustatue",
            new MikuStatue(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public  static final  Block CASHREGISTER = registerBlock("cashregister",
            new CashRegister(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque().sounds(BlockSoundGroup.METAL).nonOpaque()));
    //crops
    public static  final  Block LETTUCE_CROP = Registry.register(Registries.BLOCK, new Identifier(AlexatorRandomThings.MOD_ID,"lettuce_crop"), new LettuceCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static  final  Block ONION_CROP = Registry.register(Registries.BLOCK, new Identifier(AlexatorRandomThings.MOD_ID,"onion_crop"), new OnionCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static  final  Block TOMATO_CROP = Registry.register(Registries.BLOCK, new Identifier(AlexatorRandomThings.MOD_ID,"tomato_crop"), new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static  final  Block PICKLE_CROP = Registry.register(Registries.BLOCK, new Identifier(AlexatorRandomThings.MOD_ID,"pickle_crop"), new PickleCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static  final  Block MUSTARD_CROP = Registry.register(Registries.BLOCK, new Identifier(AlexatorRandomThings.MOD_ID,"mustard_crop"), new MustardCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
private static  Block registerBlock(String name,Block block){
    registerBlockItem(name,block);
    return Registry.register(Registries.BLOCK, new Identifier(AlexatorRandomThings.MOD_ID,name),block);
}
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(AlexatorRandomThings.MOD_ID,name),
                new BlockItem(block, new FabricItemSettings()));
    }
public static  void registerModBlocks(){

    AlexatorRandomThings.LOGGER.info("Registering Mod Blocks for" + AlexatorRandomThings.MOD_ID);

}


}
