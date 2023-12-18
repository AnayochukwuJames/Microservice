package com.example.Order.service.service;

import com.example.Order.service.dto.OrderItemRequest;
import com.example.Order.service.dto.OrderRequest;
import org.springframework.http.ResponseEntity;

public interface OrderService {
    ResponseEntity<Boolean> createOrder(OrderItemRequest orderItemRequest);
//    ResponseEntity<Boolean> createOrder(OrderItemRequest orderItemRequest);
//    void placeOrder(OrderRequest request);
}
