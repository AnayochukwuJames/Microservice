package com.example.product.service.repository;

import com.example.product.service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.*;
public interface ProductRepository extends MongoRepository<Product, String> {
    Optional<Product> findByName(String name);

    boolean existsByName(String names);

}
