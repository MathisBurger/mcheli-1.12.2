package de.mathisburger.mcheli

import net.minecraft.item.crafting.IRecipe

interface IRecipeList  {
    fun getRecipeListSize(): Int
    fun getRecipe(paramInt: Int): IRecipe
}
