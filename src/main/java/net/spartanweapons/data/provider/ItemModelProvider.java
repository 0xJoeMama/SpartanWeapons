package net.spartanweapons.data.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;
import net.spartanweapons.SpartanWeaponsMain;
import net.spartanweapons.init.ItemInit;
import net.spartanweapons.item.SpartanWeaponItem;
import net.spartanweapons.util.WoodType;

import java.util.Optional;

public class ItemModelProvider extends FabricModelProvider {
    public static final Model BUILTIN = new Model(Optional.of(Identifier.ofVanilla("builtin/entity")), Optional.empty());

    public ItemModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator gen) {
        for (var type : WoodType.REGISTRY.getKeys()) {
            var stickId = Identifier.of(SpartanWeaponsMain.MODID, "item/stick/stick_" + type.getValue().getPath());
            Models.GENERATED.upload(stickId, TextureMap.layer0(Identifier.of(SpartanWeaponsMain.MODID, "item/sticks/" + type.getValue().getPath() + "_stick")), gen.writer);
        }
        gen.register(ItemInit.STICK, BUILTIN);

        ItemInit.INSTANCE.getItems().forEach((identifier, item) -> {
            if (item instanceof SpartanWeaponItem) {
                var itemName = SpartanWeaponItem.getItemName(identifier);
                // handle material
                var modelLocation = SpartanWeaponsMain.id(String.format("item/%s/%s", itemName, identifier.getPath()));
                if (((SpartanWeaponItem) item).hasHandle()) {
                    for (var typeId : WoodType.REGISTRY.getIds()) {
                        var handleLoc = SpartanWeaponsMain.id(String.format("item/%s/alt_wood/%s", itemName, typeId.getPath()));
                        Models.GENERATED_TWO_LAYERS.upload(modelLocation.withSuffixedPath("_" + typeId.getPath()), TextureMap.layered(modelLocation, handleLoc), gen.writer);
                    }
                    gen.register(item, BUILTIN);
                } else {
                    Models.GENERATED.upload(identifier.withPrefixedPath("item/"), TextureMap.layer0(modelLocation), gen.writer);
                }
            }
        });
    }
}
