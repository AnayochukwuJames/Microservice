package com.example.Order.service.repository;

import com.example.Order.service.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepo extends JpaRepository<OrderItem, Long> {


    boolean existsBySkuCodeAndPrice(String skuCode, Double price);

}
