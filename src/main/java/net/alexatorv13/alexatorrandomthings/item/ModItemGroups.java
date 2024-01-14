package net.alexatorv13.alexatorrandomthings.item;

import net.alexatorv13.alexatorrandomthings.AlexatorRandomThings;
import net.alexatorv13.alexatorrandomthings.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ALEXATOR_MATERIALS = Registry.register(Registries.ITEM_GROUP, new Identifier(AlexatorRandomThings.MOD_ID, "alexatormaterials"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.alexatormaterials"))
            .icon(() -> new ItemStack(ModItems.MIKUGEM)).entries((displayContext, entries) -> {
                entries.add(ModItems.MIKUGEM);
                entries.add(ModItems.CUTTINGKNIFE);
                entries.add(ModItems.FOOD_BAG);
                entries.add(ModItems.FLOUR);
                entries.add(ModItems.MAYONNAISE);
                entries.add(ModItems.MUSTARD);
                entries.add(ModItems.BBQ);
                entries.add(ModItems.KETCHUP);
                entries.add(ModItems.MUSTARD_FLOWER);

            }).build());


    public static final ItemGroup ALEXATOR_BLOCKS = Registry.register(Registries.ITEM_GROUP, new Identifier(AlexatorRandomThings.MOD_ID, "alexator_blocks"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.alexator_blocks"))
            .icon(() -> new ItemStack(ModBlocks.MIKUDOLL)).entries((displayContext, entries) -> {
                entries.add(ModBlocks.MIKUDOLL);
                entries.add(ModBlocks.MIKUSTATUE);
                entries.add(ModBlocks.CASHREGISTER);
                entries.add(ModBlocks.TESTSIZE);
            }).build());


    public static final ItemGroup ALEXATOR_FOODS = Registry.register(Registries.ITEM_GROUP, new Identifier(AlexatorRandomThings.MOD_ID, "alexator_foods"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.alexator_foods"))
            .icon(() -> new ItemStack(ModItems.BURGER)).entries((displayContext, entries) -> {
                entries.add(ModItems.BURGER);
                entries.add(ModItems.RAW_BURGER);
                entries.add(ModItems.RAW_NUGGET);
                entries.add(ModItems.RAW_FRIES);
                entries.add(ModItems.PROCESSED_MEAT);
                entries.add(ModItems.FRIES);
                entries.add(ModItems.FRIES_BAG);
                entries.add(ModItems.CHICKEN_NUGGET);
                entries.add(ModItems.NUGGET_BAG);
                entries.add(ModItems.BURGERBREAD);
                entries.add(ModItems.LETTUCE);
                entries.add(ModItems.TOMATO);
                entries.add(ModItems.ONION);
                entries.add(ModItems.PICKLE);
                entries.add(ModItems.ONION_CUTED);
                entries.add(ModItems.TOMATO_SLICE);
                entries.add(ModItems.PICKLE_SLICE);
                entries.add(ModItems.CHEESE_WHEEL);
                entries.add(ModItems.CHEESE_PIECE);
                entries.add(ModItems.CHEESE_SLICE);
                entries.add(ModItems.CHEESEBURGER);
                entries.add(ModItems.HAMBURGER);

            }).build());


    public static final ItemGroup ALEXATORS_TOOLS_WEAPONS = Registry.register(Registries.ITEM_GROUP, new Identifier(AlexatorRandomThings.MOD_ID, "alexator_tools_weapons"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.alexator_tools_weapons"))
            .icon(() -> new ItemStack(ModItems.MIKU_PICKAXE)).entries((displayContext, entries) -> {
                entries.add(ModItems.MIKU_PICKAXE);
                entries.add(ModItems.MIKU_HOE);
                entries.add(ModItems.MIKU_SHOVEL);
                entries.add(ModItems.MIKU_AXE);
                entries.add(ModItems.MIKU_SWORD);
            }).build());


    public static final ItemGroup ALEXATORS_SEEDS = Registry.register(Registries.ITEM_GROUP, new Identifier(AlexatorRandomThings.MOD_ID, "alexator_seeds"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.alexator_tools_weapons"))
            .icon(() -> new ItemStack(ModItems.LETTUCE_SEED)).entries((displayContext, entries) -> {
                entries.add(ModItems.LETTUCE_SEED);
                entries.add(ModItems.TOMATO_SEED);
                entries.add(ModItems.ONION_SEED);
                entries.add(ModItems.PICKLE_SEED);
                entries.add(ModItems.MUSTARD_SEED);
            }).build());

    public static void registerItemGroups() {

        AlexatorRandomThings.LOGGER.info("Registering Items groups for" + AlexatorRandomThings.MOD_ID);
    }
}
