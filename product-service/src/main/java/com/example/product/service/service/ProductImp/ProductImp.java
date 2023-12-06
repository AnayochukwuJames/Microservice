package com.example.product.service.service.ProductImp;

import com.example.product.service.ProductMapper;
import com.example.product.service.dto.ProductRequest;
import com.example.product.service.dto.ProductResponse;
import com.example.product.service.model.Product;
import com.example.product.service.repository.ProductRepository;
import com.example.product.service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductImp implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public ResponseEntity<Product> createProduct(ProductRequest request) {
        if(productRepository.existsByNames(request.getNames())){
            throw new RuntimeException("Product is already exist");
        }
        Product product = productRepository.save(ProductMapper.mapProductRequestToProduct(request));
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }
}