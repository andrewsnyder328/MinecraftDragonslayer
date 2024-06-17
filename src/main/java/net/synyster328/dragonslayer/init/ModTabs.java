//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.synyster328.dragonslayer.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.DeferredRegister;

@EventBusSubscriber(
        bus = Bus.MOD
)
public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY;

    public ModTabs() {
    }

    @SubscribeEvent
    public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
        if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
            tabData.accept(ModItems.DRAGONSLAYER.get());
        }

    }

    static {
        REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "dragonslayer");
    }
}
