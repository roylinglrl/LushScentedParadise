package net.royling.LushScentedParadise.ModBlock.starsilverore;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.storage.loot.LootParams;
import net.royling.LushScentedParadise.Registry.ModBlocks;
import net.royling.LushScentedParadise.Registry.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

public class StarSilverFlower extends BushBlock {
    public static final DirectionProperty FACING = BlockStateProperties.FACING;


    public StarSilverFlower() {
        super(Properties.of().noCollission().instabreak().sound(SoundType.CROP));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.UP));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }


    @Override
    public List<ItemStack> getDrops(BlockState pState, LootParams.Builder pParams) {
        return Collections.singletonList(new ItemStack(ModItems.STAR_SILVER_SEED.get()));
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction facing = context.getClickedFace(); // 直接使用点击的面方向
        BlockPos attachedPos = context.getClickedPos().relative(facing.getOpposite());
        BlockState attachedBlock = context.getLevel().getBlockState(attachedPos);

        if (attachedBlock.is(ModBlocks.STAR_SILVER_ORE.get())) {
            return this.defaultBlockState().setValue(FACING, facing);
        }
        return null;
    }


    @Override
    public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        Direction facing = state.getValue(FACING);
        BlockPos rootPos = pos.relative(facing.getOpposite()); // 根据方向找到附着位置
        return world.getBlockState(rootPos).is(ModBlocks.STAR_SILVER_ORE.get());
    }

}
