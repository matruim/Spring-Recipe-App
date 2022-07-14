package com.jaredgood.springrecipeapp.repositories;

import com.jaredgood.springrecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
