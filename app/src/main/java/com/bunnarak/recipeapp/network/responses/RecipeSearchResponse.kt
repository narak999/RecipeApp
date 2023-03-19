package com.bunnarak.recipeapp.network.responses

import com.bunnarak.recipeapp.network.model.RecipeDTO
import com.google.gson.annotations.SerializedName

data class RecipeSearchResponse (
    @SerializedName("count")
    var count: Int,

    @SerializedName("recipes")
    var recipes: List<RecipeDTO>
)