package net.royling.LushScentedParadise.MobEffect;

import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class DysenteryInfectionEffect extends MobEffect {
    private static final AttributeModifier MOVEMENT_MODI = new AttributeModifier("dysenteryo",-0.2,AttributeModifier.Operation.MULTIPLY_TOTAL);
    private static final AttributeModifier ATTACK_MODI = new AttributeModifier("dysenteryt",-0.2,AttributeModifier.Operation.MULTIPLY_TOTAL);
    public DysenteryInfectionEffect() {
        super(MobEffectCategory.HARMFUL,0x964B00);
        this.addAttributeModifier(Attributes.MOVEMENT_SPEED,"461cebed-6785-409c-8c1b-40c9d24e1fa1",-0.2,AttributeModifier.Operation.MULTIPLY_TOTAL);
        this.addAttributeModifier(Attributes.ATTACK_DAMAGE,"6e90b561-5664-4dc8-8e6f-3a7e8bef0161",-0.2,AttributeModifier.Operation.MULTIPLY_TOTAL);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(!pLivingEntity.level().isClientSide()&&pLivingEntity.tickCount%200==0){
            if(pLivingEntity.level()instanceof ServerLevel serverLevel){
                if(!pLivingEntity.getAttribute(Attributes.MOVEMENT_SPEED).hasModifier(MOVEMENT_MODI)){
                    pLivingEntity.getAttribute(Attributes.MOVEMENT_SPEED).addTransientModifier(MOVEMENT_MODI);
                }
                if(!pLivingEntity.getAttribute(Attributes.ATTACK_DAMAGE).hasModifier(ATTACK_MODI)){
                    pLivingEntity.getAttribute(Attributes.ATTACK_DAMAGE).addTransientModifier(ATTACK_MODI);
                }
            }
        }
        super.applyEffectTick(pLivingEntity,pAmplifier);
    }


    @Override
    public void removeAttributeModifiers(LivingEntity pLivingEntity, AttributeMap pAttributeMap, int pAmplifier) {
        if(!pLivingEntity.level().isClientSide()){
            if(pLivingEntity.getAttribute(Attributes.MOVEMENT_SPEED).hasModifier(MOVEMENT_MODI)){
                pLivingEntity.getAttribute(Attributes.MOVEMENT_SPEED).removeModifier(MOVEMENT_MODI);
            }
            if(pLivingEntity.getAttribute(Attributes.ATTACK_DAMAGE).hasModifier(ATTACK_MODI)){
                pLivingEntity.getAttribute(Attributes.ATTACK_DAMAGE).removeModifier(ATTACK_MODI);
            }
        }
        super.removeAttributeModifiers(pLivingEntity,pAttributeMap,pAmplifier);
    }
}
