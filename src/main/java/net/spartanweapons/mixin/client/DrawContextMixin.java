package net.spartanweapons.mixin.client;

import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.World;
import net.spartanweapons.init.ItemInit;
import net.spartanweapons.item.Cutlass;
import net.spartanweapons.util.WoodHelper;

@SuppressWarnings("unused")
@Environment(EnvType.CLIENT)
@Mixin(DrawContext.class)
public class DrawContextMixin {

    // @Shadow
    // @Mutable
    // @Final
    // private MinecraftClient client;
    // @Shadow
    // @Mutable
    // @Final
    // private MatrixStack matrices;

    // @Inject(method = "Lnet/minecraft/client/gui/DrawContext;drawItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;IIII)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/item/ItemRenderer;renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/render/model/json/ModelTransformationMode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;IILnet/minecraft/client/render/model/BakedModel;)V"))
    // private void drawItemMixin(@Nullable LivingEntity entity, @Nullable World world, ItemStack stack, int x, int y, int seed, int z, CallbackInfo info) {
    //     if (!stack.isEmpty() && stack.hasNbt()) {

    //         if (stack.hasNbt() && !stack.getNbt().contains("WoodType") && stack.getItem() instanceof Cutlass) {
    //             NbtCompound nbtCompound = stack.getNbt().copy();
    //             nbtCompound.putInt("WoodType", 0);
    //             stack.setNbt(nbtCompound);
    //         }
    //         if (stack.getNbt().contains("WoodType")) {
    //             ItemStack itemStack;
    //             if (!WoodHelper.HANDLE_MAP.isEmpty() && WoodHelper.HANDLE_MAP.containsKey(stack)) {
    //                 itemStack = WoodHelper.HANDLE_MAP.get(stack);
    //             } else {
    //                 itemStack = new ItemStack(ItemInit.HANDLES.get(stack.getNbt().getInt("WoodType")));
    //                 WoodHelper.HANDLE_MAP.put(stack, itemStack);
    //             }

    //             BakedModel otherBakedModel = this.client.getItemRenderer().getModel(itemStack, world, entity, seed);
    //             this.client.getItemRenderer().renderItem(itemStack, ModelTransformationMode.GUI, false, this.matrices, this.getVertexConsumers(), 15728880, OverlayTexture.DEFAULT_UV,
    //                     otherBakedModel);
    //         }
    //     }
    // }

    // @Shadow
    // public VertexConsumerProvider.Immediate getVertexConsumers() {
    //     return null;
    // }

    // @Shadow
    // public void draw() {
    // }
}
