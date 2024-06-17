//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.synyster328.dragonslayer.items;

import java.util.List;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

public class DragonslayerItem extends SwordItem {
    public DragonslayerItem() {
        super(new Tier() {
            @Override
            public int getUses() {
                return 9999;
            }

            @Override
            public float getSpeed() {
                return 4.0F;
            }

            @Override
            public float getAttackDamageBonus() {
                return 10.0F;
            }

            @Override
            public int getLevel() {
                return 10;
            }

            @Override
            public int getEnchantmentValue() {
                return 99;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack[]{new ItemStack(Items.IRON_BLOCK)});
            }
        }, 0, -2F, new Item.Properties());
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
    }
}
