package net.royling.LushScentedParadise.ModBlock.starsilverore;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.BlockHitResult;
import net.royling.LushScentedParadise.Registry.ModItems;

import java.util.Collections;
import java.util.List;

public class StarSilverClusterBlock extends Block {
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 3);
    public StarSilverClusterBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(AGE,0));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }

    @Override
    public boolean isRandomlyTicking(BlockState pState) {
        return pState.getValue(AGE) < 3;
    }
    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        int age = state.getValue(AGE);
        if (age < 3 && random.nextFloat() < 0.3f) { // 30% 概率增长
            level.setBlock(pos, state.setValue(AGE, age + 1), 2);
        }
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        ItemStack heldItem = pPlayer.getItemInHand(pHand);
        if(heldItem.is(ModItems.STAR_SILVER_SHEARS.get())&&pState.getValue(AGE)==3){
            pLevel.setBlock(pPos,pState.setValue(AGE,0),2);
            pLevel.playSound(null,pPos, SoundEvents.SHEEP_SHEAR, SoundSource.BLOCKS,1,1);
            Block.popResource(pLevel, pPos, new ItemStack(ModItems.STAR_SILVER_FLOWER_CROP.get()));
            heldItem.hurtAndBreak(1,pPlayer,(p)->p.broadcastBreakEvent(p.getUsedItemHand()));
            return InteractionResult.SUCCESS;
        }
        return super.use(pState,pLevel,pPos,pPlayer,pHand,pHit);
    }

    @Override
    public List<ItemStack> getDrops(BlockState pState, LootParams.Builder pParams) {
        return Collections.emptyList();
    }

    @Override
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        BlockState belowState = pLevel.getBlockState(pPos.below());
        return belowState.getBlock() instanceof StarSilverFlowerBlock;
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        super.neighborChanged(state, level, pos, block, fromPos, isMoving);

        // 只检测下方方块
        if (fromPos.equals(pos.below())) {
            if (!(level.getBlockState(pos.below()).getBlock() instanceof StarSilverFlowerBlock)) {
                // 下方不是星银花作物，破坏自己
                level.destroyBlock(pos, true);
            }
        }
    }
}
