package me.king.koala.mcautobots.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class TieredBotListener implements Listener {

    private final ShapedRecipe recipe;
    private final ItemStack[] customIngredients;

    public TieredBotListener(ShapedRecipe recipe, ItemStack... customIngredients) {
        this.recipe = recipe;
        this.customIngredients = customIngredients;
    }

    @EventHandler
    public void onCraft(PrepareItemCraftEvent event) {
        if (recipe.equals(event.getRecipe())) {
            boolean passes = true;
            for (ItemStack customItem : customIngredients) {
                if (!event.getInventory().contains(customItem)) {
                    passes = false;
                    break;
                }
            }
            if (!passes)
                event.getInventory().setResult(null);
        }
    }

}
