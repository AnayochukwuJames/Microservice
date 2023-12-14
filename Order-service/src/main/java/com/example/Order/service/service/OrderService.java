package com.example.Order.service.service;

import com.example.Order.service.dto.OrderRequest;

public interface OrderService {
    void placeOrder(OrderRequest request);
}
