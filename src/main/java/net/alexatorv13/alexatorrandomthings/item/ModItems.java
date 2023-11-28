package net.alexatorv13.alexatorrandomthings.item;

import net.alexatorv13.alexatorrandomthings.AlexatorRandomThings;
import net.alexatorv13.alexatorrandomthings.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //materials
    public static Item MIKUGEM = registerItem("mikugem", new Item(new FabricItemSettings()));
    public static Item FLOUR = registerItem("flour", new Item(new FabricItemSettings()));
    public static Item FOOD_BAG = registerItem("food_bag", new Item(new FabricItemSettings()));
    public static Item CUTTINGKNIFE = registerItem("cuttingknife", new CookingUtilModItem(new FabricItemSettings()));
//food
public static final Item BURGER = registerItem("burger", new Item(new FabricItemSettings().food(ModFood.BURGER)));
public static final Item BURGERBREAD = registerItem("burgerbread", new Item(new FabricItemSettings().food(ModFood.BURGERBREAD)));
public static final Item RAW_BURGER = registerItem("raw_burger", new Item(new FabricItemSettings().food(ModFood.RAW_BURGER)));
public static final Item RAW_FRIES = registerItem("raw_fries", new Item(new FabricItemSettings().food(ModFood.RAW_FRIES)));
public static final Item FRIES = registerItem("fries", new Item(new FabricItemSettings().food(ModFood.FRIES)));
public static final Item PROCESSED_MEAT = registerItem("processed_meat", new Item(new FabricItemSettings().food(ModFood.PROCESSED_MEAT)));
public static final Item CHICKEN_NUGGET  = registerItem("chicken_nugget", new Item(new FabricItemSettings().food(ModFood.CHICKEN_NUGGET)));
public static final Item RAW_NUGGET  = registerItem("raw_nugget", new Item(new FabricItemSettings().food(ModFood.RAW_NUGGET)));
public static final Item NUGGET_BAG  = registerItem("nugget_bag", new Item(new FabricItemSettings().food(ModFood.NUGGET_BAG)));
public static final Item FRIES_BAG  = registerItem("fries_bag", new Item(new FabricItemSettings().food(ModFood.FRIES_BAG)));
public static final Item LETTUCE  = registerItem("lettuce", new Item(new FabricItemSettings().food(ModFood.LETTUCE)));
public static final Item TOMATO  = registerItem("tomato", new Item(new FabricItemSettings().food(ModFood.TOMATO)));
public static final Item ONION  = registerItem("onion", new Item(new FabricItemSettings().food(ModFood.ONION)));

//seed
    public static  final  Item LETTUCE_SEED =registerItem("lettuce_seed",new AliasedBlockItem(ModBlocks.LETTUCE_CROP,new FabricItemSettings()));
    public static  final  Item ONION_SEED =registerItem("onion_seed",new AliasedBlockItem(ModBlocks.ONION_CROP,new FabricItemSettings()));
    public static  final  Item TOMATO_SEED =registerItem("tomato_seed",new AliasedBlockItem(ModBlocks.TOMATO_CROP,new FabricItemSettings()));


//tools and weapons
public static final Item MIKU_PICKAXE = registerItem("mikupickaxe",
        new PickaxeItem(ModToolMaterial.MIKU, 2, 2f, new FabricItemSettings()));

    public static final Item MIKU_AXE = registerItem("mikuaxe",
            new AxeItem(ModToolMaterial.MIKU, 3, 1f, new FabricItemSettings()));
    public static final Item MIKU_SHOVEL = registerItem("mikushovel",
            new ShovelItem(ModToolMaterial.MIKU, 0, 0f, new FabricItemSettings()));
    public static final Item MIKU_SWORD = registerItem("mikusword",
            new SwordItem(ModToolMaterial.MIKU, 5, 3f, new FabricItemSettings()));
    public static final Item MIKU_HOE = registerItem("mikuhoe",
            new HoeItem(ModToolMaterial.MIKU, 0, 0f, new FabricItemSettings()));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AlexatorRandomThings.MOD_ID, name), item);
    }

    public static void registerModItems() {

        AlexatorRandomThings.LOGGER.info("Registering Mod Items for" + AlexatorRandomThings.MOD_ID);
    }
}
