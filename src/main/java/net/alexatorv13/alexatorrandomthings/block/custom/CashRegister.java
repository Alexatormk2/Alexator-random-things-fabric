package net.alexatorv13.alexatorrandomthings.block.custom;

import net.alexatorv13.alexatorrandomthings.block.entity.CashRegisterBlockEntity;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CashRegister   extends BlockWithEntity {

    private static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 12, 12, 16);

    public CashRegister(Settings settings) {
        super(settings);}
        @Override
        public BlockEntity createBlockEntity (BlockPos pos, BlockState state){
            return new CashRegisterBlockEntity(pos, state);
        }

        @Override
        public BlockRenderType getRenderType (BlockState state){
            //With inheriting from BlockWithEntity this defaults to INVISIBLE, so we need to change that!
            return BlockRenderType.MODEL;
        }

        @Override
        public ActionResult onUse (BlockState state, World world, BlockPos pos, PlayerEntity player, Hand
        hand, BlockHitResult hit){
            if (!world.isClient) {
                //This will call the createScreenHandlerFactory method from BlockWithEntity, which will return our blockEntity casted to
                //a namedScreenHandlerFactory. If your block class does not extend BlockWithEntity, it needs to implement createScreenHandlerFactory.
                NamedScreenHandlerFactory screenHandlerFactory = state.createScreenHandlerFactory(world, pos);

                if (screenHandlerFactory != null) {
                    //With this call the server will request the client to open the appropriate Screenhandler
                    player.openHandledScreen(screenHandlerFactory);
                }
            }
            return ActionResult.SUCCESS;
        }


        //This method will drop all items onto the ground when the block is broken
        @Override
        public void onStateReplaced (BlockState state, World world, BlockPos pos, BlockState newState,boolean moved){
            if (state.getBlock() != newState.getBlock()) {
                BlockEntity blockEntity = world.getBlockEntity(pos);
                if (blockEntity instanceof CashRegisterBlockEntity) {
                    ItemScatterer.spawn(world, pos, (CashRegisterBlockEntity) blockEntity);
                    // update comparators
                    world.updateComparators(pos, this);
                }
                super.onStateReplaced(state, world, pos, newState, moved);
            }
        }

        @Override
        public boolean hasComparatorOutput (BlockState state){
            return true;
        }

        @Override
        public int getComparatorOutput (BlockState state, World world, BlockPos pos){
            return ScreenHandler.calculateComparatorOutput(world.getBlockEntity(pos));
        }

    }
