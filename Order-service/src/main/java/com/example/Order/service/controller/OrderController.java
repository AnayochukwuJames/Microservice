package com.example.Order.service.controller;

import com.example.Order.service.dto.OrderItemRequest;
import com.example.Order.service.dto.OrderRequest;
import com.example.Order.service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/order")
@RequiredArgsConstructor
public class OrderController {


    public final OrderService orderService;

    @PostMapping("place-order")
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        return "Order placed successfully";
    }
    @PostMapping("create")
    public ResponseEntity<Boolean> createOrder(@RequestBody OrderItemRequest orderItemRequest){
        return orderService.createOrder(orderItemRequest);
    }
}
