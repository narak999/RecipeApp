package com.bunnarak.recipeapp.repository

import com.bunnarak.recipeapp.domain.model.Recipe
import com.bunnarak.recipeapp.network.RecipeService
import com.bunnarak.recipeapp.network.model.RecipeDTOMapper

class RecipeRepositoryImpl(
    private val recipeService: RecipeService,
    private val mapper: RecipeDTOMapper
): RecipeRepository {
    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        return mapper.toDomainList(recipeService.search(token, page, query).recipes)
    }

    override suspend fun get(token: String, id: Int): Recipe {
        return mapper.mapToDomainModel(recipeService.get(token, id))
    }

}