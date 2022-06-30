package com.jaredgood.springrecipeapp.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CategoryTest {

    Category category;

    @BeforeEach
    public void setUp(){
        category = new Category();
    }

    @Test
    void getId() {
        Long idValue = Long.valueOf(4);
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    void getDescription() {
        String desciptionValue = "Testing Value";
        category.setDescription(desciptionValue);
        assertEquals(desciptionValue, category.getDescription());
    }

    @Test
    void getRecipes() {
        Set<Recipe> recipesValue = new HashSet<>();
        category.setRecipes(recipesValue);

    }
}
