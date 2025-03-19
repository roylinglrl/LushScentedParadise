package net.royling.LushScentedParadise.Botania.BotaniaFood;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.LushScentedParadise.Botania.Reg.BotaniaEffects;
import net.royling.LushScentedParadise.Item.Flowertea.tea;
import net.royling.LushScentedParadise.LushScentedParadise;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BotaniaFoods {
    public static final FoodProperties ARCANA_TEA_P = new FoodProperties.Builder()
            .nutrition(2).saturationMod(1f).alwaysEat().build();
    public static final FoodProperties WHITE_DAISY_P = new FoodProperties.Builder()
            .nutrition(2).saturationMod(1f).alwaysEat()
            .effect(()->new MobEffectInstance(BotaniaEffects.NATURE_RESONANCE.get(),1200,0),1F).build();
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LushScentedParadise.MODID);
    //阿卡纳茶
    public static final RegistryObject<Item> ARCANA_TEA = ITEMS.register("arcana_tea",()->new tea(new Item.Properties().food(BotaniaFoods.ARCANA_TEA_P).stacksTo(16),25){
        @Override
        public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
            if(pLevel.isClientSide) return null;
            if(pLivingEntity instanceof ServerPlayer player){
                ExpOrbSpawnerTask.startExpOrbSpawning(player,(ServerLevel) pLevel);
                player.getCooldowns().addCooldown(this,600);
            }
            return super.finishUsingItem(pStack,pLevel,pLivingEntity);
        }

        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.arcana_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    });
    //白雏菊茶
    public static final RegistryObject<Item> WHITE_DAISY_TEA = ITEMS.register("white_daisy_tea",
            ()->new tea(new Item.Properties().food(BotaniaFoods.WHITE_DAISY_P).stacksTo(16),25){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(Component.translatable("tooltip.lushscentedparadise.white_daisy_tea.text1").setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)));
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                }
            });

}
