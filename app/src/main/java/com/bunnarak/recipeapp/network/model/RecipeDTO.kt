package com.bunnarak.recipeapp.network.model

import com.google.gson.annotations.SerializedName

data class RecipeDTO (

    @SerializedName("pk")
    var primaryKey: Int? = null,

    @SerializedName("title")
    var title: String? = null,

    @SerializedName("featured_image")
    var featuredImage: String? = null,

    @SerializedName("rating")
    var rating: Int? = null,

    @SerializedName("publisher")
    var publisher: String? = null,

    @SerializedName("source_url")
    var sourceUrl: String? = null,

    @SerializedName("description")
    var description: String? = null,

    @SerializedName("cooking_instructions")
    var cookingInstructions: String? = null,

    @SerializedName("ingredients")
    var ingredients: List<String>? = listOf(),

    @SerializedName("date_added")
    var dateAdded: String? = null,

    @SerializedName("date_updated")
    var dateUpdated: String? = null
)