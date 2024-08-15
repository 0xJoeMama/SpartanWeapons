package net.spartanweapons.item;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.spartanweapons.init.ItemInit;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MaterialItemContainer<T extends Item> {
    private final Map<ToolMaterial, T> items = new HashMap<>();

    public MaterialItemContainer(ItemInit registrar, String name, Function<ToolMaterial, Item.Settings> props, BiFunction<ToolMaterial, Item.Settings, T> factory, ToolMaterial... materials) {
        if (materials.length == 0) materials = ToolMaterials.values();

        for (var material : materials) {
            var item = factory.apply(material, props.apply(material));
            registrar.register(material.toString().toLowerCase() + "_" + name, item);
            this.items.put(material, item);
        }
    }

    public void emitDatagen() {

    }

    @NotNull
    public T getUnsafe(ToolMaterial material) {
        return Objects.requireNonNull(this.items.get(material));
    }

    public Optional<T> get(ToolMaterial material) {
        return Optional.ofNullable(this.items.get(material));
    }
}
