//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.synyster328.dragonslayer.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.synyster328.dragonslayer.items.DragonslayerItem;

public class ModItems {
    public static final DeferredRegister<Item> REGISTRY;
    public static final RegistryObject<Item> DRAGONSLAYER;

    public ModItems() {
    }

    static {
        REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "dragonslayer");
        DRAGONSLAYER = REGISTRY.register("dragonslayer", () -> {
            return new DragonslayerItem();
        });
    }
}
