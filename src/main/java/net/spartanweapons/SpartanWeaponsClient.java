package net.spartanweapons;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.random.Random;
import net.spartanweapons.init.ItemInit;
import net.spartanweapons.init.ModelInit;
import net.spartanweapons.init.RenderInit;
import net.spartanweapons.item.SpartanWeaponItem;
import net.spartanweapons.util.WoodType;

import java.util.Objects;

@Environment(EnvType.CLIENT)
public class SpartanWeaponsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        var random = Random.create();
        ModelLoadingPlugin.register(pluginContext -> {
            // stick
            pluginContext.addModels(WoodType.REGISTRY.streamEntries().map(entry -> Identifier.of(SpartanWeaponsMain.MODID, "item/stick/stick_" + entry.getKey().get().getValue().getPath())).toList());
            ItemInit.INSTANCE.getItems().forEach((id, item) -> {
                if (item instanceof SpartanWeaponItem weaponItem && weaponItem.hasHandle()) {
                    pluginContext.addModels(WoodType.REGISTRY.getIds().stream()
                            .map(typeId -> Identifier.of(id.getNamespace(), String.format("item/%s/%s_%s", SpartanWeaponItem.getItemName(id), id.getPath(), typeId.getPath())))
                            .toList()
                    );
                }
            });
        });

        BuiltinItemRendererRegistry.INSTANCE.register(ItemInit.STICK, (stack, mode, matrices, vertexConsumers, light, overlay) -> {
            var type = stack.get(WoodType.WOOD_TYPE_COMPONENT);
            if (type == null) type = WoodType.OAK;

            Identifier itemId = Registries.ITEM.getId(stack.getItem());
            Identifier typeId = Objects.requireNonNull(WoodType.REGISTRY.getId(type));
            var modelId = Identifier.of(itemId.getNamespace(), "item/stick/" + itemId.getPath() + "_" + typeId.getPath());
            var model = MinecraftClient.getInstance().getBakedModelManager().getModel(modelId);

            var quads = model.getQuads(null, null, random);

            var buf = vertexConsumers.getBuffer(RenderLayer.getCutoutMipped());
            var matrix = matrices.peek();

            for (var quad : quads) {
                buf.quad(matrix, quad, 1, 1, 1, 1, light, overlay);
            }
        });

        ItemInit.INSTANCE.getItems().entrySet().stream()
                .filter(entry -> entry.getValue() instanceof SpartanWeaponItem item && item.hasHandle())
                .forEach(entry -> BuiltinItemRendererRegistry.INSTANCE.register(entry.getValue(), (stack, mode, matrices, vertexConsumers, light, overlay) -> {
                    var id = entry.getKey();
                    var itemName = SpartanWeaponItem.getItemName(id);

                    matrices.push();
                    // steal the transformations from handheld
                    var handHeld = MinecraftClient.getInstance().getBakedModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of("diamond_sword")));
                    if (handHeld != null) handHeld.getTransformation().getTransformation(mode).apply(mode != ModelTransformationMode.FIRST_PERSON_LEFT_HAND, matrices);
                    if (mode != ModelTransformationMode.GUI)  matrices.translate(0.5, 0.5, 0.5);

                    var type = stack.get(WoodType.WOOD_TYPE_COMPONENT);
                    if (type == null) type = WoodType.OAK;

                    @SuppressWarnings("DataFlowIssue")
                    var modelId = Identifier.of(id.getNamespace(), String.format("item/%s/%s_%s", itemName, id.getPath(), WoodType.REGISTRY.getId(type).getPath()));
                    var model = MinecraftClient.getInstance().getBakedModelManager().getModel(modelId);

                    var quads = model.getQuads(null, null, random);

                    var buf = vertexConsumers.getBuffer(RenderLayer.getCutoutMipped());
                    var matrix = matrices.peek();

                    for (var quad : quads) buf.quad(matrix, quad, 1, 1, 1, 1, light, overlay);
                    matrices.pop();
                }));
        ModelInit.init();
        RenderInit.init();
    }
}
