package com.example.product.service;

import com.example.product.service.dto.ProductRequest;
import com.example.product.service.dto.ProductResponse;
import com.example.product.service.model.Product;

public class ProductMapper {
    public static Product mapProductRequestToProduct(ProductRequest request){
        return Product.builder()
                .names(request.getNames())
                .description(request.getDescription())
                .price(request.getPrice())
                .build();
    }
    public static Product mapProductResponse(ProductResponse response){
        return Product.builder()
                .id(response.getId())
                .names(response.getNames())
                .description(response.getDescription())
                .price(response.getPrice())
                .build();
    }
}
