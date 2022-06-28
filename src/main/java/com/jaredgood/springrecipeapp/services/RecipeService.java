package com.jaredgood.springrecipeapp.services;

import com.jaredgood.springrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
