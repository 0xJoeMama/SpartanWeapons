package net.spartanweapons.init;

import java.util.HashMap;

import com.google.gson.JsonObject;

import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.spartanweapons.SpartanWeaponsMain;
import net.spartanweapons.item.recipe.RecipeGenerator;
import net.spartanweapons.item.recipe.ShapedRecipeMaterial;
import net.spartanweapons.item.recipe.SmithingRecipeMaterial;

public class RecipeInit {

    public static HashMap<String, ShapedRecipeMaterial> SHAPED_RECIPES = new HashMap<>();
    public static HashMap<String, SmithingRecipeMaterial> SMITHING_RECIPES = new HashMap<>();

    public static HashMap<Identifier, JsonObject> RECIPES = new HashMap<>();

    public static void generateRecipes() {
        // Pole
        SHAPED_RECIPES.put("acacia_pole",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.ACACIA_STICK), null, "item", "item", "", SpartanWeaponsMain.ID("acacia_pole"), "pole"));
        SHAPED_RECIPES.put("bamboo_pole",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.BAMBOO_STICK), null, "item", "item", "", SpartanWeaponsMain.ID("bamboo_pole"), "pole"));
        SHAPED_RECIPES.put("birch_pole",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.BIRCH_STICK), null, "item", "item", "", SpartanWeaponsMain.ID("birch_pole"), "pole"));
        SHAPED_RECIPES.put("cherry_pole",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.CHERRY_STICK), null, "item", "item", "", SpartanWeaponsMain.ID("cherry_pole"), "pole"));
        SHAPED_RECIPES.put("crimson_pole", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.CRIMSON_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("crimson_pole"), "pole"));
        SHAPED_RECIPES.put("dark_oak_pole", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.DARK_OAK_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("dark_oak_pole"), "pole"));
        SHAPED_RECIPES.put("jungle_pole",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.JUNGLE_STICK), null, "item", "item", "", SpartanWeaponsMain.ID("jungle_pole"), "pole"));
        SHAPED_RECIPES.put("mangrove_pole", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.MANGROVE_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("mangrove_pole"), "pole"));
        SHAPED_RECIPES.put("oak_pole",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(Items.STICK), null, "item", "item", "", SpartanWeaponsMain.ID("oak_pole"), "pole"));
        SHAPED_RECIPES.put("spruce_pole",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.SPRUCE_STICK), null, "item", "item", "", SpartanWeaponsMain.ID("spruce_pole"), "pole"));
        SHAPED_RECIPES.put("warped_pole",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.WARPED_STICK), null, "item", "item", "", SpartanWeaponsMain.ID("warped_pole"), "pole"));
        // Wood
        SHAPED_RECIPES.put("acacia_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.ACACIA_PLANKS), Registries.ITEM.getId(ItemInit.ACACIA_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("acacia_club"), "club"));
        SHAPED_RECIPES.put("bamboo_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.BAMBOO_PLANKS), Registries.ITEM.getId(ItemInit.BAMBOO_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("bamboo_club"), "club"));
        SHAPED_RECIPES.put("birch_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.BIRCH_PLANKS), Registries.ITEM.getId(ItemInit.BIRCH_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("birch_club"), "club"));
        SHAPED_RECIPES.put("cherry_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.CHERRY_PLANKS), Registries.ITEM.getId(ItemInit.CHERRY_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("cherry_club"), "club"));
        SHAPED_RECIPES.put("crimson_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.CRIMSON_PLANKS), Registries.ITEM.getId(ItemInit.CRIMSON_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("crimson_club"), "club"));
        SHAPED_RECIPES.put("dark_oak_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DARK_OAK_PLANKS), Registries.ITEM.getId(ItemInit.DARK_OAK_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("dark_oak_club"), "club"));
        SHAPED_RECIPES.put("jungle_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.JUNGLE_PLANKS), Registries.ITEM.getId(ItemInit.JUNGLE_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("jungle_club"), "club"));
        SHAPED_RECIPES.put("mangrove_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.MANGROVE_PLANKS), Registries.ITEM.getId(ItemInit.MANGROVE_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("mangrove_club"), "club"));
        SHAPED_RECIPES.put("oak_club",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.OAK_PLANKS), Registries.ITEM.getId(Items.STICK), null, "item", "item", "", SpartanWeaponsMain.ID("oak_club"), "club"));
        SHAPED_RECIPES.put("spruce_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.SPRUCE_PLANKS), Registries.ITEM.getId(ItemInit.SPRUCE_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("spruce_club"), "club"));
        SHAPED_RECIPES.put("warped_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.WARPED_PLANKS), Registries.ITEM.getId(ItemInit.WARPED_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("warped_club"), "club"));

        SHAPED_RECIPES.put("acacia_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.ACACIA_PLANKS), Registries.ITEM.getId(ItemInit.ACACIA_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("acacia_staff"), "staff"));
        SHAPED_RECIPES.put("bamboo_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.BAMBOO_PLANKS), Registries.ITEM.getId(ItemInit.BAMBOO_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("bamboo_staff"), "staff"));
        SHAPED_RECIPES.put("birch_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.BIRCH_PLANKS), Registries.ITEM.getId(ItemInit.BIRCH_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("birch_staff"), "staff"));
        SHAPED_RECIPES.put("cherry_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.CHERRY_PLANKS), Registries.ITEM.getId(ItemInit.CHERRY_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("cherry_staff"), "staff"));
        SHAPED_RECIPES.put("crimson_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.CRIMSON_PLANKS), Registries.ITEM.getId(ItemInit.CRIMSON_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("crimson_staff"), "staff"));
        SHAPED_RECIPES.put("dark_oak_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DARK_OAK_PLANKS), Registries.ITEM.getId(ItemInit.DARK_OAK_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("dark_oak_staff"), "staff"));
        SHAPED_RECIPES.put("jungle_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.JUNGLE_PLANKS), Registries.ITEM.getId(ItemInit.JUNGLE_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("jungle_staff"), "staff"));
        SHAPED_RECIPES.put("mangrove_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.MANGROVE_PLANKS), Registries.ITEM.getId(ItemInit.MANGROVE_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("mangrove_staff"), "staff"));
        SHAPED_RECIPES.put("oak_staff",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.OAK_PLANKS), Registries.ITEM.getId(Items.STICK), null, "item", "item", "", SpartanWeaponsMain.ID("oak_staff"), "staff"));
        SHAPED_RECIPES.put("spruce_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.SPRUCE_PLANKS), Registries.ITEM.getId(ItemInit.SPRUCE_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("spruce_staff"), "staff"));
        SHAPED_RECIPES.put("warped_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.WARPED_PLANKS), Registries.ITEM.getId(ItemInit.WARPED_STICK), null, "item", "item", "",
                SpartanWeaponsMain.ID("warped_staff"), "staff"));

        // Stone
        // SHAPED_RECIPES.put("stone_cutlass",
        // new ShapedRecipeMaterial(new Identifier("stone_tool_materials"), new Identifier("c", "sticks"), "tag", "tag", SpartanWeaponsMain.ID("stone_cutlass"), "cutlass"));
        // SHAPED_RECIPES.put("stone_dagger",
        // new ShapedRecipeMaterial(new Identifier("stone_tool_materials"), new Identifier("c", "sticks"), "tag", "tag", SpartanWeaponsMain.ID("stone_dagger"), "dagger"));
        // SHAPED_RECIPES.put("stone_glaive",
        // new ShapedRecipeMaterial(new Identifier("stone_tool_materials"), new Identifier("c", "poles"), "tag", "tag", SpartanWeaponsMain.ID("stone_glaive"), "glaive"));
        // SHAPED_RECIPES.put("stone_greatsword",
        // new ShapedRecipeMaterial(new Identifier("stone_tool_materials"), new Identifier("c", "sticks"), "tag", "tag", SpartanWeaponsMain.ID("stone_greatsword"), "greatsword"));
        // SHAPED_RECIPES.put("stone_halberd",
        // new ShapedRecipeMaterial(new Identifier("stone_tool_materials"), new Identifier("c", "sticks"), "tag", "tag", SpartanWeaponsMain.ID("stone_halberd"), "halberd"));
        // SHAPED_RECIPES.put("stone_katana",
        // new ShapedRecipeMaterial(new Identifier("stone_tool_materials"), new Identifier("c", "sticks"), "tag", "tag", SpartanWeaponsMain.ID("stone_katana"), "katana"));
        // SHAPED_RECIPES.put("stone_long_sword",
        // new ShapedRecipeMaterial(new Identifier("stone_tool_materials"), new Identifier("c", "sticks"), "tag", "tag", SpartanWeaponsMain.ID("stone_long_sword"), "long_sword"));
        // SHAPED_RECIPES.put("stone_mace", new ShapedRecipeMaterial(new Identifier("stone_tool_materials"), new Identifier("c", "sticks"), "tag", "tag", SpartanWeaponsMain.ID("stone_mace"),
        // "mace"));
        // SHAPED_RECIPES.put("stone_rapier",
        // new ShapedRecipeMaterial(new Identifier("stone_tool_materials"), new Identifier("c", "sticks"), "tag", "tag", SpartanWeaponsMain.ID("stone_rapier"), "rapier"));
        // SHAPED_RECIPES.put("stone_scythe",
        // new ShapedRecipeMaterial(new Identifier("stone_tool_materials"), new Identifier("c", "sticks"), new Identifier("c", "poles"), "tag", "tag", "tag", SpartanWeaponsMain.ID("stone_scythe"),
        // "scythe"));
        // SHAPED_RECIPES.put("stone_spear",
        // new ShapedRecipeMaterial(new Identifier("stone_tool_materials"), new Identifier("c", "poles"), "tag", "tag", SpartanWeaponsMain.ID("stone_spear"), "spear"));
        // SHAPED_RECIPES.put("stone_rapier",
        // new ShapedRecipeMaterial(new Identifier("stone_tool_materials"), new Identifier("c", "sticks"), "tag", "tag", SpartanWeaponsMain.ID("stone_rapier"), "rapier"));

        // Gold
        SHAPED_RECIPES.put("golden_cutlass",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), new Identifier("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.ID("golden_cutlass"), "cutlass"));
        SHAPED_RECIPES.put("golden_dagger",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), new Identifier("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.ID("golden_dagger"), "dagger"));
        SHAPED_RECIPES.put("golden_glaive",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), new Identifier("c", "poles"), null, "item", "tag", "", SpartanWeaponsMain.ID("golden_glaive"), "glaive"));
        SHAPED_RECIPES.put("golden_greatsword",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), new Identifier("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.ID("golden_greatsword"), "greatsword"));
        SHAPED_RECIPES.put("golden_halberd",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), new Identifier("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.ID("golden_halberd"), "halberd"));
        SHAPED_RECIPES.put("golden_katana",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), new Identifier("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.ID("golden_katana"), "katana"));
        SHAPED_RECIPES.put("golden_mace", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), new Identifier("c", "sticks"), Registries.ITEM.getId(Items.GOLD_BLOCK), "item", "tag",
                "item", SpartanWeaponsMain.ID("golden_mace"), "mace"));
        SHAPED_RECIPES.put("golden_rapier",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), new Identifier("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.ID("golden_rapier"), "rapier"));
        SHAPED_RECIPES.put("golden_scythe", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), new Identifier("c", "sticks"), new Identifier("c", "poles"), "item", "tag", "tag",
                SpartanWeaponsMain.ID("golden_scythe"), "scythe"));
        SHAPED_RECIPES.put("golden_spear",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), new Identifier("c", "poles"), null, "item", "tag", "", SpartanWeaponsMain.ID("golden_spear"), "spear"));
        SHAPED_RECIPES.put("golden_battle_axe", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), new Identifier("c", "sticks"), new Identifier("c", "poles"), "item", "tag", "tag",
                SpartanWeaponsMain.ID("golden_battle_axe"), "battle_axe"));

        // Iron
        SHAPED_RECIPES.put("iron_cutlass",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), new Identifier("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.ID("iron_cutlass"), "cutlass"));
        SHAPED_RECIPES.put("iron_dagger",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), new Identifier("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.ID("iron_dagger"), "dagger"));
        SHAPED_RECIPES.put("iron_glaive",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), new Identifier("c", "poles"), null, "item", "tag", "", SpartanWeaponsMain.ID("iron_glaive"), "glaive"));
        SHAPED_RECIPES.put("iron_greatsword",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), new Identifier("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.ID("iron_greatsword"), "greatsword"));
        SHAPED_RECIPES.put("iron_halberd",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), new Identifier("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.ID("iron_halberd"), "halberd"));
        SHAPED_RECIPES.put("iron_katana",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), new Identifier("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.ID("iron_katana"), "katana"));
        SHAPED_RECIPES.put("iron_mace", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), new Identifier("c", "sticks"), Registries.ITEM.getId(Items.IRON_BLOCK), "item", "tag",
                "item", SpartanWeaponsMain.ID("iron_mace"), "mace"));
        SHAPED_RECIPES.put("iron_rapier",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), new Identifier("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.ID("iron_rapier"), "rapier"));
        SHAPED_RECIPES.put("iron_scythe", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), new Identifier("c", "sticks"), new Identifier("c", "poles"), "item", "tag", "tag",
                SpartanWeaponsMain.ID("iron_scythe"), "scythe"));
        SHAPED_RECIPES.put("iron_spear",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), new Identifier("c", "poles"), null, "item", "tag", "", SpartanWeaponsMain.ID("iron_spear"), "spear"));
        SHAPED_RECIPES.put("iron_battle_axe", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), new Identifier("c", "sticks"), new Identifier("c", "poles"), "item", "tag", "tag",
                SpartanWeaponsMain.ID("iron_battle_axe"), "battle_axe"));

        // Diamond
        SHAPED_RECIPES.put("diamond_cutlass",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), new Identifier("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.ID("diamond_cutlass"), "cutlass"));
        SHAPED_RECIPES.put("diamond_dagger",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), new Identifier("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.ID("diamond_dagger"), "dagger"));
        SHAPED_RECIPES.put("diamond_glaive",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), new Identifier("c", "poles"), null, "item", "tag", "", SpartanWeaponsMain.ID("diamond_glaive"), "glaive"));
        SHAPED_RECIPES.put("diamond_greatsword",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), new Identifier("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.ID("diamond_greatsword"), "greatsword"));
        SHAPED_RECIPES.put("diamond_halberd",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), new Identifier("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.ID("diamond_halberd"), "halberd"));
        SHAPED_RECIPES.put("diamond_katana",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), new Identifier("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.ID("diamond_katana"), "katana"));
        SHAPED_RECIPES.put("diamond_mace", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), new Identifier("c", "sticks"), Registries.ITEM.getId(Items.DIAMOND_BLOCK), "item", "tag",
                "item", SpartanWeaponsMain.ID("diamond_mace"), "mace"));
        SHAPED_RECIPES.put("diamond_rapier",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), new Identifier("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.ID("diamond_rapier"), "rapier"));
        SHAPED_RECIPES.put("diamond_scythe", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), new Identifier("c", "sticks"), new Identifier("c", "poles"), "item", "tag", "tag",
                SpartanWeaponsMain.ID("diamond_scythe"), "scythe"));
        SHAPED_RECIPES.put("diamond_spear",
                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), new Identifier("c", "poles"), null, "item", "tag", "", SpartanWeaponsMain.ID("diamond_spear"), "spear"));
        SHAPED_RECIPES.put("diamond_battle_axe", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), new Identifier("c", "sticks"), new Identifier("c", "poles"), "item", "tag", "tag",
                SpartanWeaponsMain.ID("diamond_battle_axe"), "battle_axe"));
        // Netherite
        SMITHING_RECIPES.put("netherite_cutlass", new SmithingRecipeMaterial(SpartanWeaponsMain.ID("diamond_cutlass"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
                SpartanWeaponsMain.ID("netherite_cutlass"), new Identifier("minecraft:netherite_upgrade_smithing_template")));
        SMITHING_RECIPES.put("netherite_dagger", new SmithingRecipeMaterial(SpartanWeaponsMain.ID("diamond_dagger"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
                SpartanWeaponsMain.ID("netherite_dagger"), new Identifier("minecraft:netherite_upgrade_smithing_template")));
        SMITHING_RECIPES.put("netherite_glaive", new SmithingRecipeMaterial(SpartanWeaponsMain.ID("diamond_glaive"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
                SpartanWeaponsMain.ID("netherite_glaive"), new Identifier("minecraft:netherite_upgrade_smithing_template")));
        SMITHING_RECIPES.put("netherite_greatsword", new SmithingRecipeMaterial(SpartanWeaponsMain.ID("diamond_greatsword"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
                SpartanWeaponsMain.ID("netherite_greatsword"), new Identifier("minecraft:netherite_upgrade_smithing_template")));
        SMITHING_RECIPES.put("netherite_halberd", new SmithingRecipeMaterial(SpartanWeaponsMain.ID("diamond_halberd"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
                SpartanWeaponsMain.ID("netherite_halberd"), new Identifier("minecraft:netherite_upgrade_smithing_template")));
        SMITHING_RECIPES.put("netherite_katana", new SmithingRecipeMaterial(SpartanWeaponsMain.ID("diamond_katana"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
                SpartanWeaponsMain.ID("netherite_katana"), new Identifier("minecraft:netherite_upgrade_smithing_template")));
        SMITHING_RECIPES.put("netherite_mace", new SmithingRecipeMaterial(SpartanWeaponsMain.ID("diamond_mace"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
                SpartanWeaponsMain.ID("netherite_mace"), new Identifier("minecraft:netherite_upgrade_smithing_template")));
        SMITHING_RECIPES.put("netherite_rapier", new SmithingRecipeMaterial(SpartanWeaponsMain.ID("diamond_rapier"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
                SpartanWeaponsMain.ID("netherite_rapier"), new Identifier("minecraft:netherite_upgrade_smithing_template")));
        SMITHING_RECIPES.put("netherite_scythe", new SmithingRecipeMaterial(SpartanWeaponsMain.ID("diamond_scythe"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
                SpartanWeaponsMain.ID("netherite_scythe"), new Identifier("minecraft:netherite_upgrade_smithing_template")));
        SMITHING_RECIPES.put("netherite_spear", new SmithingRecipeMaterial(SpartanWeaponsMain.ID("diamond_spear"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
                SpartanWeaponsMain.ID("netherite_spear"), new Identifier("minecraft:netherite_upgrade_smithing_template")));
        SMITHING_RECIPES.put("netherite_battle_axe", new SmithingRecipeMaterial(SpartanWeaponsMain.ID("diamond_battle_axe"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
                SpartanWeaponsMain.ID("netherite_battle_axe"), new Identifier("minecraft:netherite_upgrade_smithing_template")));
    }

    public static void init() {
        generateRecipes();

        for (String key : SHAPED_RECIPES.keySet()) {
            ShapedRecipeMaterial material = SHAPED_RECIPES.get(key);
            RECIPES.put(SpartanWeaponsMain.ID(key), RecipeGenerator.generateJson(material.headItem, material.handleItem, material.secondHandleItem, material.headType, material.handleType,
                    material.secondHandleType, material.output, material.itemName));
        }
        for (String key : SMITHING_RECIPES.keySet()) {
            SmithingRecipeMaterial material = SMITHING_RECIPES.get(key);
            RECIPES.put(SpartanWeaponsMain.ID(key),
                    RecipeGenerator.generateSmithingJson(material.baseItem, material.additionItem, material.baseType, material.additionType, material.output, material.template));
        }
    }
}
