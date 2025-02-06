package gay.quack.kiln;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class KilnMain implements ModInitializer {
    public static RecipeType<KilnRecipe> KILN_RECIPE_TYPE;
    public Block KILN_BLOCK;
    public Item KILN_ITEM;
    public static BlockEntityType<KilnBlockEntity> KILN_BLOCK_ENTITY;
    public static final String MOD_ID = "ember_kiln";

    public static RecipeSerializer<KilnRecipe> KILN_RECIPE_SERIALIZER;

    public static ScreenHandlerType<KilnScreenHandler> KILN_SCREEN_HANDLER;

    @Override
    public void onInitialize() {
        System.out.println("Hello! Let's do kiln stuff, shall we?");
        KILN_BLOCK = Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, "kiln"), new KilnBlock(AbstractBlock.Settings.copy(Blocks.FURNACE).strength(3.5f).requiresTool()));
        KILN_ITEM = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "kiln"), new BlockItem(KILN_BLOCK, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> entries.add(KILN_ITEM));

        KILN_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(MOD_ID, "kiln"),
                BlockEntityType.Builder.create(KilnBlockEntity::new, KILN_BLOCK).build());

        KILN_RECIPE_TYPE = Registry.register(Registries.RECIPE_TYPE, Identifier.of(MOD_ID, "kiln"), new RecipeType<KilnRecipe>() {
            @Override
            public String toString() {
                return "kiln";
            }
        });

        KILN_RECIPE_SERIALIZER = Registry.register(Registries.RECIPE_SERIALIZER, Identifier.of(MOD_ID, "kiln"), new CookingRecipeSerializer<>(KilnRecipe::new, 100));
        KILN_SCREEN_HANDLER = new ScreenHandlerType<>(KilnScreenHandler::new, FeatureSet.empty());
        Registry.register(Registries.SCREEN_HANDLER, Identifier.of(MOD_ID, "kiln"), KILN_SCREEN_HANDLER);
    }
}
