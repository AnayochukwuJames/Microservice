package com.example.product.service.service;

import com.example.product.service.dto.ProductRequest;
import com.example.product.service.dto.ProductResponse;
import com.example.product.service.dto.ProductUpdateResponse;
import com.example.product.service.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface  ProductService {

    ResponseEntity<Product> createProduct(ProductRequest request);

    ResponseEntity<ProductResponse> getProductById(Long id);

    ResponseEntity<ProductResponse> updateProduct(Long id, ProductUpdateResponse response);

    ResponseEntity<ProductResponse> getProductByName(String name);

    ResponseEntity<String> deleteProduct(Long id);

    ResponseEntity<List<ProductResponse>> findAllProduct();
}
