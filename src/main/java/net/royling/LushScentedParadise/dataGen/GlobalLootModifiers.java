package net.royling.LushScentedParadise.dataGen;

import net.minecraft.advancements.critereon.LocationPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntry;
import net.minecraft.world.level.storage.loot.predicates.LocationCheck;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.royling.LushScentedParadise.LushScentedParadise;
import net.royling.LushScentedParadise.Registry.ModItems;
import net.royling.LushScentedParadise.loot.AddItemModifier;

import java.util.List;

@Mod.EventBusSubscriber(modid = LushScentedParadise.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class GlobalLootModifiers extends GlobalLootModifierProvider {
    public GlobalLootModifiers(PackOutput output) {
        super(output, LushScentedParadise.MODID);
    }

    @Override
    protected void start() {
        add("phantom_lotus_koi_form_fishing",new AddItemModifier(new LootItemCondition[]{
                LootItemRandomChanceCondition.randomChance(0.1f).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("gameplay/fishing/fish")).build()
        }, ModItems.PHANTOM_LOTUS_KOI.get()));
        add("glowpetal_pigfish_form_fishing",new AddItemModifier(new LootItemCondition[]{
                LootItemRandomChanceCondition.randomChance(0.1f).build(),

                new LootTableIdCondition.Builder(new ResourceLocation("gameplay/fishing/fish")).build()
        }, ModItems.GLOWPETAL_PIGFISH.get()));
    }
}
