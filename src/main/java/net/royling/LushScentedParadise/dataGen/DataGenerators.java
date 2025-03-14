package net.royling.LushScentedParadise.dataGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.royling.LushScentedParadise.LushScentedParadise;
import net.royling.LushScentedParadise.dataGen.WorldGenData.ModDatagenProvider;
import net.royling.LushScentedParadise.villager.ModPoiTypeTProvider;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = LushScentedParadise.MODID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(),new ModRecipeProvider(packOutput));
        generator.addProvider(event.includeClient(),ModLootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(),new ModBlockStateProvider(packOutput,existingFileHelper));
        generator.addProvider(event.includeClient(),new ModItemModelProvider(packOutput,existingFileHelper));

        ModBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                new ModBlockTagGenerator(packOutput,lookupProvider,existingFileHelper));
        generator.addProvider(event.includeServer(),new ModItemTagGenerator(packOutput,lookupProvider,blockTagGenerator.contentsGetter(),existingFileHelper));

        generator.addProvider(event.includeServer(),new ModPoiTypeTProvider(packOutput,lookupProvider,existingFileHelper));
        generator.addProvider(event.includeServer(),new ModDatagenProvider(packOutput,lookupProvider));
        generator.addProvider(event.includeServer(),new GlobalLootModifiers(packOutput));

    }



}
