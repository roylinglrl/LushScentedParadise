package net.royling.LushScentedParadise.ModBlock.DryingRack;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.royling.LushScentedParadise.Registry.ModBlockEntities;
import org.jetbrains.annotations.Nullable;

public class DryingRackBlock extends Block implements EntityBlock {
    public DryingRackBlock(Properties properties){
        super(properties);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new DryingRackBlockEntity(pPos,pState);
    }
    @Override
    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        return type == ModBlockEntities.DRYING_RACK.get()
                ? (BlockEntityTicker<T>) (lvl, pos, st, be) -> ((DryingRackBlockEntity) be).tick()
                : null;
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if(pLevel.getBlockEntity(pPos)instanceof DryingRackBlockEntity blockEntity){
            ItemStack heldItem = pPlayer.getItemInHand(pHand);
            if(heldItem.isEmpty()){
                if(pPlayer.isShiftKeyDown()){
                    blockEntity.ejectAllItems(pLevel,pPos);
                }else {
                    blockEntity.ejectLastItem(pLevel,pPos);
                }
                return InteractionResult.SUCCESS;
            }else {
                if(blockEntity.addItem(heldItem)){
                    if(!pPlayer.isCreative()){
                        heldItem.shrink(1);
                    }
                    return InteractionResult.SUCCESS;
                }
            }
        }
        return InteractionResult.PASS;
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!state.is(newState.getBlock())) {
            if (level.getBlockEntity(pos) instanceof DryingRackBlockEntity blockEntity) {
                blockEntity.ejectAllItems(level, pos);
            }
        }
        super.onRemove(state, level, pos, newState, isMoving);
    }
}
