package net.royling.LushScentedParadise.ModBlock.starsilverore;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.royling.LushScentedParadise.Registry.ModBlocks;

public class starsilverOre extends Block {
    public starsilverOre() {
        super(Properties.of().strength(3.0f,3.0f).requiresCorrectToolForDrops());
    }

    @Override
    public boolean isRandomlyTicking(BlockState pState) {
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (world.getBrightness(LightLayer.BLOCK, pos) < 5 && random.nextFloat() < 0.3f) {
            Direction[] directions = {Direction.UP, Direction.DOWN, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST};
            Direction randomDirection = directions[random.nextInt(directions.length)];
            BlockPos flowerPos = pos.relative(randomDirection);
            if (world.isEmptyBlock(flowerPos)) {
                world.setBlock(flowerPos, ModBlocks.STAR_SILVER_FLOWER.get().defaultBlockState().setValue(StarSilverFlower.FACING, randomDirection), 3);
            }
        }
    }

}
