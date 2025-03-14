package net.royling.LushScentedParadise.dataGen;

import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemKilledByPlayerCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.royling.LushScentedParadise.Registry.ModEntities;
import net.royling.LushScentedParadise.Registry.ModItems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class EntityLootTables extends EntityLootSubProvider {
    protected EntityLootTables(){
        super(FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {
        Map<EntityType<?>, LootTable.Builder> lootTables = new HashMap<>();
        lootTables.put(ModEntities.PHANTOM_LOTUS_KOI.get(), createLootTable(ModItems.PHANTOM_LOTUS_KOI.get(), 1));
        lootTables.put(ModEntities.GLOWPETAL_PIGFISH.get(), createLootTable(ModItems.GLOWPETAL_PIGFISH.get(), 1));
        lootTables.forEach(this::add);
    }
    private LootTable.Builder createLootTable(net.minecraft.world.item.Item dropItem, int amount) {
        return LootTable.lootTable()
                .withPool(net.minecraft.world.level.storage.loot.LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(amount))
                        .add(LootItem.lootTableItem(dropItem)
                                .when(LootItemKilledByPlayerCondition.killedByPlayer()))
                );
    }

    @Override
    protected Stream<EntityType<?>> getKnownEntityTypes() {
        return Stream.of(ModEntities.PHANTOM_LOTUS_KOI.get(),ModEntities.GLOWPETAL_PIGFISH.get());
    }
}
