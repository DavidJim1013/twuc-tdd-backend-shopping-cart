package com.thoughtworks.capability.web.dto;

import com.thoughtworks.capability.domain.Product;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
public class ShoppingCartResponse {
    private final List<Product> products;
    private final BigDecimal totalPrice;
}
