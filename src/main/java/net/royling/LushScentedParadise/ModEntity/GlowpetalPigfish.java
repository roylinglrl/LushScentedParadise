package net.royling.LushScentedParadise.ModEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.Cod;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.material.Fluids;
import net.royling.LushScentedParadise.Registry.ModEntities;
import net.royling.LushScentedParadise.Registry.ModItems;

public class GlowpetalPigfish extends AbstractFish {
    public GlowpetalPigfish(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
    public static AttributeSupplier.Builder createAttributes(){
        return Cod.createMobAttributes().add(Attributes.MAX_HEALTH,8).add(Attributes.MOVEMENT_SPEED,0.7);
    }

    @Override
    protected PathNavigation createNavigation(Level pLevel) {
        return new WaterBoundPathNavigation(this,level());
    }

    @Override
    protected SoundEvent getFlopSound() {
        return SoundEvents.TROPICAL_FISH_FLOP;
    }

    @Override
    protected SoundEvent getSwimSound() {
        return SoundEvents.FISH_SWIM;
    }

    @Override
    public ItemStack getBucketItemStack() {
        return new ItemStack(ModItems.GLOWPETAL_PIGFISH_BUCKET.get());
    }

    public static boolean checkUndergroundWaterSpawnRules(
            EntityType<GlowpetalPigfish> type,
            ServerLevelAccessor level,
            MobSpawnType spawnType,
            BlockPos pos,
            RandomSource random
    ) {
        if (pos.getY() > level.getSeaLevel() - 10) {
            return false;
        }
        return level.getFluidState(pos).is(FluidTags.WATER)&& level.getBlockState(pos.below()).isSolid();
    }

}
