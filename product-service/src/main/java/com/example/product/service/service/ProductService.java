package com.example.product.service.service;

import com.example.product.service.dto.ProductRequest;
import com.example.product.service.model.Product;
import org.springframework.http.ResponseEntity;

public interface  ProductService {

    ResponseEntity<Product> createProduct(ProductRequest request);
}
