package net.alexatorv13.alexatorrandomthings.entity;

import net.alexatorv13.alexatorrandomthings.AlexatorRandomThings;
import net.alexatorv13.alexatorrandomthings.entity.custom.HostilewMikuEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {


    public static  final EntityType<HostilewMikuEntity> HW_MIKU = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(AlexatorRandomThings.MOD_ID,"hostilewmiku"), FabricEntityTypeBuilder.create(SpawnGroup.MONSTER,HostilewMikuEntity::new).dimensions(EntityDimensions.fixed(0.6f,1.5f)).build());

    public static void registerModEntities() {
        AlexatorRandomThings.LOGGER.info("Registering Entities for " + AlexatorRandomThings.MOD_ID);
    }
}
