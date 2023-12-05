package com.example.product.service;

import com.example.product.service.dto.ProductRequest;
import com.example.product.service.model.Product;

public class ProductMapper {
    public static Product mapProductRequestToProduct(ProductRequest request){
        return Product.builder()
                .names(request.getNames())
                .description(request.getDescription())
                .price(request.getPrice())
                .build();
    }
}
