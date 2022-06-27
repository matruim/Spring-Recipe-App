package com.jaredgood.springrecipeapp.repositories;

import com.jaredgood.springrecipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
