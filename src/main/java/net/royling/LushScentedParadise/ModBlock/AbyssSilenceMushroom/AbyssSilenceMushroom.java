package net.royling.LushScentedParadise.ModBlock.AbyssSilenceMushroom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.MushroomBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.HugeMushroomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.phys.BlockHitResult;
import net.royling.LushScentedParadise.LushScentedParadise;
import net.royling.LushScentedParadise.Registry.ModBlocks;
import net.royling.LushScentedParadise.Registry.ModFeatures;

import java.util.Optional;

@SuppressWarnings("removal")
public class AbyssSilenceMushroom extends MushroomBlock {
    public AbyssSilenceMushroom(Properties pProperties) {
        super(pProperties, ResourceKey.create(Registries.CONFIGURED_FEATURE,new ResourceLocation(LushScentedParadise.MODID,"big_mushroom")));
    }

    @Override
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        BlockState belowBlock = pLevel.getBlockState(pPos.below());
        return belowBlock.isSolid();
    }

    @Override
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {

    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!world.isClientSide) {
            if (player.getItemInHand(hand).getItem() instanceof BoneMealItem) {
                if(!player.isCreative()) {
                    player.getItemInHand(hand).shrink(1);
                }
                growBigMushroom((ServerLevel) world, pos, world.getRandom());

                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }
    private void growBigMushroom(ServerLevel world, BlockPos pos, RandomSource random) {
        world.playSound(null, pos, SoundEvents.BONE_MEAL_USE,
                SoundSource.BLOCKS, 1.0F, 1.0F);

        // 🌟 生成骨粉粒子效果（服务器端广播给所有玩家）
        world.sendParticles(ParticleTypes.HAPPY_VILLAGER,
                pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, // 粒子中心点
                10, // 生成 10 个粒子
                0.3D, 0.3D, 0.3D, // 粒子扩散范围 (X, Y, Z)
                0.1D // 粒子速度
        );
        if (random.nextFloat() < 0.25f) {
            world.removeBlock(pos,false);

            ModFeatures.BIG_MUSHROOM.get().place(new FeaturePlaceContext<>(
                    Optional.empty(), // ✅ 这里需要 Optional.empty()
                    world,
                    world.getChunkSource().getGenerator(),
                    random,
                    pos.below(),
                    new HugeMushroomFeatureConfiguration(
                            SimpleStateProvider.simple(ModBlocks.ABYSS_SILENCE_MUSHROOM_CAP.get().defaultBlockState()), // ✅ 使用 BlockStateProvider
                            SimpleStateProvider.simple(ModBlocks.ABYSS_SILENCE_MUSHROOM_BLOCK.get().defaultBlockState()), // ✅ 使用 BlockStateProvider
                            5 + random.nextInt(2) // 5-6 格高
                    )
            ));
        }
    }
    @Override
    public void neighborChanged(BlockState state, Level world, BlockPos pos, Block block, BlockPos fromPos, boolean flag) {
        if (!canSurvive(state, world, pos)) {
            world.destroyBlock(pos, true); // 破坏自身并掉落
        }
        super.neighborChanged(state, world, pos, block, fromPos, flag);
    }
}
