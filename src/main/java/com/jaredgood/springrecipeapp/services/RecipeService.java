package com.jaredgood.springrecipeapp.services;

import com.jaredgood.springrecipeapp.commands.RecipeCommand;
import com.jaredgood.springrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long id);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    RecipeCommand findCommandById(long id);
    void deleteById(Long id);
}
