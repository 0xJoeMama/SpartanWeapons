package net.spartanweapons.init;

import java.util.HashMap;

import com.google.gson.JsonObject;

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
//        // Pole
//        SHAPED_RECIPES.put("acacia_pole",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.ACACIA_STICK), null, "item", "item", "", SpartanWeaponsMain.id("acacia_pole"), "pole"));
//        SHAPED_RECIPES.put("bamboo_pole",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.BAMBOO_STICK), null, "item", "item", "", SpartanWeaponsMain.id("bamboo_pole"), "pole"));
//        SHAPED_RECIPES.put("birch_pole",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.BIRCH_STICK), null, "item", "item", "", SpartanWeaponsMain.id("birch_pole"), "pole"));
//        SHAPED_RECIPES.put("cherry_pole",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.CHERRY_STICK), null, "item", "item", "", SpartanWeaponsMain.id("cherry_pole"), "pole"));
//        SHAPED_RECIPES.put("crimson_pole", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.CRIMSON_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("crimson_pole"), "pole"));
//        SHAPED_RECIPES.put("dark_oak_pole", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.DARK_OAK_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("dark_oak_pole"), "pole"));
//        SHAPED_RECIPES.put("jungle_pole",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.JUNGLE_STICK), null, "item", "item", "", SpartanWeaponsMain.id("jungle_pole"), "pole"));
//        SHAPED_RECIPES.put("mangrove_pole", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.MANGROVE_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("mangrove_pole"), "pole"));
//        SHAPED_RECIPES.put("oak_pole",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(Items.STICK), null, "item", "item", "", SpartanWeaponsMain.id("oak_pole"), "pole"));
//        SHAPED_RECIPES.put("spruce_pole",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.SPRUCE_STICK), null, "item", "item", "", SpartanWeaponsMain.id("spruce_pole"), "pole"));
//        SHAPED_RECIPES.put("warped_pole",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.LEATHER), Registries.ITEM.getId(ItemInit.WARPED_STICK), null, "item", "item", "", SpartanWeaponsMain.id("warped_pole"), "pole"));
//        // Wood
//        SHAPED_RECIPES.put("acacia_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.ACACIA_PLANKS), Registries.ITEM.getId(ItemInit.ACACIA_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("acacia_club"), "club"));
//        SHAPED_RECIPES.put("bamboo_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.BAMBOO_PLANKS), Registries.ITEM.getId(ItemInit.BAMBOO_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("bamboo_club"), "club"));
//        SHAPED_RECIPES.put("birch_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.BIRCH_PLANKS), Registries.ITEM.getId(ItemInit.BIRCH_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("birch_club"), "club"));
//        SHAPED_RECIPES.put("cherry_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.CHERRY_PLANKS), Registries.ITEM.getId(ItemInit.CHERRY_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("cherry_club"), "club"));
//        SHAPED_RECIPES.put("crimson_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.CRIMSON_PLANKS), Registries.ITEM.getId(ItemInit.CRIMSON_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("crimson_club"), "club"));
//        SHAPED_RECIPES.put("dark_oak_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DARK_OAK_PLANKS), Registries.ITEM.getId(ItemInit.DARK_OAK_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("dark_oak_club"), "club"));
//        SHAPED_RECIPES.put("jungle_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.JUNGLE_PLANKS), Registries.ITEM.getId(ItemInit.JUNGLE_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("jungle_club"), "club"));
//        SHAPED_RECIPES.put("mangrove_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.MANGROVE_PLANKS), Registries.ITEM.getId(ItemInit.MANGROVE_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("mangrove_club"), "club"));
//        SHAPED_RECIPES.put("oak_club",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.OAK_PLANKS), Registries.ITEM.getId(Items.STICK), null, "item", "item", "", SpartanWeaponsMain.id("oak_club"), "club"));
//        SHAPED_RECIPES.put("spruce_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.SPRUCE_PLANKS), Registries.ITEM.getId(ItemInit.SPRUCE_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("spruce_club"), "club"));
//        SHAPED_RECIPES.put("warped_club", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.WARPED_PLANKS), Registries.ITEM.getId(ItemInit.WARPED_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("warped_club"), "club"));
//
//        SHAPED_RECIPES.put("acacia_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.ACACIA_PLANKS), Registries.ITEM.getId(ItemInit.ACACIA_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("acacia_staff"), "staff"));
//        SHAPED_RECIPES.put("bamboo_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.BAMBOO_PLANKS), Registries.ITEM.getId(ItemInit.BAMBOO_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("bamboo_staff"), "staff"));
//        SHAPED_RECIPES.put("birch_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.BIRCH_PLANKS), Registries.ITEM.getId(ItemInit.BIRCH_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("birch_staff"), "staff"));
//        SHAPED_RECIPES.put("cherry_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.CHERRY_PLANKS), Registries.ITEM.getId(ItemInit.CHERRY_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("cherry_staff"), "staff"));
//        SHAPED_RECIPES.put("crimson_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.CRIMSON_PLANKS), Registries.ITEM.getId(ItemInit.CRIMSON_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("crimson_staff"), "staff"));
//        SHAPED_RECIPES.put("dark_oak_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DARK_OAK_PLANKS), Registries.ITEM.getId(ItemInit.DARK_OAK_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("dark_oak_staff"), "staff"));
//        SHAPED_RECIPES.put("jungle_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.JUNGLE_PLANKS), Registries.ITEM.getId(ItemInit.JUNGLE_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("jungle_staff"), "staff"));
//        SHAPED_RECIPES.put("mangrove_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.MANGROVE_PLANKS), Registries.ITEM.getId(ItemInit.MANGROVE_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("mangrove_staff"), "staff"));
//        SHAPED_RECIPES.put("oak_staff",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.OAK_PLANKS), Registries.ITEM.getId(Items.STICK), null, "item", "item", "", SpartanWeaponsMain.id("oak_staff"), "staff"));
//        SHAPED_RECIPES.put("spruce_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.SPRUCE_PLANKS), Registries.ITEM.getId(ItemInit.SPRUCE_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("spruce_staff"), "staff"));
//        SHAPED_RECIPES.put("warped_staff", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.WARPED_PLANKS), Registries.ITEM.getId(ItemInit.WARPED_STICK), null, "item", "item", "",
//                SpartanWeaponsMain.id("warped_staff"), "staff"));
//
//        // Stone
//        // SHAPED_RECIPES.put("stone_cutlass",
//        // new ShapedRecipeMaterial(Identifier.of("stone_tool_materials"), Identifier.of("c", "sticks"), "tag", "tag", SpartanWeaponsMain.ID("stone_cutlass"), "cutlass"));
//        // SHAPED_RECIPES.put("stone_dagger",
//        // new ShapedRecipeMaterial(Identifier.of("stone_tool_materials"), Identifier.of("c", "sticks"), "tag", "tag", SpartanWeaponsMain.ID("stone_dagger"), "dagger"));
//        // SHAPED_RECIPES.put("stone_glaive",
//        // new ShapedRecipeMaterial(Identifier.of("stone_tool_materials"), Identifier.of("c", "poles"), "tag", "tag", SpartanWeaponsMain.ID("stone_glaive"), "glaive"));
//        // SHAPED_RECIPES.put("stone_greatsword",
//        // new ShapedRecipeMaterial(Identifier.of("stone_tool_materials"), Identifier.of("c", "sticks"), "tag", "tag", SpartanWeaponsMain.ID("stone_greatsword"), "greatsword"));
//        // SHAPED_RECIPES.put("stone_halberd",
//        // new ShapedRecipeMaterial(Identifier.of("stone_tool_materials"), Identifier.of("c", "sticks"), "tag", "tag", SpartanWeaponsMain.ID("stone_halberd"), "halberd"));
//        // SHAPED_RECIPES.put("stone_katana",
//        // new ShapedRecipeMaterial(Identifier.of("stone_tool_materials"), Identifier.of("c", "sticks"), "tag", "tag", SpartanWeaponsMain.ID("stone_katana"), "katana"));
//        // SHAPED_RECIPES.put("stone_long_sword",
//        // new ShapedRecipeMaterial(Identifier.of("stone_tool_materials"), Identifier.of("c", "sticks"), "tag", "tag", SpartanWeaponsMain.ID("stone_long_sword"), "long_sword"));
//        // SHAPED_RECIPES.put("stone_mace", new ShapedRecipeMaterial(Identifier.of("stone_tool_materials"), Identifier.of("c", "sticks"), "tag", "tag", SpartanWeaponsMain.ID("stone_mace"),
//        // "mace"));
//        // SHAPED_RECIPES.put("stone_rapier",
//        // new ShapedRecipeMaterial(Identifier.of("stone_tool_materials"), Identifier.of("c", "sticks"), "tag", "tag", SpartanWeaponsMain.ID("stone_rapier"), "rapier"));
//        // SHAPED_RECIPES.put("stone_scythe",
//        // new ShapedRecipeMaterial(Identifier.of("stone_tool_materials"), Identifier.of("c", "sticks"), Identifier.of("c", "poles"), "tag", "tag", "tag", SpartanWeaponsMain.ID("stone_scythe"),
//        // "scythe"));
//        // SHAPED_RECIPES.put("stone_spear",
//        // new ShapedRecipeMaterial(Identifier.of("stone_tool_materials"), Identifier.of("c", "poles"), "tag", "tag", SpartanWeaponsMain.ID("stone_spear"), "spear"));
//        // SHAPED_RECIPES.put("stone_rapier",
//        // new ShapedRecipeMaterial(Identifier.of("stone_tool_materials"), Identifier.of("c", "sticks"), "tag", "tag", SpartanWeaponsMain.ID("stone_rapier"), "rapier"));
//
//        // Gold
//        SHAPED_RECIPES.put("golden_cutlass",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), Identifier.of("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.id("golden_cutlass"), "cutlass"));
//        SHAPED_RECIPES.put("golden_dagger",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), Identifier.of("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.id("golden_dagger"), "dagger"));
//        SHAPED_RECIPES.put("golden_glaive",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), Identifier.of("c", "poles"), null, "item", "tag", "", SpartanWeaponsMain.id("golden_glaive"), "glaive"));
//        SHAPED_RECIPES.put("golden_greatsword",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), Identifier.of("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.id("golden_greatsword"), "greatsword"));
//        SHAPED_RECIPES.put("golden_halberd",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), Identifier.of("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.id("golden_halberd"), "halberd"));
//        SHAPED_RECIPES.put("golden_katana",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), Identifier.of("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.id("golden_katana"), "katana"));
//        SHAPED_RECIPES.put("golden_mace", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), Identifier.of("c", "sticks"), Registries.ITEM.getId(Items.GOLD_BLOCK), "item", "tag",
//                "item", SpartanWeaponsMain.id("golden_mace"), "mace"));
//        SHAPED_RECIPES.put("golden_rapier",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), Identifier.of("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.id("golden_rapier"), "rapier"));
//        SHAPED_RECIPES.put("golden_scythe", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), Identifier.of("c", "sticks"), Identifier.of("c", "poles"), "item", "tag", "tag",
//                SpartanWeaponsMain.id("golden_scythe"), "scythe"));
//        SHAPED_RECIPES.put("golden_spear",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), Identifier.of("c", "poles"), null, "item", "tag", "", SpartanWeaponsMain.id("golden_spear"), "spear"));
//        SHAPED_RECIPES.put("golden_battle_axe", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), Identifier.of("c", "sticks"), Identifier.of("c", "poles"), "item", "tag", "tag",
//                SpartanWeaponsMain.id("golden_battle_axe"), "battle_axe"));
//        SHAPED_RECIPES.put("golden_kunai", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), Identifier.of("c", "sticks"), Registries.ITEM.getId(Items.SLIME_BALL), "item", "tag",
//                "item", SpartanWeaponsMain.id("golden_kunai"), "kunai"));
//        SHAPED_RECIPES.put("golden_javelin", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.GOLD_INGOT), Identifier.of("c", "poles"), Registries.ITEM.getId(Items.SLIME_BALL), "item", "tag",
//                "item", SpartanWeaponsMain.id("golden_javelin"), "javelin"));
//
//        // Iron
//        SHAPED_RECIPES.put("iron_cutlass",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), Identifier.of("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.id("iron_cutlass"), "cutlass"));
//        SHAPED_RECIPES.put("iron_dagger",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), Identifier.of("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.id("iron_dagger"), "dagger"));
//        SHAPED_RECIPES.put("iron_glaive",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), Identifier.of("c", "poles"), null, "item", "tag", "", SpartanWeaponsMain.id("iron_glaive"), "glaive"));
//        SHAPED_RECIPES.put("iron_greatsword",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), Identifier.of("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.id("iron_greatsword"), "greatsword"));
//        SHAPED_RECIPES.put("iron_halberd",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), Identifier.of("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.id("iron_halberd"), "halberd"));
//        SHAPED_RECIPES.put("iron_katana",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), Identifier.of("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.id("iron_katana"), "katana"));
//        SHAPED_RECIPES.put("iron_mace", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), Identifier.of("c", "sticks"), Registries.ITEM.getId(Items.IRON_BLOCK), "item", "tag", "item",
//                SpartanWeaponsMain.id("iron_mace"), "mace"));
//        SHAPED_RECIPES.put("iron_rapier",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), Identifier.of("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.id("iron_rapier"), "rapier"));
//        SHAPED_RECIPES.put("iron_scythe", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), Identifier.of("c", "sticks"), Identifier.of("c", "poles"), "item", "tag", "tag",
//                SpartanWeaponsMain.id("iron_scythe"), "scythe"));
//        SHAPED_RECIPES.put("iron_spear",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), Identifier.of("c", "poles"), null, "item", "tag", "", SpartanWeaponsMain.id("iron_spear"), "spear"));
//        SHAPED_RECIPES.put("iron_battle_axe", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), Identifier.of("c", "sticks"), Identifier.of("c", "poles"), "item", "tag", "tag",
//                SpartanWeaponsMain.id("iron_battle_axe"), "battle_axe"));
//        SHAPED_RECIPES.put("iron_kunai", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), Identifier.of("c", "sticks"), Registries.ITEM.getId(Items.SLIME_BALL), "item", "tag",
//                "item", SpartanWeaponsMain.id("iron_kunai"), "kunai"));
//        SHAPED_RECIPES.put("iron_javelin", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.IRON_INGOT), Identifier.of("c", "poles"), Registries.ITEM.getId(Items.SLIME_BALL), "item", "tag",
//                "item", SpartanWeaponsMain.id("iron_javelin"), "javelin"));
//
//        // Diamond
//        SHAPED_RECIPES.put("diamond_cutlass",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), Identifier.of("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.id("diamond_cutlass"), "cutlass"));
//        SHAPED_RECIPES.put("diamond_dagger",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), Identifier.of("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.id("diamond_dagger"), "dagger"));
//        SHAPED_RECIPES.put("diamond_glaive",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), Identifier.of("c", "poles"), null, "item", "tag", "", SpartanWeaponsMain.id("diamond_glaive"), "glaive"));
//        SHAPED_RECIPES.put("diamond_greatsword",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), Identifier.of("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.id("diamond_greatsword"), "greatsword"));
//        SHAPED_RECIPES.put("diamond_halberd",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), Identifier.of("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.id("diamond_halberd"), "halberd"));
//        SHAPED_RECIPES.put("diamond_katana",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), Identifier.of("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.id("diamond_katana"), "katana"));
//        SHAPED_RECIPES.put("diamond_mace", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), Identifier.of("c", "sticks"), Registries.ITEM.getId(Items.DIAMOND_BLOCK), "item", "tag",
//                "item", SpartanWeaponsMain.id("diamond_mace"), "mace"));
//        SHAPED_RECIPES.put("diamond_rapier",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), Identifier.of("c", "sticks"), null, "item", "tag", "", SpartanWeaponsMain.id("diamond_rapier"), "rapier"));
//        SHAPED_RECIPES.put("diamond_scythe", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), Identifier.of("c", "sticks"), Identifier.of("c", "poles"), "item", "tag", "tag",
//                SpartanWeaponsMain.id("diamond_scythe"), "scythe"));
//        SHAPED_RECIPES.put("diamond_spear",
//                new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), Identifier.of("c", "poles"), null, "item", "tag", "", SpartanWeaponsMain.id("diamond_spear"), "spear"));
//        SHAPED_RECIPES.put("diamond_battle_axe", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), Identifier.of("c", "sticks"), Identifier.of("c", "poles"), "item", "tag", "tag",
//                SpartanWeaponsMain.id("diamond_battle_axe"), "battle_axe"));
//        SHAPED_RECIPES.put("diamond_kunai", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), Identifier.of("c", "sticks"), Registries.ITEM.getId(Items.SLIME_BALL), "item", "tag",
//                "item", SpartanWeaponsMain.id("diamond_kunai"), "kunai"));
//        SHAPED_RECIPES.put("diamond_javelin", new ShapedRecipeMaterial(Registries.ITEM.getId(Items.DIAMOND), Identifier.of("c", "poles"), Registries.ITEM.getId(Items.SLIME_BALL), "item", "tag",
//                "item", SpartanWeaponsMain.id("diamond_javelin"), "javelin"));
//
//        // Netherite
//        SMITHING_RECIPES.put("netherite_cutlass", new SmithingRecipeMaterial(SpartanWeaponsMain.id("diamond_cutlass"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
//                SpartanWeaponsMain.id("netherite_cutlass"), Identifier.of("minecraft:netherite_upgrade_smithing_template")));
//        SMITHING_RECIPES.put("netherite_dagger", new SmithingRecipeMaterial(SpartanWeaponsMain.id("diamond_dagger"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
//                SpartanWeaponsMain.id("netherite_dagger"), Identifier.of("minecraft:netherite_upgrade_smithing_template")));
//        SMITHING_RECIPES.put("netherite_glaive", new SmithingRecipeMaterial(SpartanWeaponsMain.id("diamond_glaive"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
//                SpartanWeaponsMain.id("netherite_glaive"), Identifier.of("minecraft:netherite_upgrade_smithing_template")));
//        SMITHING_RECIPES.put("netherite_greatsword", new SmithingRecipeMaterial(SpartanWeaponsMain.id("diamond_greatsword"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
//                SpartanWeaponsMain.id("netherite_greatsword"), Identifier.of("minecraft:netherite_upgrade_smithing_template")));
//        SMITHING_RECIPES.put("netherite_halberd", new SmithingRecipeMaterial(SpartanWeaponsMain.id("diamond_halberd"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
//                SpartanWeaponsMain.id("netherite_halberd"), Identifier.of("minecraft:netherite_upgrade_smithing_template")));
//        SMITHING_RECIPES.put("netherite_katana", new SmithingRecipeMaterial(SpartanWeaponsMain.id("diamond_katana"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
//                SpartanWeaponsMain.id("netherite_katana"), Identifier.of("minecraft:netherite_upgrade_smithing_template")));
//        SMITHING_RECIPES.put("netherite_mace", new SmithingRecipeMaterial(SpartanWeaponsMain.id("diamond_mace"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
//                SpartanWeaponsMain.id("netherite_mace"), Identifier.of("minecraft:netherite_upgrade_smithing_template")));
//        SMITHING_RECIPES.put("netherite_rapier", new SmithingRecipeMaterial(SpartanWeaponsMain.id("diamond_rapier"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
//                SpartanWeaponsMain.id("netherite_rapier"), Identifier.of("minecraft:netherite_upgrade_smithing_template")));
//        SMITHING_RECIPES.put("netherite_scythe", new SmithingRecipeMaterial(SpartanWeaponsMain.id("diamond_scythe"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
//                SpartanWeaponsMain.id("netherite_scythe"), Identifier.of("minecraft:netherite_upgrade_smithing_template")));
//        SMITHING_RECIPES.put("netherite_spear", new SmithingRecipeMaterial(SpartanWeaponsMain.id("diamond_spear"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
//                SpartanWeaponsMain.id("netherite_spear"), Identifier.of("minecraft:netherite_upgrade_smithing_template")));
//        SMITHING_RECIPES.put("netherite_battle_axe", new SmithingRecipeMaterial(SpartanWeaponsMain.id("diamond_battle_axe"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
//                SpartanWeaponsMain.id("netherite_battle_axe"), Identifier.of("minecraft:netherite_upgrade_smithing_template")));
//        SMITHING_RECIPES.put("netherite_kunai", new SmithingRecipeMaterial(SpartanWeaponsMain.id("diamond_kunai"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
//                SpartanWeaponsMain.id("netherite_kunai"), Identifier.of("minecraft:netherite_upgrade_smithing_template")));
//        SMITHING_RECIPES.put("netherite_javelin", new SmithingRecipeMaterial(SpartanWeaponsMain.id("diamond_javelin"), Registries.ITEM.getId(Items.NETHERITE_INGOT), "item", "item",
//                SpartanWeaponsMain.id("netherite_javelin"), Identifier.of("minecraft:netherite_upgrade_smithing_template")));
    }

    public static void init() {
        generateRecipes();

        for (String key : SHAPED_RECIPES.keySet()) {
            ShapedRecipeMaterial material = SHAPED_RECIPES.get(key);
            RECIPES.put(SpartanWeaponsMain.id(key), RecipeGenerator.generateJson(material.headItem, material.handleItem, material.secondHandleItem, material.headType, material.handleType,
                    material.secondHandleType, material.output, material.itemName));
        }
        for (String key : SMITHING_RECIPES.keySet()) {
            SmithingRecipeMaterial material = SMITHING_RECIPES.get(key);
            RECIPES.put(SpartanWeaponsMain.id(key),
                    RecipeGenerator.generateSmithingJson(material.baseItem, material.additionItem, material.baseType, material.additionType, material.output, material.template));
        }
    }
}
