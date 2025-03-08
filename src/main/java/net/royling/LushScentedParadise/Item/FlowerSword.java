package net.royling.LushScentedParadise.Item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.royling.LushScentedParadise.util.ModTags;
import net.royling.LushScentedParadise.ModBlock.newFlower.ModFlowers;

import java.util.Random;

public class FlowerSword extends SwordItem {
    public FlowerSword(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        boolean result = super.hurtEnemy(pStack,pTarget,pAttacker);
        ItemStack offhandItem = pAttacker.getOffhandItem();
        if(isFlower(offhandItem)){
            triggerFlowerEffect((Player)pAttacker,offhandItem,pTarget,pAttacker.level());
        }
        return  result;
    }

    private boolean isFlower(ItemStack stack){
        System.out.println(ModTags.Items.SWORD_FLOWER);
        return stack.is(ModTags.Items.SWORD_FLOWER);
    }
    private void triggerFlowerEffect(Player player,ItemStack flower,LivingEntity target,Level world){
        if(world.isClientSide) return;
        if(target==null)return;
        Item item = flower.getItem();
        //铃兰
        if(item==Items.LILY_OF_THE_VALLEY){
            target.addEffect(new MobEffectInstance(MobEffects.POISON,100,0));
        }
        //牡丹
        else if(item ==Items.PEONY){
            if(new Random().nextInt(100)<20){
                player.addEffect(new MobEffectInstance(MobEffects.HEAL,1,0));
            }
        }
        //凋零玫瑰
        else if(item==Items.WITHER_ROSE){
            target.addEffect(new MobEffectInstance(MobEffects.WITHER,200,0));
            if(target.getHealth()<=0){
                ItemStack drop = new ItemStack(Items.WITHER_ROSE);
                target.spawnAtLocation(drop);
            }
        }
        else if(item==Items.TORCHFLOWER){
            target.setSecondsOnFire(4);
            if(target.getHealth()<=0){
                ItemStack drop = new ItemStack(Items.TORCH);
                target.spawnAtLocation(drop);
            }
        }
        else if(item==ModFlowers.HIBISCUS_ITEM.get()){
            target.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN,120,0));
        }
        else if(item == ModFlowers.SNOW_LOTUS_ITEM.get()){
            target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,60,1));
            if(target.getHealth()<=0){
                ItemStack drop = new ItemStack(Items.ICE);
                target.spawnAtLocation(drop);
            }
        }
        else if(item == ModFlowers.OENOTHERA_LINDHEIMERI_ITEM.get()){
            if(new Random().nextInt(100)<10){
                player.addEffect(new MobEffectInstance(MobEffects.REGENERATION,240,0));
            }
        }else {return;}
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);
        if(pIsSelected){
            if(!pLevel.isClientSide&& pLevel.getDayTime()%24000L<13000L){
                if(pEntity instanceof Player player){
                    if(player.getOffhandItem().getItem()==Items.SUNFLOWER){
                        //if(pLevel.getDayTime()%20==0){
                            if(player.getMainHandItem().getDamageValue()>0){
                                player.getMainHandItem().setDamageValue(player.getMainHandItem().getDamageValue()-1);
                            }
                        //}
                    }
                }
            }
        }
    }
}
