package net.royling.LushScentedParadise.MobEffect;


import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.royling.LushScentedParadise.Registry.ModEffects;

public class ParasiteInfectionEffect extends MobEffect {

    public ParasiteInfectionEffect() {
        super(MobEffectCategory.HARMFUL,0x6A0DAD);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(pLivingEntity instanceof Player player){
            FoodData foodData = player.getFoodData();
            int currentFood = foodData.getFoodLevel();
            int lastFood = player.getPersistentData().getInt("ParasiteLastFood");

            if (lastFood == 0) {
                lastFood = currentFood;
                player.getPersistentData().putInt("ParasiteLastFood", lastFood);
            }
            if (currentFood > lastFood) {
                foodData.setFoodLevel(lastFood);
            } else {
                player.getPersistentData().putInt("ParasiteLastFood", currentFood);
            }
            if(player.tickCount%200==0){
                int newFoodLevel = Math.max(0, foodData.getFoodLevel() - 1);
                foodData.setFoodLevel(newFoodLevel);
                player.getPersistentData().putInt("ParasiteLastFood", newFoodLevel);
            }
        }
        super.applyEffectTick(pLivingEntity,pAmplifier);
    }

    @Override
    public void removeAttributeModifiers(LivingEntity pLivingEntity, AttributeMap pAttributeMap, int pAmplifier) {
        if(pLivingEntity instanceof Player player){
            player.getPersistentData().remove("ParasiteLastFood");
        }
        super.removeAttributeModifiers(pLivingEntity,pAttributeMap,pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }

}
