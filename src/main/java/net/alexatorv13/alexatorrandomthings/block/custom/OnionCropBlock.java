package net.alexatorv13.alexatorrandomthings.block.custom;

import net.alexatorv13.alexatorrandomthings.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public class OnionCropBlock extends CropBlock {
 public static  final  int MAX_AGE =3;
 public  static  final IntProperty AGE = IntProperty.of("age",0,3);


    @Override
    public ItemConvertible getSeedsItem() {
        return ModItems.ONION_SEED;
    }

    @Override
public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    public OnionCropBlock(Settings settings) {
        super(settings);
    }
}
