
package net.alexatorv13.alexatorrandomthings.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class CashRegisterScreenHandler extends ScreenHandler {
    private final Inventory inventory;

    public CashRegisterScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(5));
    }

    public CashRegisterScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory) {
        super(ModScreenHandlers.CASH_REGISTER_SCREEN_HANDLER_SCREEN, syncId);
        checkSize(inventory, 5);
        this.inventory = inventory;
        inventory.onOpen(playerInventory.player);

        this.addSlot(new Slot(inventory, 0, 43, 20));
        this.addSlot(new Slot(inventory, 1, 62, 20));
        this.addSlot(new Slot(inventory, 2, 80, 20));
        this.addSlot(new Slot(inventory, 3, 98, 20));
        this.addSlot(new Slot(inventory, 4, 115, 20));


        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);
    }

    public ItemStack quickMove(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = (Slot)this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }

    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    public ItemStack transferSlot(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = (Slot)this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }private void addPlayerInventory(PlayerInventory playerInventory) {




        this.addSlot(new Slot(playerInventory, 9,7,50));
        this.addSlot(new Slot(playerInventory, 10,25,50));
        this.addSlot(new Slot(playerInventory, 11,43,50));
        this.addSlot(new Slot(playerInventory, 12,62,51));
        this.addSlot(new Slot(playerInventory, 13,82,50));
        this.addSlot(new Slot(playerInventory, 14,98,50));
        this.addSlot(new Slot(playerInventory, 15,115,50));
        this.addSlot(new Slot(playerInventory, 16,134,50));
        this.addSlot(new Slot(playerInventory, 17,152,50));
        this.addSlot(new Slot(playerInventory, 18,7,68));
        this.addSlot(new Slot(playerInventory, 19,25,68));
        this.addSlot(new Slot(playerInventory, 20,43,68));
        this.addSlot(new Slot(playerInventory, 21,62,68));
        this.addSlot(new Slot(playerInventory, 22,82,68));
        this.addSlot(new Slot(playerInventory, 23,98,68));
        this.addSlot(new Slot(playerInventory, 24,115,68));
        this.addSlot(new Slot(playerInventory, 25,134,68));
        this.addSlot(new Slot(playerInventory, 26,152,68));
        this.addSlot(new Slot(playerInventory, 27,7,86));
        this.addSlot(new Slot(playerInventory, 28,25,86));
        this.addSlot(new Slot(playerInventory, 29,43,86));
        this.addSlot(new Slot(playerInventory, 30,62,86));
        this.addSlot(new Slot(playerInventory, 31,82,86));
        this.addSlot(new Slot(playerInventory, 32,98,86));
        this.addSlot(new Slot(playerInventory, 33,115,86));
        this.addSlot(new Slot(playerInventory, 34,134,86));
        this.addSlot(new Slot(playerInventory, 35,152,86));



    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 108));
        }
    }
}
