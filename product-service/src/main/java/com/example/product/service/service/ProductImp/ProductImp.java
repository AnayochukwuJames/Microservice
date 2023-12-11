package com.example.product.service.service.ProductImp;

import com.example.product.service.ProductMapper;
import com.example.product.service.dto.ProductRequest;
import com.example.product.service.dto.ProductResponse;
import com.example.product.service.dto.ProductUpdateResponse;
import com.example.product.service.model.Product;
import com.example.product.service.repository.ProductRepository;
import com.example.product.service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductImp implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public ResponseEntity<Product> createProduct(ProductRequest request) {
        if(productRepository.existsByName(request.getNames())){
            throw new RuntimeException("Product is already exist");
        }
        Product product = productRepository.save(ProductMapper.mapProductRequestToProduct(request));
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }
    @Override
    public ResponseEntity<ProductResponse> getProductById(Long id){
Product product = productRepository.findById(String.valueOf(id))
        .orElseThrow(() -> new RuntimeException("Product not found"));
return new ResponseEntity<>(ProductMapper.mapProductResponse(product),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ProductResponse> updateProduct(Long id, ProductUpdateResponse response){
        Product product = productRepository.findById(String.valueOf(id)).orElseThrow(()->
                new RuntimeException("Product not found"));
       productRepository.save(ProductMapper.mapProductUpdateRequestToProduct(product, response));
        return new ResponseEntity<>(ProductMapper.mapProductResponse(product), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ProductResponse> getProductByName(String name){
        Product product = productRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException("Product with this name is not exist"));
        return new ResponseEntity<>(ProductMapper.mapProductResponse(product),HttpStatus.OK);
    }
    @Override
    public ResponseEntity<String> deleteProduct(Long id){
        productRepository.deleteById(String.valueOf(id));
        return new  ResponseEntity<>("product deleted Successfully", HttpStatus.OK);
    }
    @Override
    public ResponseEntity<List<ProductResponse>> findAllProduct(){
        List<ProductResponse> product = productRepository.findAll().stream().map(ProductMapper::mapProductResponse)
                .collect(Collectors.toList());
        return new  ResponseEntity<> (product, HttpStatus.OK);
    }
}