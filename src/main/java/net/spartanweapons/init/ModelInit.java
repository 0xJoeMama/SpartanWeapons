package net.spartanweapons.init;

import java.util.Iterator;
import java.util.List;

import org.jetbrains.annotations.Nullable;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ModelInit {

   // public static RuntimeResourcePack ARRP_RESOURCE_PACK;

    public static void init() {
        // ARRP_RESOURCE_PACK = RuntimeResourcePack.create("spartanweapons:weapons");
        // // Generate models
        // Iterator<String> items = ItemInit.ITEM_STRINGS.iterator();
        // while (items.hasNext()) {
        //     String item = items.next();
        //     if (item.equals("club") || item.equals("staff") || item.equals("stick") || item.equals("pole")) {
        //         for (int i = 0; i < ItemInit.WOOD_MATERIALS.size(); i++) {
        //             ARRP_RESOURCE_PACK.addModel(getOtherJModel(item, ItemInit.WOOD_MATERIALS.get(i)), new Identifier("spartanweapons", "item/" + ItemInit.WOOD_MATERIALS.get(i) + "_" + item));
        //         }
        //         continue;
        //     }

        //     for (int i = 0; i < ItemInit.MATERIALS.size(); i++) {
        //         ARRP_RESOURCE_PACK.addModel(getJModel(item, ItemInit.MATERIALS.get(i)), new Identifier("spartanweapons", "item/" + ItemInit.MATERIALS.get(i) + "_" + item));
        //         if (item.equals("javelin")) {
        //             ARRP_RESOURCE_PACK.addModel(
        //                     JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/javelins/" + ItemInit.MATERIALS.get(i) + "_" + item))
        //                             .display(JModel.display().setThirdperson_righthand(JModel.position().rotation(0f, -90f, -140f).translation(0f, 0f, 1.25f).scale(1.7f, 1.7f, 0.85f))
        //                                     .setThirdperson_lefthand(JModel.position().rotation(0f, -90f, 130f).translation(0f, -5.75f, 1.25f).scale(1.7f, 1.7f, 0.85f))
        //                                     .setFirstperson_righthand(JModel.position().rotation(-40f, -90f, 25f).translation(8.5f, 6.5f, -5f).scale(1.34f, 1.34f, 0.68f))
        //                                     .setFirstperson_lefthand(JModel.position().rotation(-40f, 90f, -25f).translation(8.5f, 6.5f, -5f).scale(1.34f, 1.34f, 0.68f))),
        //                     new Identifier("spartanweapons", "item/" + ItemInit.MATERIALS.get(i) + "_" + item + "_throwing"));
        //         }
        //     }

        // }

        // RRPCallback.BEFORE_VANILLA.register(a -> a.add(ARRP_RESOURCE_PACK));

        // for (int i = 0; i < THROWING_ITEMS.size(); i++) {
        //     ModelPredicateProviderRegistry.register(THROWING_ITEMS.get(i), new Identifier("spartanweapons", "throwing"), (stack, world, entity, seed) -> {
        //         return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f;
        //     });
        // }
    }

    // // ARRP
    // @Nullable
    // private static JModel getOtherJModel(String item, String material) {
    //     switch (item) {

    //     case "stick":
    //         return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/sticks/" + material + "_" + item));

    //     case "pole":
    //         return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/poles/" + material + "_" + item));

    //     case "staff":
    //         return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/staves/" + material + "_" + item))
    //                 .display(JModel.display().setThirdperson_righthand(JModel.position().rotation(-55f, -90f, 0f).translation(0f, -1.75f, 1.5f).scale(1.7f, 1.7f, 0.85f))
    //                         .setThirdperson_lefthand(JModel.position().rotation(-55f, 90f, 0f).translation(0f, -1.75f, 1.5f).scale(1.7f, 1.7f, 0.85f))
    //                         .setFirstperson_righthand(JModel.position().rotation(-60f, -90f, 0f).translation(1.13f, -0.8f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setFirstperson_lefthand(JModel.position().rotation(-60f, 90f, 0f).translation(1.13f, -0.8f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setGround(JModel.position().scale(1f, 1f, 0.5f)).setGui(JModel.position().scale(1.14f, 1.14f, 1f)).setFixed(JModel.position().scale(2f, 2f, 1f)));

    //     case "club":
    //         return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/clubs/" + material + "_" + item))
    //                 .display(JModel.display().setThirdperson_righthand(JModel.position().rotation(-55f, -90f, 0f).translation(0f, 1.75f, 0.75f).scale(0.85f, 0.85f, 0.85f))
    //                         .setThirdperson_lefthand(JModel.position().rotation(-55f, 90f, 0f).translation(0f, 1.75f, 0.75f).scale(0.85f, 0.85f, 0.85f))
    //                         .setFirstperson_righthand(JModel.position().rotation(-25f, -90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(0.68f, 0.68f, 0.68f))
    //                         .setFirstperson_lefthand(JModel.position().rotation(-25f, 90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(0.68f, 0.68f, 0.68f)));

    //     default:
    //         throw new IllegalStateException("Could not find JModel of item " + item);
    //     }
    // }

    // @Nullable
    // private static JModel getJModel(String item, String material) {

    //     switch (item) {

    //     case "club":
    //         return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/clubs/" + material + "_" + item))
    //                 .display(JModel.display().setThirdperson_righthand(JModel.position().rotation(-55f, -90f, 0f).translation(0f, 1.75f, 0.75f).scale(0.85f, 0.85f, 0.85f))
    //                         .setThirdperson_lefthand(JModel.position().rotation(-55f, 90f, 0f).translation(0f, 1.75f, 0.75f).scale(0.85f, 0.85f, 0.85f))
    //                         .setFirstperson_righthand(JModel.position().rotation(-25f, -90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(0.68f, 0.68f, 0.68f))
    //                         .setFirstperson_lefthand(JModel.position().rotation(-25f, 90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(0.68f, 0.68f, 0.68f)));

    //     case "cutlass":
    //         return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/cutlasses/" + material + "_" + item))
    //                 .display(JModel.display().setThirdperson_righthand(JModel.position().rotation(-55f, -90f, 0f).translation(0f, 5.5f, 0.5f).scale(1.7f, 1.7f, 0.85f))
    //                         .setThirdperson_lefthand(JModel.position().rotation(-55f, 90f, 0f).translation(0f, 5.5f, 0.5f).scale(1.7f, 1.7f, 0.85f))
    //                         .setFirstperson_righthand(JModel.position().rotation(-25f, -90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setFirstperson_lefthand(JModel.position().rotation(-25f, 90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setGround(JModel.position().scale(1f, 1f, 0.5f)).setGui(JModel.position().scale(1.6f, 1.6f, 1f)).setFixed(JModel.position().scale(2f, 2f, 1f)));

    //     case "dagger":
    //         return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/daggers/" + material + "_" + item))
    //                 .display(JModel.display().setThirdperson_righthand(JModel.position().rotation(126f, -90f, 0f).translation(0f, 1.75f, 0.75f).scale(0.85f, 0.85f, 0.85f))
    //                         .setThirdperson_lefthand(JModel.position().rotation(126f, 90f, 0f).translation(0f, 1.75f, 0.75f).scale(0.85f, 0.85f, 0.85f))
    //                         .setFirstperson_righthand(JModel.position().rotation(105f, -90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(0.68f, 0.68f, 0.68f))
    //                         .setFirstperson_lefthand(JModel.position().rotation(105f, 90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(0.68f, 0.68f, 0.68f)));

    //     case "glaive":
    //         return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/glaives/" + material + "_" + item))
    //                 .display(JModel.display().setThirdperson_righthand(JModel.position().rotation(-55f, -90f, 0f).translation(0f, 4.5f, 0.5f).scale(1.7f, 1.7f, 0.85f))
    //                         .setThirdperson_lefthand(JModel.position().rotation(-55f, 90f, 0f).translation(0f, 4.5f, 0.5f).scale(1.7f, 1.7f, 0.85f))
    //                         .setFirstperson_righthand(JModel.position().rotation(-60f, -90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setFirstperson_lefthand(JModel.position().rotation(-60f, 90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setGround(JModel.position().scale(1f, 1f, 0.5f)).setFixed(JModel.position().scale(2f, 2f, 1f)));

    //     case "greatsword":
    //         return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/greatswords/" + material + "_" + item))
    //                 .display(JModel.display().setThirdperson_righthand(JModel.position().rotation(-55f, -90f, 0f).translation(0f, 9f, -0.5f).scale(1.7f, 1.7f, 0.85f))
    //                         .setThirdperson_lefthand(JModel.position().rotation(-55f, 90f, 0f).translation(0f, 9f, -0.5f).scale(1.7f, 1.7f, 0.85f))
    //                         .setFirstperson_righthand(JModel.position().rotation(-25f, -90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setFirstperson_lefthand(JModel.position().rotation(-25f, 90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setGround(JModel.position().scale(1f, 1f, 0.5f)).setFixed(JModel.position().scale(2f, 2f, 1f)));

    //     case "halberd":
    //         return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/halberds/" + material + "_" + item))
    //                 .display(JModel.display().setThirdperson_righthand(JModel.position().rotation(-55f, -90f, 0f).translation(0f, 4.0f, 0.5f).scale(1.7f, 1.7f, 0.85f))
    //                         .setThirdperson_lefthand(JModel.position().rotation(-55f, 90f, 0f).translation(0f, 4f, 0.5f).scale(1.7f, 1.7f, 0.85f))
    //                         .setFirstperson_righthand(JModel.position().rotation(-60f, -90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setFirstperson_lefthand(JModel.position().rotation(-60f, 90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setGround(JModel.position().scale(1f, 1f, 0.5f)).setFixed(JModel.position().scale(2f, 2f, 1f)));

    //     case "katana":
    //         return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/katanas/" + material + "_" + item))
    //                 .display(JModel.display().setThirdperson_righthand(JModel.position().rotation(-55f, -90f, 0f).translation(0f, 5.5f, 0.75f).scale(1.7f, 1.7f, 0.85f))
    //                         .setThirdperson_lefthand(JModel.position().rotation(-55f, 90f, 0f).translation(0f, 5.5f, 0.75f).scale(1.7f, 1.7f, 0.85f))
    //                         .setFirstperson_righthand(JModel.position().rotation(-25f, -90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setFirstperson_lefthand(JModel.position().rotation(-25f, 90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setGround(JModel.position().scale(1f, 1f, 0.5f)).setFixed(JModel.position().scale(2f, 2f, 1f)).setGui(JModel.position().scale(1.45f, 1.45f, 1f)));

    //     case "mace":
    //         return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/maces/" + material + "_" + item))
    //                 .display(JModel.display().setThirdperson_righthand(JModel.position().rotation(-55f, -90f, 0f).translation(0f, 5f, 0.5f).scale(1.7f, 1.7f, 0.85f))
    //                         .setThirdperson_lefthand(JModel.position().rotation(-55f, 90f, 0f).translation(0f, 5f, 0.5f).scale(1.7f, 1.7f, 0.85f))
    //                         .setFirstperson_righthand(JModel.position().rotation(-25f, -90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setFirstperson_lefthand(JModel.position().rotation(-25f, 90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setGround(JModel.position().scale(1f, 1f, 0.5f)).setFixed(JModel.position().scale(2f, 2f, 1f)).setGui(JModel.position().scale(1.33f, 1.33f, 1f)));

    //     case "rapier":
    //         return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/rapiers/" + material + "_" + item))
    //                 .display(JModel.display().setThirdperson_righthand(JModel.position().rotation(-55f, -90f, 0f).translation(0f, 5f, 0.25f).scale(0.85f, 0.85f, 0.85f))
    //                         .setThirdperson_lefthand(JModel.position().rotation(-55f, 90f, 0f).translation(0f, 5f, 0.25f).scale(0.85f, 0.85f, 0.85f))
    //                         .setFirstperson_righthand(JModel.position().rotation(-25f, -90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(0.68f, 0.68f, 0.68f))
    //                         .setFirstperson_lefthand(JModel.position().rotation(-25f, 90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(0.68f, 0.68f, 0.68f)));

    //     case "scythe":
    //         return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/scythes/" + material + "_" + item))
    //                 .display(JModel.display().setThirdperson_righthand(JModel.position().rotation(-55f, -90f, 0f).translation(0f, 3f, 1.75f).scale(1.7f, 1.7f, 0.85f))
    //                         .setThirdperson_lefthand(JModel.position().rotation(-55f, 90f, 0f).translation(0f, 3f, 1.75f).scale(1.7f, 1.7f, 0.85f))
    //                         .setFirstperson_righthand(JModel.position().rotation(-25f, -90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setFirstperson_lefthand(JModel.position().rotation(-25f, 90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setGround(JModel.position().scale(1f, 1f, 0.5f)).setGui(JModel.position().scale(1.15f, 1.15f, 1f)).setFixed(JModel.position().scale(2f, 2f, 1f)));

    //     case "spear":
    //         return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/spears/" + material + "_" + item))
    //                 .display(JModel.display().setThirdperson_righthand(JModel.position().rotation(-55f, -90f, 0f).translation(0f, 3.5f, 0.75f).scale(1.7f, 1.7f, 0.85f))
    //                         .setThirdperson_lefthand(JModel.position().rotation(-55f, 90f, 0f).translation(0f, 3.5f, 0.75f).scale(1.7f, 1.7f, 0.85f))
    //                         .setFirstperson_righthand(JModel.position().rotation(-60f, -90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setFirstperson_lefthand(JModel.position().rotation(-60f, 90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setGround(JModel.position().scale(1f, 1f, 0.5f)).setFixed(JModel.position().scale(2f, 2f, 1f)));

    //     case "battle_axe":
    //         return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/battleaxes/" + material + "_" + item))
    //                 .display(JModel.display().setThirdperson_righthand(JModel.position().rotation(-55f, -90f, 0f).translation(0f, 5.25f, 0.25f).scale(1.7f, 1.7f, 0.85f))
    //                         .setThirdperson_lefthand(JModel.position().rotation(-55f, 90f, 0f).translation(0f, 5.25f, 0.25f).scale(1.7f, 1.7f, 0.85f))
    //                         .setFirstperson_righthand(JModel.position().rotation(-25f, -90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setFirstperson_lefthand(JModel.position().rotation(-25f, 90f, 0f).translation(1.13f, 3.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setGround(JModel.position().scale(1f, 1f, 0.5f)).setGui(JModel.position().scale(1.15f, 1.15f, 1f)).setFixed(JModel.position().scale(2f, 2f, 1f)));

    //     case "kunai":
    //         return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/kunais/" + material + "_" + item))
    //                 .display(JModel.display().setThirdperson_righthand(JModel.position().rotation(-55f, -90f, 0f).translation(0f, 0.75f, 0.75f).scale(0.85f, 0.85f, 0.85f))
    //                         .setThirdperson_lefthand(JModel.position().rotation(-55f, 90f, 0f).translation(0f, 0.75f, 0.75f).scale(0.85f, 0.85f, 0.85f))
    //                         .setFirstperson_righthand(JModel.position().rotation(-25f, -90f, 0f).translation(1.13f, 0.7f, 1.13f).scale(0.68f, 0.68f, 0.68f))
    //                         .setFirstperson_lefthand(JModel.position().rotation(-25f, 90f, 0f).translation(1.13f, 0.7f, 1.13f).scale(0.68f, 0.68f, 0.68f)));

    //     case "javelin":
    //         return JModel.model().parent("item/handheld").textures(JModel.textures().layer0("spartanweapons:item/javelins/" + material + "_" + item))
    //                 .addOverride(JModel.override(JModel.condition().parameter("spartanweapons:throwing", 1.0f), new Identifier("spartanweapons:item/" + material + "_" + item + "_throwing")))
    //                 .display(JModel.display().setThirdperson_righthand(JModel.position().rotation(-55f, -90f, 0f).translation(0f, 0f, 1.25f).scale(1.7f, 1.7f, 0.85f))
    //                         .setThirdperson_lefthand(JModel.position().rotation(-55f, 90f, 0f).translation(0f, 0f, 1.25f).scale(1.7f, 1.7f, 0.85f))
    //                         .setFirstperson_righthand(JModel.position().rotation(-25f, -90f, 0f).translation(1.13f, 0.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setFirstperson_lefthand(JModel.position().rotation(-25f, 90f, 0f).translation(1.13f, 0.2f, 1.13f).scale(1.36f, 1.36f, 0.68f))
    //                         .setGround(JModel.position().scale(1f, 1f, 0.5f)).setGui(JModel.position().scale(1.15f, 1.15f, 1f)).setFixed(JModel.position().scale(2f, 2f, 1f)));

    //     default:
    //         throw new IllegalStateException("Could not find JModel of item " + item);
    //     }
    // }

}
