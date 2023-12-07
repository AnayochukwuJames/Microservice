package com.example.product.service.controller;

import com.example.product.service.dto.ProductRequest;
import com.example.product.service.dto.ProductResponse;
import com.example.product.service.model.Product;
import com.example.product.service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    public final ProductService productService;
    @PostMapping("create")
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequest request){
        return productService.createProduct(request);
    }
    @GetMapping("get-product/{}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }
}
