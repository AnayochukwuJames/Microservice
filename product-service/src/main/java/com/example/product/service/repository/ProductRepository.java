package com.example.product.service.repository;

import com.example.product.service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
    boolean existsByNameAndColour(String names);


    <T> ScopedValue<T> findByName(String name);

}
