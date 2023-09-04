package net.spartanweapons;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.spartanweapons.init.ModelInit;

@Environment(EnvType.CLIENT)
public class SpartanWeaponsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModelInit.init();
    }

}
