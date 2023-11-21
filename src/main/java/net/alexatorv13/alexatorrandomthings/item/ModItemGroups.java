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

            }).build());


    public static final ItemGroup ALEXATOR_BLOCKS = Registry.register(Registries.ITEM_GROUP, new Identifier(AlexatorRandomThings.MOD_ID, "alexator_blocks"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.alexator_blocks"))
            .icon(() -> new ItemStack(ModBlocks.MIKUDOLL)).entries((displayContext, entries) -> {
                entries.add(ModBlocks.MIKUDOLL);
                entries.add(ModBlocks.MIKUSTATUE);
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
            }).build());


    public static final ItemGroup ALEXATORS_TOOLS_WEAPONS = Registry.register(Registries.ITEM_GROUP, new Identifier(AlexatorRandomThings.MOD_ID, "alexator_tools_weapons"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.alexator_tools_weapons"))
            .icon(() -> new ItemStack(ModItems.MIKU_PICKAXE)).entries((displayContext, entries) -> {
                entries.add(ModItems.MIKU_PICKAXE);
                entries.add(ModItems.MIKU_HOE);
                entries.add(ModItems.MIKU_SHOVEL);
                entries.add(ModItems.MIKU_AXE);
                entries.add(ModItems.MIKU_SWORD);
            }).build());

    public static void registerItemGroups() {

        AlexatorRandomThings.LOGGER.info("Registering Items groups for" + AlexatorRandomThings.MOD_ID);
    }
}