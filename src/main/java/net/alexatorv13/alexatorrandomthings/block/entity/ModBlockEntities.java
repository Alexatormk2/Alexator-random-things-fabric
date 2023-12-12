package net.alexatorv13.alexatorrandomthings.block.entity;

import net.alexatorv13.alexatorrandomthings.AlexatorRandomThings;
import net.alexatorv13.alexatorrandomthings.block.ModBlocks;
import net.alexatorv13.alexatorrandomthings.block.custom.CashRegister;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModBlockEntities {

 public static  final BlockEntityType<CashRegisterBlockEntity> BOX_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,new Identifier(AlexatorRandomThings.MOD_ID, "cashregister"), FabricBlockEntityTypeBuilder.create(CashRegisterBlockEntity::new, ModBlocks.CASHREGISTER).build());
    public static void registerBlockEntities() {
        AlexatorRandomThings.LOGGER.info("Registering Block Entities for " + AlexatorRandomThings.MOD_ID);
    }

}


