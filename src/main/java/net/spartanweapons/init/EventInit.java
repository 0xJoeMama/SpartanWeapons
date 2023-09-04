package net.spartanweapons.init;

import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;

@SuppressWarnings("unused")
public class EventInit {

    public static void init() {
        // ModelLoadingPlugin.register(context -> {
        // context.resolveModel().register(test -> {
        // test.
        // return null;
        // });
        // });
        // LootTableEvents.MODIFY.register((resourceManager, lootManager, id, supplier, setter) -> {
        // if (leavesBlockList.contains(id) && ConfigInit.CONFIG.extraStickDropChance > 0.0001f) {
        // LootPool pool = LootPool.builder().with(ItemEntry.builder(Items.STICK).build()).rolls(BinomialLootNumberProvider.create(1, ConfigInit.CONFIG.extraStickDropChance))
        // .conditionally(BlockLootTableGeneratorAccessor.getWithoutSilkTouchNorShears()).build();
        // supplier.pool(pool);
        // }
        // });
    }
}
