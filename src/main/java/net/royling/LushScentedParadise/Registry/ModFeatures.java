package net.royling.LushScentedParadise.Registry;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.HugeMushroomFeatureConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.LushScentedParadise.LushScentedParadise;

public class ModFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES =
            DeferredRegister.create(ForgeRegistries.FEATURES, LushScentedParadise.MODID);
    public static final RegistryObject<Feature<HugeMushroomFeatureConfiguration>> BIG_MUSHROOM =
            FEATURES.register("big_mushroom", () ->
                    new Feature<>(HugeMushroomFeatureConfiguration.CODEC) {
                        @Override
                        public boolean place(FeaturePlaceContext<HugeMushroomFeatureConfiguration> context) {
                            ServerLevel world = (ServerLevel) context.level();
                            BlockPos pos = context.origin();
                            RandomSource random = context.random();
                            HugeMushroomFeatureConfiguration config = context.config();

                            int height = 3 + random.nextInt(5);

                            for (int i = 1; i <= height; i++) {
                                world.setBlock(pos.above(i), config.stemProvider.getState(random, pos), 3);
                            }
                            for (int dx = -2; dx <= 2; dx++) {
                                for (int dz = -2; dz <= 2; dz++) {
                                    if (Math.abs(dx) == 2 && Math.abs(dz) == 2) continue;
                                    world.setBlock(pos.above(height).offset(dx, 0, dz), config.capProvider.getState(random, pos), 3);
                                }
                            }
                            for (int dx = -1; dx <= 1; dx++) {
                                for (int dz = -1; dz <= 1; dz++) {
                                    world.setBlock(pos.above(height + 1).offset(dx, 0, dz), config.capProvider.getState(random, pos), 3);
                                }
                            }
                            return true;
                        }
                    });
}
