package com.bunnarak.recipeapp.network.responses

import com.bunnarak.recipeapp.network.model.RecipeNetworkEntity
import com.google.gson.annotations.SerializedName

class RecipeSearchResponse (
    @SerializedName("count")
    var count: Int,

    @SerializedName("result")
    var result: List<RecipeNetworkEntity>
)