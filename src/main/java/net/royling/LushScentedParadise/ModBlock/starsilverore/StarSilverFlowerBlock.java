package net.royling.LushScentedParadise.ModBlock.starsilverore;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.royling.LushScentedParadise.Registry.ModBlocks;
import net.royling.LushScentedParadise.Registry.ModItems;
import org.checkerframework.checker.units.qual.A;

import java.util.Collections;
import java.util.List;

public class StarSilverFlowerBlock extends CropBlock {
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 3);
    public StarSilverFlowerBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(getAgeProperty(),0));
    }

    @Override
    protected IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }

    @Override
    public boolean isRandomlyTicking(BlockState pState) {
        return true;
    }

    @Override
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if(pState.getValue(AGE)<3){
            pLevel.setBlock(pPos,pState.setValue(AGE,pState.getValue(AGE)+1),2);
            pLevel.sendBlockUpdated(pPos,pState,pLevel.getBlockState(pPos),3);
        }else {
            BlockPos above = pPos.above();
            if(pLevel.getBlockState(above).isAir()){
                pLevel.setBlock(above, ModBlocks.STAR_SILVER_CLUSTER.get().defaultBlockState().setValue(StarSilverClusterBlock.AGE,0),2);
            }
        }
    }

    @Override
    public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) {
        return new ItemStack(ModItems.STAR_SILVER_SEED.get(),1);
    }

    @Override
    public List<ItemStack> getDrops(BlockState pState, LootParams.Builder pParams) {
        return Collections.emptyList();
    }

    private static final VoxelShape SHAPE_0 = Block.box(3, 0, 3, 13, 4, 13);
    private static final VoxelShape SHAPE_1 = Block.box(2, 0, 2, 14, 8, 14);
    private static final VoxelShape SHAPE_2 = Block.box(1, 0, 1, 15, 12, 15);
    private static final VoxelShape SHAPE_3 = Block.box(0, 0, 0, 16, 16, 16);
    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        int age = pState.getValue(AGE);
        return switch (age) {
            case 0 -> SHAPE_0;
            case 1 -> SHAPE_1;
            case 2 -> SHAPE_2;
            default -> SHAPE_3; // AGE=3 时
        };
    }
}
