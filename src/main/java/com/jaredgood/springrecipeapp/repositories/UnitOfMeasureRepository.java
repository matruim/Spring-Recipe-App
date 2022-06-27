package com.jaredgood.springrecipeapp.repositories;

import com.jaredgood.springrecipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
