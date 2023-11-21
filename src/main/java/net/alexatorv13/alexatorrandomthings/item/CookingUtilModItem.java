package net.alexatorv13.alexatorrandomthings.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.command.argument.serialize.ConstantArgumentSerializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class CookingUtilModItem  extends Item implements FabricItem {


    public CookingUtilModItem(Settings settings) {
        super(settings);
    }

    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
            return new ItemStack(itemStack.getItem());
        }


        public boolean hasCraftingRemainingItem(ItemStack stack) {
            return true;
        }

}
