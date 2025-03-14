package net.royling.LushScentedParadise.Registry;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.LushScentedParadise.Item.colorfulflower.MagicArrowEntity;
import net.royling.LushScentedParadise.LushScentedParadise;
import net.royling.LushScentedParadise.ModEntity.GlowpetalPigfish;
import net.royling.LushScentedParadise.ModEntity.PhantomLotusKoi;
import net.royling.LushScentedParadise.ModEntity.SpectralSteed.SpectralSteed;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, LushScentedParadise.MODID);
    public static final RegistryObject<EntityType<SpectralSteed>> SPECTRAL_STEED = ENTITIES.register("spectral_steed",
            () -> EntityType.Builder.of(SpectralSteed::new, MobCategory.CREATURE)
                    .sized(1.3964844F, 1.6F)
                    .build("spectral_steed"));

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(SPECTRAL_STEED.get(), SpectralSteed.createAttributes().build());
        event.put(PHANTOM_LOTUS_KOI.get(), PhantomLotusKoi.createAttributes().build());
        event.put(GLOWPETAL_PIGFISH.get(),GlowpetalPigfish.createAttributes().build());
    }

    public static final RegistryObject<EntityType<MagicArrowEntity>> MAGIC_ARROW = ENTITIES.register("magic_arrow",()->EntityType.Builder.<MagicArrowEntity>of(MagicArrowEntity::new,MobCategory.MISC)
            .sized(0.2f,0.2f).clientTrackingRange(4).updateInterval(20).build("magic_arrow"));

    public static final RegistryObject<EntityType<PhantomLotusKoi>> PHANTOM_LOTUS_KOI = ENTITIES.register("phantom_lotus_koi",()->EntityType.Builder.of(PhantomLotusKoi::new,MobCategory.WATER_AMBIENT).sized(0.5f,0.3f).build("phantom_lotus" +
            "_koi"));
    public static final RegistryObject<EntityType<GlowpetalPigfish>> GLOWPETAL_PIGFISH = ENTITIES.register("glowpetal_pigfish",()->EntityType.Builder.of(GlowpetalPigfish::new,MobCategory.WATER_AMBIENT).sized(0.4f,0.4f).build("glowpetal_pigfish"));


    public static void register(IEventBus eventBus){
        ENTITIES.register(eventBus);
    }
}
