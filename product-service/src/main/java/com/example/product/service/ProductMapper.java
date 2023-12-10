package com.example.product.service;

import com.example.product.service.dto.ProductRequest;
import com.example.product.service.dto.ProductResponse;
import com.example.product.service.dto.ProductUpdateResponse;
import com.example.product.service.model.Product;

public class ProductMapper {
    public static Product mapProductRequestToProduct(ProductRequest request){
        return Product.builder()
                .names(request.getNames())
                .colour(request.getColour())
                .description(request.getDescription())
                .price(request.getPrice())
                .build();
    }
    public static ProductResponse mapProductResponse(Product response){
        return ProductResponse.builder()
                .id(response.getId())
                .names(response.getNames())
                .colour(response.getColour())
                .description(response.getDescription())
                .price(response.getPrice())
                .build();
    }
    public static Product mapProductUpdateRequestToProduct(Product product, ProductUpdateResponse response){
       product.setNames(response.getNames());
       product.setColour(product.getColour());
       product.setPrice(response.getPrice());
       product.setDescription(response.getDescription());
        return product;
    }
}
