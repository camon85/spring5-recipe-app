package com.camon.spring5recipeapp.services;

import com.camon.spring5recipeapp.cammands.RecipeCommand;
import com.camon.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
