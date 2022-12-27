package com.thoughtworks.capability.service;

import com.thoughtworks.capability.repository.ProductRepository;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ShoppingCartServiceTest {
    private final ProductRepository productRepository = mock(ProductRepository.class);
    private final ShoppingCartService shoppingCartService = new ShoppingCartService(productRepository);

    @Test
    void shouldReturnEmptyShoppingCartWhenHasNoProducts() {
        // given
        when(productRepository.findAll()).thenReturn(Lists.emptyList());
        // when
        final var shoppingCartResponse = shoppingCartService.findShoppingCart();

        // then
        assertEquals(shoppingCartResponse.getProducts().size(),0);
        assertEquals(shoppingCartResponse.getTotalPrice(), BigDecimal.ZERO);
    }
}
