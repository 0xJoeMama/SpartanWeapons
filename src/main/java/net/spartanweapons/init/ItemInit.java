package net.spartanweapons.init;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.spartanweapons.SpartanWeaponsMain;
import net.spartanweapons.entity.JavelinEntity;
import net.spartanweapons.item.*;
import org.jetbrains.annotations.NotNull;

// TODO: Add netherite fireproofing to settings
@SuppressWarnings("unused")
public class ItemInit {
    public static final RegistryKey<ItemGroup> SPARTANWEAPONS_ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of("spartanweapons", "item_group"));
    public static final Map<Identifier, Item> ITEMS = new LinkedHashMap<>();
    // Sticks
    public static final Item ACACIA_STICK = register("acacia_stick", new Item(new Item.Settings()));
    public static final Item BAMBOO_STICK = register("bamboo_stick", new Item(new Item.Settings()));
    public static final Item BIRCH_STICK = register("birch_stick", new Item(new Item.Settings()));
    public static final Item CHERRY_STICK = register("cherry_stick", new Item(new Item.Settings()));
    public static final Item CRIMSON_STICK = register("crimson_stick", new Item(new Item.Settings()));
    public static final Item DARK_OAK_STICK = register("dark_oak_stick", new Item(new Item.Settings()));
    public static final Item JUNGLE_STICK = register("jungle_stick", new Item(new Item.Settings()));
    public static final Item MANGROVE_STICK = register("mangrove_stick", new Item(new Item.Settings()));
    public static final Item SPRUCE_STICK = register("spruce_stick", new Item(new Item.Settings()));
    public static final Item WARPED_STICK = register("warped_stick", new Item(new Item.Settings()));
    // Poles
    public static final Item POLE = register("pole", new SpartanWeaponItem(ToolMaterials.WOOD, new Item.Settings()));
    // Staff
    public static final Item STAFF = register("staff", new SpartanWeaponItem(
            ToolMaterials.WOOD,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.WOOD, 5, -2.9f))
    ));
    // Weapons
    public static final Item CLUB = register("club", new SpartanWeaponItem(
            ToolMaterials.WOOD,
            new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.WOOD, 5, -2.9f)))
    );
    public static final MaterialItemContainer<SpartanWeaponItem> CUTLASSES = new MaterialItemContainer<>("cutlass",
            createWeaponSettings(5, -2.8f),
            SpartanWeaponItem::new
    );
    public static final MaterialItemContainer<SpartanWeaponItem> DAGGERS = new MaterialItemContainer<>("dagger",
            createWeaponSettings(0, -1.6f),
            SpartanWeaponItem::new
    );
    public static final MaterialItemContainer<SpartanWeaponItem> GLAIVES = new MaterialItemContainer<>("glaive",
            createWeaponSettings(4, -2.6f),
            SpartanWeaponItem::new
    );
    public static final MaterialItemContainer<SpartanWeaponItem> GREATSWORDS = new MaterialItemContainer<>("greatsword",
            createWeaponSettings(7, -3.2f),
            SpartanWeaponItem::new
    );
    public static final MaterialItemContainer<SpartanWeaponItem> HALBERD = new MaterialItemContainer<>("halberd",
            createWeaponSettings(6, -3),
            SpartanWeaponItem::new
    );
    public static final MaterialItemContainer<SpartanWeaponItem> KATANAS = new MaterialItemContainer<>("katana",
            createWeaponSettings(6, -2.3f),
            SpartanWeaponItem::new
    );
    public static final MaterialItemContainer<SpartanWeaponItem> MACES = new MaterialItemContainer<>("mace",
            createWeaponSettings(9, -3.2f),
            SpartanWeaponItem::new
    );
    public static final MaterialItemContainer<SpartanWeaponItem> RAPIERS = new MaterialItemContainer<>("rapier",
            createWeaponSettings(1, -2),
            SpartanWeaponItem::new
    );
    public static final MaterialItemContainer<SpartanWeaponItem> SCYTHES = new MaterialItemContainer<>("scythe",
            createWeaponSettings(6, -3),
            SpartanWeaponItem::new
    );
    public static final MaterialItemContainer<SpartanWeaponItem> SPEARS = new MaterialItemContainer<>("spear",
            createWeaponSettings(5, -2.8f),
            SpartanWeaponItem::new
    );
    public static final MaterialItemContainer<SpartanWeaponItem> AXES = new MaterialItemContainer<>("axe",
            createWeaponSettings(4, -2.5f),
            SpartanWeaponItem::new
    );
    public static final MaterialItemContainer<SpartanWeaponItem> JAVELIN = new MaterialItemContainer<>("javelin",
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
    public static final MaterialItemContainer<SpartanWeaponItem> KUNAI = new MaterialItemContainer<>("kunai",
            createWeaponSettings(0, -1.8f),
            SpartanWeaponItem::new
    );

    public static <I extends Item> I register(String name, I item) {
        ITEMS.put(Identifier.of("spartanweapons", name), item);
        return item;
    }

    public static @NotNull Function<ToolMaterial, Item.Settings> createWeaponSettings(int baseAtkDamage, float atkSpeed) {
        var settings = new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.WOOD, baseAtkDamage, atkSpeed));
        return material -> material == ToolMaterials.NETHERITE ? settings.fireproof() : settings;
    }

    public static void init() {
        for (var id : ITEMS.keySet()) {
            Registry.register(Registries.ITEM, id, ITEMS.get(id));
        }

        Registry.register(Registries.ITEM_GROUP, SPARTANWEAPONS_ITEM_GROUP, FabricItemGroup.builder()
                .icon(() -> new ItemStack(CUTLASSES.getUnsafe(ToolMaterials.DIAMOND)))
                .displayName(Text.translatable("item.spartanweapons.item_group"))
                .entries((displayContext, entries) -> Registries.ITEM.streamEntries()
                        .filter(ref -> ref.getKey().filter(key -> key.getValue().getNamespace().equals(SpartanWeaponsMain.MODID)).isPresent())
                        .map(RegistryEntry.Reference::value)
                        .forEach(entries::add))
                .build()
        );
    }
}
