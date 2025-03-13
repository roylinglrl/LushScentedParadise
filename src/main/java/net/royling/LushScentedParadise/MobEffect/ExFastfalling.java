package net.royling.LushScentedParadise.MobEffect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.royling.LushScentedParadise.Registry.ModEffects;

public class ExFastfalling extends MobEffect {
    private static final AttributeModifier GRAVITY_MODI = new AttributeModifier("fast_falling",0.15,AttributeModifier.Operation.ADDITION);
    public ExFastfalling() {
        super(MobEffectCategory.NEUTRAL,0x5A1E1E);
        this.addAttributeModifier(ForgeMod.ENTITY_GRAVITY.get(),"e94cb864-8883-4a3a-959f-f0622da14cce",0.15,AttributeModifier.Operation.ADDITION);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(!pLivingEntity.level().isDay()){
            if(!pLivingEntity.getAttribute(ForgeMod.ENTITY_GRAVITY.get()).hasModifier(GRAVITY_MODI)){
                pLivingEntity.getAttribute(ForgeMod.ENTITY_REACH.get()).addTransientModifier(GRAVITY_MODI);
            }
        }
        super.applyEffectTick(pLivingEntity,pAmplifier);
    }
    @Override
    public void removeAttributeModifiers(LivingEntity entity, net.minecraft.world.entity.ai.attributes.AttributeMap attributeMap, int amplifier) {
        if (!entity.level().isClientSide()) {
            if (entity.getAttribute(ForgeMod.ENTITY_GRAVITY.get()).hasModifier(GRAVITY_MODI)) {
                entity.getAttribute(ForgeMod.ENTITY_GRAVITY.get()).removeModifier(GRAVITY_MODI);
            }
        }
        super.removeAttributeModifiers(entity, attributeMap, amplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }

    @Mod.EventBusSubscriber
    public static class FastFallingEventHandler{
        @SubscribeEvent
        public static void onLivingFall(LivingFallEvent event){
            LivingEntity entity = event.getEntity();
            if(entity.hasEffect(ModEffects.FAST_FALLING.get())){
                event.setDamageMultiplier(0.0f);
            }
        }
    }
}
