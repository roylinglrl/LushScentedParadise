package net.royling.LushScentedParadise.villager;


import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.royling.LushScentedParadise.ModBlock.newFlower.ModFlowers;
import net.royling.LushScentedParadise.LushScentedParadise;
import net.royling.LushScentedParadise.Registry.ModBlocks;
import net.royling.LushScentedParadise.Registry.ModItems;

import java.util.List;

@Mod.EventBusSubscriber(modid = LushScentedParadise.MODID)
public class ModTrades {
    @SubscribeEvent
    public static void addTrades(VillagerTradesEvent event){
        if(event.getType() == ModVillagers.FLOWER_MASTER.get()){
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            /** 花匠一级兑换
             * 1E换1马鞭草种子
             * 1E换8个净水
             * 1E换部分花朵3个 （蒲公英，虞美人，芍药
             * 1E换2个花盆
             */
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD,1),
                    new ItemStack(ModFlowers.VERBENA_SEED.get(),2),
                    12,1,0.025F));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD,1),
                    new ItemStack(ModItems.CLEAN_WATER.get(),8),
                    12,1,0.025F));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD,1),
                    new ItemStack(Items.DANDELION,3),
                    12,1,0.025F));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD,1),
                    new ItemStack(Items.POPPY,3),
                    12,1,0.025F));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD,1),
                    new ItemStack(ModFlowers.PEONY_ITEM.get(),3),
                    12,1,0.025F));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD,1),
                    new ItemStack(Items.FLOWER_POT,2),
                    12,1,0.025F));

            /**花匠2级兑换
             * 1E换4牛奶
             * 1E换3薰衣草
             * 1E换绿茶叶
             * 1E换红茶叶
             * 1E换白茶叶
             */
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD,1),
                    new ItemStack(ModItems.MILK.get(),4),
                    12,6,0.025F));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD,1),
                    new ItemStack(ModFlowers.LAVENDER_ITEM.get(),3),
                    12,6,0.035F));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD,1),
                    new ItemStack(ModFlowers.GREEN_TEA_SEED.get(),1),
                    16,6,0.035F));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD,1),
                    new ItemStack(ModFlowers.BLACK_TEA_SEED.get(),1),
                    16,6,0.035F));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD,1),
                    new ItemStack(ModFlowers.WHITE_TEA_SEED.get(),1),
                    16,6,0.035F));
            /**花匠3级兑换
             * 12E换一茶壶
             * 20茶叶换1E
             * 6E换一剪刀
             */


            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModFlowers.GREEN_TEA_LEAVE.get(),20),
                    new ItemStack(Items.EMERALD,1),
                    12,12,0.35F));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD,12),
                    new ItemStack(ModBlocks.TEAPOT.get().asItem(),1),
                    12,12,0.035F));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD,6),
                    new ItemStack(Items.SHEARS,1),
                    12,12,0.035F));
            /**花匠4级兑换
            *   1E换14骨粉
            *   1E换6糖
             *   8E换种子袋/花袋
            */


            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD,1),
                    new ItemStack(Items.BONE_MEAL,14),
                    12,18,0.035F));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD,1),
                    new ItemStack(Items.SUGAR,6),
                    12,18,0.035F));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD,8),
                    new ItemStack(ModItems.FLOWER_BAG.get(),1),
                    12,18,0.035F));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD,8),
                    new ItemStack(ModItems.SEED_BAG.get(),1),
                    12,18,0.035F));

            /**花匠5级
             * 40E换一把花剑
             */
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD,48),
                    new ItemStack(ModItems.ORIGINAL_FLOWER_SWORD.get(),1),
                    8,0,0.035F));
        }
    }
}
