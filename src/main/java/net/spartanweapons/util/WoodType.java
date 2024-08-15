package net.spartanweapons.util;

import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.fabricmc.fabric.api.event.registry.RegistryAttribute;
import net.minecraft.component.ComponentType;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.spartanweapons.SpartanWeaponsMain;

@SuppressWarnings("InstantiationOfUtilityClass")
public class WoodType {
    public static final Registry<WoodType> REGISTRY = FabricRegistryBuilder
            .<WoodType>createSimple(RegistryKey.ofRegistry(SpartanWeaponsMain.id("wood_type")))
            .attribute(RegistryAttribute.MODDED)
            .attribute(RegistryAttribute.SYNCED)
            .buildAndRegister();

    public static final WoodType OAK = Registry.register(REGISTRY, SpartanWeaponsMain.id("oak"), new WoodType());
    public static final WoodType SPRUCE = Registry.register(REGISTRY, SpartanWeaponsMain.id("spruce"), new WoodType());
    public static final WoodType DARK_OAK = Registry.register(REGISTRY, SpartanWeaponsMain.id("dark_oak"), new WoodType());
    public static final WoodType ACACIA = Registry.register(REGISTRY, SpartanWeaponsMain.id("acacia"), new WoodType());
    public static final WoodType BIRCH = Registry.register(REGISTRY, SpartanWeaponsMain.id("birch"), new WoodType());
    public static final WoodType JUNGLE = Registry.register(REGISTRY, SpartanWeaponsMain.id("jungle"), new WoodType());
    public static final WoodType WARPED = Registry.register(REGISTRY, SpartanWeaponsMain.id("warped"), new WoodType());
    public static final WoodType CRIMSON = Registry.register(REGISTRY, SpartanWeaponsMain.id("crimson"), new WoodType());
    public static final WoodType BAMBOO = Registry.register(REGISTRY, SpartanWeaponsMain.id("bamboo"), new WoodType());
    public static final WoodType CHERRY = Registry.register(REGISTRY, SpartanWeaponsMain.id("cherry"), new WoodType());
    public static final WoodType MANGROVE = Registry.register(REGISTRY, SpartanWeaponsMain.id("mangrove"), new WoodType());

    public static void init() {
        REGISTRY.freeze();
    }
    public static final PacketCodec<? super RegistryByteBuf, WoodType> PACKET_CODEC = PacketCodecs.VAR_INT
            .xmap(REGISTRY::get, REGISTRY::getRawId)
            .cast();

    public static final ComponentType<WoodType> WOOD_TYPE_COMPONENT = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            SpartanWeaponsMain.id("wood_type"),
            ComponentType.<WoodType>builder()
                    .codec(REGISTRY.getCodec())
                    .packetCodec(PACKET_CODEC)
                    .build()
    );
}
