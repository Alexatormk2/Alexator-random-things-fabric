package net.alexatorv13.alexatorrandomthings.item;

import net.alexatorv13.alexatorrandomthings.AlexatorRandomThings;
import net.alexatorv13.alexatorrandomthings.block.ModBlocks;
import net.alexatorv13.alexatorrandomthings.entity.ModEntities;
import net.alexatorv13.alexatorrandomthings.item.custom.CookingUtilModItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //materials
    public static Item MIKUGEM = registerItem("mikugem", new Item(new FabricItemSettings()));
    public static Item SCRAPMETAL = registerItem("scrapmetal", new Item(new FabricItemSettings()));
    public static Item KETCHUP = registerItem("ketchup", new Item(new FabricItemSettings()));
    public static Item MUSTARD = registerItem("mustard", new Item(new FabricItemSettings()));
    public static Item BBQ = registerItem("bbq", new Item(new FabricItemSettings()));
    public static Item MAYONNAISE = registerItem("mayonnaise", new Item(new FabricItemSettings()));
    public static Item FLOUR = registerItem("flour", new Item(new FabricItemSettings()));
    public static Item FOOD_BAG = registerItem("food_bag", new Item(new FabricItemSettings()));
    public static Item MUSTARD_FLOWER = registerItem("mustard_flower", new Item(new FabricItemSettings()));
    public static Item CUTTINGKNIFE = registerItem("cuttingknife", new CookingUtilModItem(new FabricItemSettings()));
    //food
    public static final Item PATTY = registerItem("patty", new Item(new FabricItemSettings().food(ModFood.PATTY)));
    public static final Item BURGERBREAD = registerItem("burgerbread", new Item(new FabricItemSettings().food(ModFood.BURGERBREAD)));
    public static final Item RAW_PATTY = registerItem("raw_patty", new Item(new FabricItemSettings().food(ModFood.RAW_PATTY)));
    public static final Item RAW_FRIES = registerItem("raw_fries", new Item(new FabricItemSettings().food(ModFood.RAW_FRIES)));
    public static final Item FRIES = registerItem("fries", new Item(new FabricItemSettings().food(ModFood.FRIES)));
    public static final Item PROCESSED_MEAT = registerItem("processed_meat", new Item(new FabricItemSettings().food(ModFood.PROCESSED_MEAT)));
    public static final Item CHICKEN_NUGGET = registerItem("chicken_nugget", new Item(new FabricItemSettings().food(ModFood.CHICKEN_NUGGET)));
    public static final Item RAW_NUGGET = registerItem("raw_nugget", new Item(new FabricItemSettings().food(ModFood.RAW_NUGGET)));
    public static final Item NUGGET_BAG = registerItem("nugget_bag", new Item(new FabricItemSettings().food(ModFood.NUGGET_BAG)));
    public static final Item FRIES_BAG = registerItem("fries_bag", new Item(new FabricItemSettings().food(ModFood.FRIES_BAG)));
    public static final Item LETTUCE = registerItem("lettuce", new Item(new FabricItemSettings().food(ModFood.LETTUCE)));
    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFood.TOMATO)));
    public static final Item PICKLE = registerItem("pickle", new Item(new FabricItemSettings().food(ModFood.TOMATO)));
    public static final Item PICKLE_SLICE = registerItem("pickle_slice", new Item(new FabricItemSettings().food(ModFood.TOMATO)));
    public static final Item TOMATO_SLICE = registerItem("tomato_slice", new Item(new FabricItemSettings().food(ModFood.TOMATO)));
    public static final Item ONION_CUTED = registerItem("onion_cuted", new Item(new FabricItemSettings().food(ModFood.ONION)));
    public static final Item ONION = registerItem("onion", new Item(new FabricItemSettings().food(ModFood.ONION)));
    public static final Item CHEESE_WHEEL = registerItem("cheese_wheel", new Item(new FabricItemSettings().food(ModFood.CHEESE_WHEEL)));
    public static final Item CHEESE_PIECE = registerItem("cheese_piece", new Item(new FabricItemSettings().food(ModFood.CHEESE_PIECE)));
    public static final Item CHEESE_SLICE = registerItem("cheese_slice", new Item(new FabricItemSettings().food(ModFood.CHEESE_SLICE)));
    //burgers
    public static final Item BURGER = registerItem("burger", new Item(new FabricItemSettings().food(ModFood.BURGER)));
    public static final Item CHEESEBURGER = registerItem("cheeseburger", new Item(new FabricItemSettings().food(ModFood.CHEESEBURGER)));
    //seed
    public static final Item LETTUCE_SEED = registerItem("lettuce_seed", new AliasedBlockItem(ModBlocks.LETTUCE_CROP, new FabricItemSettings()));
    public static final Item ONION_SEED = registerItem("onion_seed", new AliasedBlockItem(ModBlocks.ONION_CROP, new FabricItemSettings()));
    public static final Item TOMATO_SEED = registerItem("tomato_seed", new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));
    public static final Item PICKLE_SEED = registerItem("pickle_seed", new AliasedBlockItem(ModBlocks.PICKLE_CROP, new FabricItemSettings()));
    public static final Item MUSTARD_SEED = registerItem("mustard_seed", new AliasedBlockItem(ModBlocks.MUSTARD_CROP, new FabricItemSettings()));


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

//spaw eggs

    public  static  final Item HWMIKU_SPAWN_EGG = registerItem("whmiku_spawn_egg",
            new SpawnEggItem(ModEntities.HW_MIKU,0x8FF1D7,0x00ADFF,new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AlexatorRandomThings.MOD_ID, name), item);
    }

    public static void registerModItems() {

        AlexatorRandomThings.LOGGER.info("Registering Mod Items for" + AlexatorRandomThings.MOD_ID);
    }
}
