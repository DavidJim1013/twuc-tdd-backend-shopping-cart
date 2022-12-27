package com.thoughtworks.capability.repository;

import com.thoughtworks.capability.WebApplicationTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductRepositoryTest extends WebApplicationTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    void shouldReturnEmptyProduct() {
        // given

        // when
        final var products = productRepository.findAll();
        // then
        assertEquals(products.size(),0);
    }
}
