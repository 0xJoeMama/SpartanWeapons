package net.spartanweapons.mixin;

import java.util.Optional;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.CraftingResultInventory;
import net.minecraft.inventory.RecipeInputInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.CraftingRecipe;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;
import net.spartanweapons.item.WoodTypeItem;
import net.spartanweapons.util.WoodHelper;

@SuppressWarnings("rawtypes")
@Mixin(CraftingScreenHandler.class)
public class CraftingScreenHandlerMixin {

    // @Inject(method = "updateResult", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isItemEnabled(Lnet/minecraft/resource/featuretoggle/FeatureSet;)Z"), locals = LocalCapture.CAPTURE_FAILSOFT)
    // private static void updateResultMixin(ScreenHandler handler, World world, PlayerEntity player, RecipeInputInventory craftingInventory, CraftingResultInventory resultInventory, CallbackInfo info,
    //         ServerPlayerEntity serverPlayerEntity, ItemStack itemStack, Optional optional, CraftingRecipe craftingRecipe, ItemStack itemStack2) {
    //     if (itemStack2.getNbt() != null && itemStack2.getItem() instanceof WoodTypeItem) {
    //         NbtCompound nbtCompound = itemStack2.getNbt().copy();
    //         nbtCompound.putInt("WoodType", WoodHelper.getWoodType(craftingInventory.getInputStacks()));
    //         itemStack2.setNbt(nbtCompound);
    //         // System.out.println("TEST " + itemStack2 + " : " + itemStack2.getNbt());
    //     }
    // }
}
