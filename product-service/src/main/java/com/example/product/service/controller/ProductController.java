package com.example.product.service.controller;

import com.example.product.service.dto.ProductRequest;
import com.example.product.service.dto.ProductResponse;
import com.example.product.service.dto.ProductUpdateResponse;
import com.example.product.service.model.Product;
import com.example.product.service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    public final ProductService productService;
    @PostMapping("create")
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequest productRequest){
        return productService.createProduct(productRequest);
    }
    @GetMapping("get-product/{}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }
    @GetMapping("getProduct/name")
    public ResponseEntity<ProductResponse> getProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }
    @PutMapping("update-product/{}")
    public ResponseEntity<ProductResponse> updateProduct(@PathVariable Long id,
                                                         @RequestBody ProductUpdateResponse productUpdateResponse){
        return productService.updateProduct(id,productUpdateResponse);
    }
    @DeleteMapping("delete-product")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id){
        return productService.deleteProduct(id);
    }
    @GetMapping("get-all-product")
    public ResponseEntity<List<ProductResponse>> findAllProduct(){
        return productService.findAllProduct();
    }
}
