package de.mathisburger.mcheli

import net.minecraft.item.crafting.IRecipe

/**
 * Interface of a recipe list
 */
interface IRecipeList  {
    /**
     * Gets the size of the recipe list
     */
    fun getRecipeListSize(): Int

    /**
     * Gets a specific recipe by its index
     */
    fun getRecipe(paramInt: Int): IRecipe
}
