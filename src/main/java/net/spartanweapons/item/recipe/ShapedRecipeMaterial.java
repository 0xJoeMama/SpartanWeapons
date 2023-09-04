package net.spartanweapons.item.recipe;

import org.jetbrains.annotations.Nullable;

import net.minecraft.util.Identifier;

public class ShapedRecipeMaterial {

    public Identifier headItem;
    public Identifier handleItem;
    @Nullable
    public Identifier secondHandleItem;
    public String headType;
    public String handleType;
    public String secondHandleType;
    public Identifier output;
    public String itemName;

    public ShapedRecipeMaterial(Identifier headItem, Identifier handleItem, @Nullable Identifier secondHandleItem, String headType, String handleType, String secondHandleType, Identifier output,
            String itemName) {
        this.headItem = headItem;
        this.handleItem = handleItem;
        this.secondHandleItem = secondHandleItem;
        this.headType = headType;
        this.handleType = handleType;
        this.secondHandleType = secondHandleType;
        this.output = output;
        this.itemName = itemName;
    }

}