package net.spartanweapons.mixin.client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.BakedQuad;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.spartanweapons.init.ConfigInit;
import net.spartanweapons.init.ItemInit;
import net.spartanweapons.item.Cutlass;
import net.spartanweapons.util.WoodHelper;

@SuppressWarnings("unused")
@Environment(EnvType.CLIENT)
@Mixin(ItemRenderer.class)
public class ItemRendererMixin {

    // has to get injected into other method where bakedmodel is called too
    // remove handlebar of normal wood
    // @Inject(method = "Lnet/minecraft/client/render/item/ItemRenderer;renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/render/model/json/ModelTransformationMode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/world/World;III)V", at = @At("TAIL"))
    // private void renderItemMixin(@Nullable LivingEntity entity, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers,
    //         @Nullable World world, int light, int overlay, int seed, CallbackInfo info) {
    //     if (stack.hasNbt() && !stack.getNbt().contains("WoodType") && stack.getItem() instanceof Cutlass) {
    //         NbtCompound nbtCompound = stack.getNbt().copy();
    //         nbtCompound.putInt("WoodType", 0);
    //         stack.setNbt(nbtCompound);
    //     }
    //     if (stack.hasNbt() && stack.getNbt().contains("WoodType")) {
    //         ItemStack itemStack;
    //         if (!WoodHelper.HANDLE_MAP.isEmpty() && WoodHelper.HANDLE_MAP.containsKey(stack)) {
    //             itemStack = WoodHelper.HANDLE_MAP.get(stack);
    //         } else {
    //             itemStack = new ItemStack(ItemInit.HANDLES.get(stack.getNbt().getInt("WoodType")));
    //             WoodHelper.HANDLE_MAP.put(stack, itemStack);
    //         }
    //         BakedModel otherBakedModel = this.getModel(itemStack, world, entity, seed);
    //         this.renderItem(itemStack, renderMode, leftHanded, matrices, vertexConsumers, light, overlay, otherBakedModel);
    //     }
    // }

    // @Shadow
    // public BakedModel getModel(ItemStack stack, @Nullable World world, @Nullable LivingEntity entity, int seed) {
    //     return null;
    // }

    // @Shadow
    // public void renderItem(ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay,
    //         BakedModel model) {
    // }

}
