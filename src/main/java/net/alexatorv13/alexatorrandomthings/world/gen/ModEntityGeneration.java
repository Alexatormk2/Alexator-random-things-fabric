package net.alexatorv13.alexatorrandomthings.world.gen;

import net.alexatorv13.alexatorrandomthings.entity.ModEntities;
import net.alexatorv13.alexatorrandomthings.entity.custom.HostilewMikuEntity;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.biome.BiomeKeys;

public class ModEntityGeneration {


    public static void addSpawn(){
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                SpawnGroup.MONSTER, ModEntities.HW_MIKU,35,5,10);


        SpawnRestriction.register(ModEntities.HW_MIKU, SpawnRestriction.Location.ON_GROUND,Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostilewMikuEntity::canSpawnInDark);
        //.register(ModEntities.HW_MIKU ,
          //      SpawnRestriction.Location.ON_GROUND,
            //    Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HostilewMikuEntity::isSpawnDark);
    }
}
