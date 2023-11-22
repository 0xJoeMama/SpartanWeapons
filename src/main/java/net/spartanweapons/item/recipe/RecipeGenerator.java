package net.spartanweapons.item.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.jetbrains.annotations.Nullable;

import net.minecraft.util.Identifier;

public class RecipeGenerator {

    public static JsonObject generateJson(Identifier headItem, Identifier handleItem, @Nullable Identifier secondHandleItem, String headType, String handleType, String secondHandleType,
            Identifier output, String itemName) {
        JsonObject json = new JsonObject();

        json.addProperty("type", "minecraft:crafting_shaped");

        JsonArray jsonArray = new JsonArray();
        switch (itemName) {
        case "club":
            jsonArray.add(" ed");
            jsonArray.add(" de");
            jsonArray.add("e  ");
            break;
        case "cutlass":
            jsonArray.add(" dd");
            jsonArray.add("d  ");
            jsonArray.add("e  ");
            break;
        case "dagger":
            jsonArray.add("d");
            jsonArray.add("e");
            break;
        case "glaive":
            jsonArray.add("d");
            jsonArray.add("d");
            jsonArray.add("e");
            break;
        case "greatsword":
            jsonArray.add(" d ");
            jsonArray.add(" d ");
            jsonArray.add("ded");
            break;
        case "halberd":
            jsonArray.add(" d");
            jsonArray.add("dd");
            jsonArray.add("de");
            break;
        case "katana":
            jsonArray.add(" d");
            jsonArray.add("dd");
            jsonArray.add("e ");
            break;
        case "mace":
            jsonArray.add("f");
            jsonArray.add("d");
            jsonArray.add("e");
            break;
        case "rapier":
            jsonArray.add("  d");
            jsonArray.add(" d ");
            jsonArray.add("e  ");
            break;
        case "scythe":
            jsonArray.add(" dd");
            jsonArray.add("ddf");
            jsonArray.add("d e");
            break;
        case "spear":
            jsonArray.add("d");
            jsonArray.add("e");
            break;
        case "staff":
            jsonArray.add("e");
            jsonArray.add("d");
            jsonArray.add("e");
            break;
        case "wood_spear":
            jsonArray.add(" dd");
            jsonArray.add(" ed");
            jsonArray.add("e  ");
            break;
        case "pole":
            jsonArray.add("e");
            jsonArray.add("d");
            jsonArray.add("e");
            break;
        case "battle_axe":
            jsonArray.add("ddd");
            jsonArray.add("dfd");
            jsonArray.add(" e ");
            break;
        case "kunai":
            jsonArray.add("fd");
            jsonArray.add("e ");
            break;
        case "javelin":
            jsonArray.add("d");
            jsonArray.add("f");
            jsonArray.add("e");
            break;
        }

        json.add("pattern", jsonArray);

        JsonObject obj = new JsonObject();
        JsonObject key = new JsonObject();

        obj.addProperty(headType, headItem.toString());
        key.add("d", obj);

        obj = new JsonObject();
        obj.addProperty(handleType, handleItem.toString());
        key.add("e", obj);

        if (secondHandleItem != null) {
            obj = new JsonObject();
            obj.addProperty(secondHandleType, secondHandleItem.toString());
            key.add("f", obj);
        }

        json.add("key", key);

        obj = new JsonObject();
        obj.addProperty("item", output.toString());
        obj.addProperty("count", 1);
        json.add("result", obj);

        return json;
    }

    public static JsonObject generateSmithingJson(Identifier base, Identifier addition, String baseType, String additionType, Identifier output, Identifier template) {
        JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:smithing_transform");

        JsonObject obj = new JsonObject();
        obj.addProperty(baseType, base.toString());
        json.add("base", obj);

        obj = new JsonObject();
        obj.addProperty(additionType, addition.toString());
        json.add("addition", obj);

        obj = new JsonObject();
        obj.addProperty("item", output.toString());
        json.add("result", obj);

        obj = new JsonObject();
        obj.addProperty("item", template.toString());
        json.add("template", obj);

        return json;
    }
}