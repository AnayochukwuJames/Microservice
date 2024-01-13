package com.example.product.service;

import com.example.product.service.dto.ProductRequest;
import com.example.product.service.dto.ProductResponse;
import com.example.product.service.dto.ProductUpdateResponse;
import com.example.product.service.model.Product;

public class ProductMapper {
    public static Product mapProductRequestToProduct(ProductRequest productRequest){
        return Product.builder()
                .name(productRequest.getNames())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
    }
    public static ProductResponse mapProductResponse(Product productResponse){
        return ProductResponse.builder()
                .id(productResponse.getId())
                .names(productResponse.getName())
                .description(productResponse.getDescription())
                .price(productResponse.getPrice())
                .build();
    }
    public static Product mapProductUpdateRequestToProduct(Product product, ProductUpdateResponse productUpdateResponse){
       product.setName(productUpdateResponse.getNames());
       product.setPrice(productUpdateResponse.getPrice());
       product.setDescription(productUpdateResponse.getDescription());
        return product;
    }
}
