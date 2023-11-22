package net.spartanweapons.init;

import java.util.LinkedHashMap;
import java.util.Map;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.spartanweapons.entity.*;
import net.spartanweapons.item.Javelin;

public class EntityInit {
    // Map
    public static final Map<Identifier, EntityType<?>> ENTITY_TYPES = new LinkedHashMap<>();
    // Javelin
    public static final EntityType<JavelinEntity> IRON_JAVELIN = register("iron_javelin", createJavelin(ItemInit.IRON_JAVELIN));
    public static final EntityType<JavelinEntity> GOLDEN_JAVELIN = register("golden_javelin", createJavelin(ItemInit.GOLDEN_JAVELIN));
    public static final EntityType<JavelinEntity> DIAMOND_JAVELIN = register("diamond_javelin", createJavelin(ItemInit.DIAMOND_JAVELIN));
    public static final EntityType<JavelinEntity> NETHERITE_JAVELIN = register("netherite_javelin", createJavelin(ItemInit.NETHERITE_JAVELIN));
    // Damage
    public static final RegistryKey<DamageType> JAVELIN = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, new Identifier("spartanweapons", "javelin"));

    public static void init() {
        // CompatEntities.loadEntities();
        for (Identifier id : ENTITY_TYPES.keySet()) {
            Registry.register(Registries.ENTITY_TYPE, id, ENTITY_TYPES.get(id));
        }
    }

    public static <T extends EntityType<?>> T register(String name, T type) {
        Identifier id = new Identifier("medievalweapons", name);
        ENTITY_TYPES.put(id, type);
        return type;
    }

    public static EntityType<JavelinEntity> createJavelin(Item item) {
        return FabricEntityTypeBuilder.<JavelinEntity>create(SpawnGroup.MISC, (entity, world) -> new JavelinEntity(entity, world, (Javelin) item)).dimensions(EntityDimensions.fixed(0.5F, 0.5F))
                .build();
    }
}
