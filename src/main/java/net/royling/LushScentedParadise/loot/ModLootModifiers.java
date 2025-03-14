package net.royling.LushScentedParadise.loot;

import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.LushScentedParadise.LushScentedParadise;

public class ModLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOTTABLE_MODIFIER_SERIALIZERS = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, LushScentedParadise.MODID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_ITEM =
            LOOTTABLE_MODIFIER_SERIALIZERS.register("add_item",AddItemModifier.CODEC);

    public static void register(IEventBus E){
        LOOTTABLE_MODIFIER_SERIALIZERS.register(E);
    }
}
