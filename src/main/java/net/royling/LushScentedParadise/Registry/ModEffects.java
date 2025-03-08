package net.royling.LushScentedParadise.Registry;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Mob;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.LushScentedParadise.LushScentedParadise;
import net.royling.LushScentedParadise.MobEffect.*;

public class ModEffects {
    public static final DeferredRegister<MobEffect> EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, LushScentedParadise.MODID);

    public static final RegistryObject<MobEffect> COLD_RESISTANCE = EFFECTS.register("cold_resistance",
            ColdResistanceEffect::new);
    public static final RegistryObject<MobEffect> SAND_WALKER = EFFECTS.register("sand_walker",
            SandWalkerEffect::new);
    public static final RegistryObject<MobEffect> FAST_FALLING = EFFECTS.register(
            "fast_falling", ExFastfalling::new);
    public static final RegistryObject<MobEffect> PARASITE_INFECTION = EFFECTS.register(
            "parasite_infection", ParasiteInfectionEffect::new);
    public static final RegistryObject<MobEffect> DYSENTERY_INFECTION = EFFECTS.register(
            "dysentery_infection", DysenteryInfectionEffect::new);

    public static void register(IEventBus eventBus){
        EFFECTS.register(eventBus);
    }
}
