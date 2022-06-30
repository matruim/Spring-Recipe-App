package com.jaredgood.springrecipeapp.repositories;

import com.jaredgood.springrecipeapp.domain.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByDescription() {
        String uomValue = "Teaspoon";
        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription(uomValue);
        assertEquals(uomValue, uomOptional.get().getDescription());
    }

    @Test
    void findByDescriptionCup(){
        String uomValue = "Cup";
        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription(uomValue);
        assertEquals(uomValue, uomOptional.get().getDescription());
    }
}
