package net.spartanweapons.init;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.component.ComponentChanges;
import net.minecraft.entity.EntityType;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.spartanweapons.entity.JavelinEntity;
import net.spartanweapons.item.*;
import net.spartanweapons.util.WoodType;
import org.jetbrains.annotations.NotNull;

// TODO: Add netherite fireproofing to settings
@SuppressWarnings("unused")
public class ItemInit {
    public static final RegistryKey<ItemGroup> SPARTANWEAPONS_ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of("spartanweapons", "item_group"));
    public static final ItemInit INSTANCE = new ItemInit();
    private final Map<Identifier, Item> items = new HashMap<>();
    // Sticks
    public static final Item STICK = INSTANCE.register("stick", new Item(new Item.Settings()));
    // Poles
    public static final Item POLE = INSTANCE.register("pole", new SpartanWeaponItem(ToolMaterials.WOOD, new Item.Settings()));
    // Staff
    public static final Item STAFF = INSTANCE.register("staff", new SpartanWeaponItem(
            ToolMaterials.WOOD,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.WOOD, 5, -2.9f)),
            true
    ));
    private static final ToolMaterial[] METALS = new ToolMaterial[]{
            ToolMaterials.DIAMOND,
            ToolMaterials.GOLD,
            ToolMaterials.IRON,
            ToolMaterials.NETHERITE
    };
    // Weapons
    public static final Item CLUB = INSTANCE.register("club", new SpartanWeaponItem(
            ToolMaterials.WOOD,
            new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.WOOD, 5, -2.9f)))
    );
    public static final MaterialItemContainer<SpartanWeaponItem> CUTLASSES = new MaterialItemContainer<>(INSTANCE, "cutlass",
            createWeaponSettings(5, -2.8f),
            (material, settings) -> new SpartanWeaponItem(material, settings, true),
            METALS
    );
    public static final MaterialItemContainer<SpartanWeaponItem> DAGGERS = new MaterialItemContainer<>(INSTANCE, "dagger",
            createWeaponSettings(0, -1.6f),
            (material, settings) -> new SpartanWeaponItem(material, settings, true),
            METALS
    );
    public static final MaterialItemContainer<SpartanWeaponItem> GLAIVES = new MaterialItemContainer<>(INSTANCE, "glaive",
            createWeaponSettings(4, -2.6f),
            (material, settings) -> new SpartanWeaponItem(material, settings, true),
            METALS
    );
    public static final MaterialItemContainer<SpartanWeaponItem> GREATSWORDS = new MaterialItemContainer<>(INSTANCE, "greatsword",
            createWeaponSettings(7, -3.2f),
            (material, settings) -> new SpartanWeaponItem(material, settings, true),
            METALS

    );
    public static final MaterialItemContainer<SpartanWeaponItem> HALBERD = new MaterialItemContainer<>(INSTANCE, "halberd",
            createWeaponSettings(6, -3),
            (material, settings) -> new SpartanWeaponItem(material, settings, true),
            METALS
    );
    public static final MaterialItemContainer<SpartanWeaponItem> KATANAS = new MaterialItemContainer<>(INSTANCE, "katana",
            createWeaponSettings(6, -2.3f),
            (material, settings) -> new SpartanWeaponItem(material, settings, true),
            METALS
    );
    public static final MaterialItemContainer<SpartanWeaponItem> MACES = new MaterialItemContainer<>(INSTANCE, "mace",
            createWeaponSettings(9, -3.2f),
            (material, settings) -> new SpartanWeaponItem(material, settings, true),
            METALS
    );
    public static final MaterialItemContainer<SpartanWeaponItem> RAPIERS = new MaterialItemContainer<>(INSTANCE, "rapier",
            createWeaponSettings(1, -2),
            (material, settings) -> new SpartanWeaponItem(material, settings, true),
            METALS
    );
    public static final MaterialItemContainer<SpartanWeaponItem> SCYTHES = new MaterialItemContainer<>(INSTANCE, "scythe",
            createWeaponSettings(6, -3),
            (material, settings) -> new SpartanWeaponItem(material, settings, true),
            METALS
    );
    public static final MaterialItemContainer<SpartanWeaponItem> SPEARS = new MaterialItemContainer<>(INSTANCE, "spear",
            createWeaponSettings(5, -2.8f),
            SpartanWeaponItem::new
    );
    public static final MaterialItemContainer<SpartanWeaponItem> AXES = new MaterialItemContainer<>(INSTANCE, "axe",
            createWeaponSettings(4, -2.5f),
            (material, settings) -> new SpartanWeaponItem(material, settings, true),
            METALS
    );
    public static final MaterialItemContainer<SpartanWeaponItem> JAVELIN = new MaterialItemContainer<>(INSTANCE, "javelin",
            createWeaponSettings(2, -2.4f),
            (material, settings) -> {
                Supplier<EntityType<JavelinEntity>> type = () -> switch (material) {
                    case ToolMaterials.NETHERITE -> EntityInit.NETHERITE_JAVELIN;
                    case ToolMaterials.DIAMOND -> EntityInit.DIAMOND_JAVELIN;
                    case ToolMaterials.IRON -> EntityInit.IRON_JAVELIN;
                    case ToolMaterials.GOLD -> EntityInit.GOLDEN_JAVELIN;
                    default -> throw new IllegalArgumentException("Invalid material");
                };

                return new JavelinItem(material, type, settings);
            },
            ToolMaterials.NETHERITE, ToolMaterials.DIAMOND, ToolMaterials.GOLD, ToolMaterials.IRON
    );
    public static final MaterialItemContainer<SpartanWeaponItem> KUNAI = new MaterialItemContainer<>(INSTANCE, "kunai",
            createWeaponSettings(0, -1.8f),
            SpartanWeaponItem::new
    );

    public <I extends Item> I register(String name, I item) {
        items.put(Identifier.of("spartanweapons", name), item);
        return item;
    }

    private static @NotNull Function<ToolMaterial, Item.Settings> createWeaponSettings(int baseAtkDamage, float atkSpeed) {
        var settings = new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.WOOD, baseAtkDamage, atkSpeed));
        return material -> material == ToolMaterials.NETHERITE ? settings.fireproof() : settings;
    }

    public void register() {
        for (var id : this.items.keySet()) {
            Registry.register(Registries.ITEM, id, items.get(id));
        }

        Registry.register(Registries.ITEM_GROUP, SPARTANWEAPONS_ITEM_GROUP, FabricItemGroup.builder()
                .icon(() -> new ItemStack(CUTLASSES.getUnsafe(ToolMaterials.DIAMOND)))
                .displayName(Text.translatable("item.spartanweapons.item_group"))
                .entries((displayContext, entries) -> this.items.values().stream().sorted(Comparator.comparing(item -> item.getName().getString())).forEach(item -> {
                    if (item instanceof SpartanWeaponItem spartanWeaponItem && spartanWeaponItem.hasHandle()) {
                        WoodType.REGISTRY.stream().map(woodType -> ComponentChanges.builder().add(WoodType.WOOD_TYPE_COMPONENT, woodType).build()).map(changes -> {
                            var stack = new ItemStack(item);
                            stack.applyChanges(changes);
                            return stack;
                        }).sorted(Comparator.comparing(o -> o.getName().getString())).forEach(entries::add);
                    } else {
                        entries.add(item);
                    }
                }))
                .build()
        );
    }

    public Item getItem(Identifier id) {
        return this.items.get(id);
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    public Identifier getId(Item item) {
        return this.items.entrySet().stream().filter(identifierItemEntry -> identifierItemEntry.getValue() == item).findAny().get().getKey();
    }

    public Map<Identifier, Item> getItems() {
        return this.items;
    }
}
