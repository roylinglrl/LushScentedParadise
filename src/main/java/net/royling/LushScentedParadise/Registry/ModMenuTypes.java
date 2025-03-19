package net.royling.LushScentedParadise.Registry;

import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.royling.LushScentedParadise.Item.StorageBagItem.StorageBagMenu;
import net.royling.LushScentedParadise.LushScentedParadise;
import net.royling.LushScentedParadise.ModBlock.TeapotBlock.TeapotMenu;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, LushScentedParadise.MODID);

    public static final RegistryObject<MenuType<TeapotMenu>> TEAPOT_MENU =
            MENUS.register("teapot_menu",
                    () -> IForgeMenuType.create(TeapotMenu::new));

    public static final RegistryObject<MenuType<StorageBagMenu>> STORAGE_BAG_MENU=
            MENUS.register("storage_bag",
                    ()->IForgeMenuType.create(StorageBagMenu::new));

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
