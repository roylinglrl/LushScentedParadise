package net.royling.LushScentedParadise;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.royling.LushScentedParadise.Botania.BotaniaFood.BotaniaFoods;
import net.royling.LushScentedParadise.Botania.BotaniaTeapot.ManaTeapotScreen;
import net.royling.LushScentedParadise.Botania.Reg.*;
import net.royling.LushScentedParadise.Botania.LSPBotaniaItems;
import net.royling.LushScentedParadise.Item.Flowertea.ModFoods;
import net.royling.LushScentedParadise.Item.StorageBagItem.StorageBagScreen;
import net.royling.LushScentedParadise.Item.coffee.ModCoffee;
import net.royling.LushScentedParadise.Item.colorfulflower.MagicArrowRenderer;
import net.royling.LushScentedParadise.Item.milktea.ModMilktea;
import net.royling.LushScentedParadise.Item.snack.ModSnack;
import net.royling.LushScentedParadise.ModEntity.GlowpetalPigfish;
import net.royling.LushScentedParadise.ModEntity.PhantomLotusKoi;
import net.royling.LushScentedParadise.Registry.*;
import net.royling.LushScentedParadise.ModBlock.TeapotBlock.TeapotScreen;
import net.royling.LushScentedParadise.ModBlock.newFlower.ModFlowers;
import net.royling.LushScentedParadise.loot.ModLootModifiers;
import net.royling.LushScentedParadise.villager.ModVillagers;
import org.slf4j.Logger;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

import static net.royling.LushScentedParadise.Registry.ModEntities.GLOWPETAL_PIGFISH;
import static net.royling.LushScentedParadise.Registry.ModEntities.PHANTOM_LOTUS_KOI;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LushScentedParadise.MODID)
@SuppressWarnings("removal")
public class LushScentedParadise
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "lushscentedparadise";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    @SuppressWarnings("removal")
    public LushScentedParadise()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);

        ModBlockEntities.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModFlowers.register(modEventBus);
        ModItems.register(modEventBus);
        ModRecipeTypes.register(modEventBus);
        ModRecipeSerializers.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
        ModFoods.register(modEventBus);
        ModVillagers.register(modEventBus);
        ModEffects.register(modEventBus);
        ModSounds.SOUND_EVENTS.register(modEventBus);
        ModEntities.register(modEventBus);
        //ModFlowers.register(modEventBus);
        // Register the commonSetup method for modloading
        if(ModList.get().isLoaded("botania")) {
            LSPBotaniaItems.register(modEventBus);
            BotaniaRecipeTypes.RECIPE_TYPES.register(modEventBus);
            BotaniaRecipeSerializers.SERIALIZERS.register(modEventBus);
            BotaniaMenuTypes.MENUS.register(modEventBus);
            BotaniaBlocks.BLOCKS.register(modEventBus);
            BotaniaBlockEntities.BLOCK_ENTITIES.register(modEventBus);
            BotaniaFoods.ITEMS.register(modEventBus);
            BotaniaEffects.EFFECTS.register(modEventBus);
        }
        ModCoffee.COFFEES.register(modEventBus);
        ModSnack.SNACKS.register(modEventBus);
        ModMilktea.MILKTEAS.register(modEventBus);
        ModFeatures.FEATURES.register(modEventBus);
        ModLootModifiers.LOOTTABLE_MODIFIER_SERIALIZERS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::commonSetup);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(()->{
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModFlowers.VIOLET.getId(), ModFlowers.POTTED_VIOLET);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModFlowers.HIBISCUS.getId(), ModFlowers.POTTED_HIBISCUS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModFlowers.PEONY.getId(), ModFlowers.POTTED_PEONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModFlowers.JASMINE.getId(), ModFlowers.POTTED_JASMINE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModFlowers.LAVENDER.getId(), ModFlowers.POTTED_LAVENDER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModFlowers.LILY.getId(), ModFlowers.POTTED_LILY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModFlowers.SAFFLOWER.getId(), ModFlowers.POTTED_SAFFLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModFlowers.SNOW_LOTUS.getId(), ModFlowers.POTTED_SNOW_LOTUS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModFlowers.MARIGOLD.getId(), ModFlowers.POTTED_MARIGOLD);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModFlowers.OENOTHERA_LINDHEIMERI.getId(), ModFlowers.POTTED_OENOTHERA_LINDHEIMERI);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModFlowers.PERILLA.getId(), ModFlowers.POTTED_PERILLA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModFlowers.HONEYSUCKLE.getId(), ModFlowers.POTTED_HONEYSUCKLE);

        });

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
    }
    private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            event.enqueueWork(()->{
                MenuScreens.register(ModMenuTypes.TEAPOT_MENU.get(), TeapotScreen::new);
                MenuScreens.register(ModMenuTypes.STORAGE_BAG_MENU.get(), StorageBagScreen::new);
                if(ModList.get().isLoaded("botania")) {
                    MenuScreens.register(BotaniaMenuTypes.MANA_TEAPOT_MENU.get(), ManaTeapotScreen::new);
                }
                SpawnPlacements.register(GLOWPETAL_PIGFISH.get(),SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                        GlowpetalPigfish::checkUndergroundWaterSpawnRules);
                SpawnPlacements.register(PHANTOM_LOTUS_KOI.get(),SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                        PhantomLotusKoi::checkUndergroundWaterSpawnRules);

            });
        }
        @SubscribeEvent
        public static void registerRenders(EntityRenderersEvent.RegisterRenderers event){
            ModEntityRenderers.registerRenderers(event);
            event.registerEntityRenderer(ModEntities.MAGIC_ARROW.get(), MagicArrowRenderer::new);

        }
    }
}
