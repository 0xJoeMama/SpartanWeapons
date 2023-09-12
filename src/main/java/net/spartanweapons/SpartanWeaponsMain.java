package net.spartanweapons;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.spartanweapons.init.ConfigInit;
import net.spartanweapons.init.ItemInit;
import net.spartanweapons.init.RecipeInit;
import net.spartanweapons.init.TagInit;

public class SpartanWeaponsMain implements ModInitializer {

    public static final Identifier ID(String path) {
        return new Identifier("spartanweapons", path);
    }

    @Override
    public void onInitialize() {
        ConfigInit.init();
        ItemInit.init();
        RecipeInit.init();
        TagInit.init();
    }

}
