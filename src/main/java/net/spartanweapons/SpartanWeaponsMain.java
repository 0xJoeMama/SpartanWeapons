package net.spartanweapons;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.spartanweapons.init.*;
import net.spartanweapons.util.WoodType;

public class SpartanWeaponsMain implements ModInitializer {
    public static final String MODID = "spartanweapons";

    public static Identifier id(String path) {
        return Identifier.of(MODID, path);
    }

    @Override
    public void onInitialize() {
        ConfigInit.init();
        WoodType.init();
        ItemInit.INSTANCE.register();
        EntityInit.init();
        RecipeInit.init();
        TagInit.init();
    }
}
