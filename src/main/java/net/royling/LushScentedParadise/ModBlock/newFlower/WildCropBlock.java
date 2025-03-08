package net.royling.LushScentedParadise.ModBlock.newFlower;

import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WildCropBlock extends BushBlock {
    private static final VoxelShape SHAPE = box(2,0,2,14,12,14);

    public WildCropBlock(Properties pProperties) {
        super(pProperties);
    }

    public static VoxelShape getSHAPE() {
        return SHAPE;
    }
}
