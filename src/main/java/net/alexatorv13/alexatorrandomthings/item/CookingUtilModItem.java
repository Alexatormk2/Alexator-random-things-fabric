package net.alexatorv13.alexatorrandomthings.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.command.argument.serialize.ConstantArgumentSerializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class CookingUtilModItem  extends Item implements FabricItem {


    public CookingUtilModItem(Settings settings) {
        super(settings);
    }
    public  ItemStack getRecipeRemainder(ItemStack itemStack){

        return new ItemStack(itemStack.getItem());
    }

    public  ItemStack getRecipeRemainderItem(Item item){

        assert item.getRecipeRemainder() != null;
        return new ItemStack(item.getRecipeRemainder());
    }


        public boolean hasCraftingRemainingItem(ItemStack stack) {
            return true;
        }

}
