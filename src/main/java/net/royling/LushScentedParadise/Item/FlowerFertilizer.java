package net.royling.LushScentedParadise.Item;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.royling.LushScentedParadise.ModBlock.newFlower.ModFlowers;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class FlowerFertilizer extends Item {
    public FlowerFertilizer(Properties properties){
        super(properties);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        if (!(level instanceof ServerLevel serverLevel)) return InteractionResult.PASS;
        BlockPos clickedPos = pContext.getClickedPos();
        RandomSource random = serverLevel.getRandom();
        ResourceKey<Biome> biomeKey = serverLevel.getBiome(clickedPos).unwrapKey().orElse(null);
        if (biomeKey == null) return InteractionResult.FAIL;

        List<BlockState> possiblePlants = getPlantsForBiome(biomeKey);
        if (possiblePlants.isEmpty()) return InteractionResult.FAIL;

        List<BlockPos> validPosi = getValidSoilPos(serverLevel, clickedPos);

        float prob = 0.35f;
        int plantCount = 0;
        int attempts = 0;
        List<BlockPos> plantedPositions = new ArrayList<>();

        for (BlockPos pos : validPosi) {
            if (plantCount >= 7 || attempts >= 10) break;

            if (random.nextFloat() <= prob) {
                BlockState plant = possiblePlants.get(random.nextInt(possiblePlants.size()));
                serverLevel.setBlockAndUpdate(pos.above(), plant);
                plantedPositions.add(pos);
                plantCount++;
            }
            prob -= 0.05f;
            attempts++;
        }
        if(plantCount>0) {
            for (BlockPos pos : validPosi) {
                if (!plantedPositions.contains(pos)) {
                    if (random.nextFloat() <= 0.5f) {
                        serverLevel.setBlockAndUpdate(pos.above(), Blocks.GRASS.defaultBlockState());
                    }
                }
            }
        }

        if (plantCount > 0) {
            pContext.getItemInHand().shrink(1);
            serverLevel.playSound(null, clickedPos.above(), SoundEvents.BONE_MEAL_USE, SoundSource.BLOCKS, 1.0F, 0.8F);
            serverLevel.sendParticles(
                    ParticleTypes.HAPPY_VILLAGER,
                    clickedPos.above().getX() + 0.5,
                    clickedPos.above().getY() + 0.5,
                    clickedPos.above().getZ() + 0.5,
                    25, 0.5, 0.5, 0.5, 0.0
            );
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.FAIL;
    }


    private static final Map<ResourceKey<Biome>, List<BlockState>> BIOME_TO_PLANTS = Map.of(
            Biomes.PLAINS, List.of(
                    ModFlowers.VIOLET.get().defaultBlockState(),
                    ModFlowers.LILY.get().defaultBlockState(),
                    ModFlowers.PERILLA.get().defaultBlockState()
            ),
            Biomes.FOREST, List.of(
                    ModFlowers.VIOLET.get().defaultBlockState(),
                    ModFlowers.PEONY.get().defaultBlockState(),
                    ModFlowers.MARIGOLD.get().defaultBlockState(),
                    ModFlowers.LILY.get().defaultBlockState()
            ),
            Biomes.MEADOW, List.of(
                    ModFlowers.VIOLET.get().defaultBlockState(),
                    ModFlowers.LILY.get().defaultBlockState(),
                    ModFlowers.LAVENDER.get().defaultBlockState(),
                    ModFlowers.MARIGOLD.get().defaultBlockState(),
                    ModFlowers.OENOTHERA_LINDHEIMERI.get().defaultBlockState(),
                    ModFlowers.PEONY.get().defaultBlockState(),
                    ModFlowers.HONEYSUCKLE.get().defaultBlockState()
            ),
            Biomes.SWAMP,List.of(
                    ModFlowers.JASMINE.get().defaultBlockState(),
                    ModFlowers.MARIGOLD.get().defaultBlockState(),
                    ModFlowers.SAFFLOWER.get().defaultBlockState()
            ),
            Biomes.SAVANNA,List.of(
                    ModFlowers.HIBISCUS.get().defaultBlockState(),
                    ModFlowers.PERILLA.get().defaultBlockState(),
                    ModFlowers.MARIGOLD.get().defaultBlockState(),
                    ModFlowers.SAFFLOWER.get().defaultBlockState()
            ),
            Biomes.DESERT,List.of(
                    ModFlowers.HIBISCUS.get().defaultBlockState(),
                    ModFlowers.PERILLA.get().defaultBlockState(),
                    ModFlowers.MARIGOLD.get().defaultBlockState(),
                    ModFlowers.SAFFLOWER.get().defaultBlockState()
            ),
            Biomes.SAVANNA_PLATEAU,List.of(
                    ModFlowers.HIBISCUS.get().defaultBlockState(),
                    ModFlowers.PERILLA.get().defaultBlockState(),
                    ModFlowers.MARIGOLD.get().defaultBlockState(),
                    ModFlowers.SAFFLOWER.get().defaultBlockState()
            )
    );


    private List<BlockState> getPlantsForBiome(ResourceKey<Biome> biomeKey){
        return BIOME_TO_PLANTS.getOrDefault(biomeKey, new ArrayList<>());
    }


    private List<BlockPos> getValidSoilPos(ServerLevel level, BlockPos centerPos) {
        List<BlockPos> validPositions = new ArrayList<>();
        int radius = 3;
        for (int dx = -radius; dx <= radius; dx++) {
            for (int dz = -radius; dz <= radius; dz++) {
                BlockPos pos = centerPos.offset(dx, 0, dz);
                if (isValidSoil(level, pos)) {
                    validPositions.add(pos);
                }
            }
        }
        validPositions.sort((pos1, pos2) -> {
            int d1 = Math.abs(pos1.getX() - centerPos.getX()) + Math.abs(pos1.getZ() - centerPos.getZ());
            int d2 = Math.abs(pos2.getX() - centerPos.getX()) + Math.abs(pos2.getZ() - centerPos.getZ());
            return Integer.compare(d1, d2);
        });

        return validPositions;
    }


    private boolean isValidSoil(ServerLevel level, BlockPos pos) {
        BlockState state = level.getBlockState(pos);
        BlockState aboveState = level.getBlockState(pos.above());
        return (state.is(Blocks.GRASS_BLOCK) ||
                state.is(Blocks.DIRT) ||
                state.is(Blocks.PODZOL) ||
                state.is(Blocks.FARMLAND) ||
                state.is(Blocks.MYCELIUM))
                && (aboveState.isAir());
    }
}

