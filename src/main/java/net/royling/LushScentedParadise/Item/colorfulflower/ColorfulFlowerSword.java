package net.royling.LushScentedParadise.Item.colorfulflower;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class ColorfulFlowerSword extends SwordItem {
    private static final int COOLDOWNTICKS = 30*20;
    private static final int STRENGTH_DURATION = 12*20;

    public ColorfulFlowerSword(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if(!pLevel.isClientSide){
            pPlayer.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,STRENGTH_DURATION,0));
            pPlayer.getCooldowns().addCooldown(this, COOLDOWNTICKS);
        }
        pLevel.playSound(null,pPlayer.getX(),pPlayer.getX(),pPlayer.getZ(), SoundEvents.ENCHANTMENT_TABLE_USE,pPlayer.getSoundSource(),8.0f,1.0f);
        return super.use(pLevel,pPlayer,pUsedHand);
    }
}
