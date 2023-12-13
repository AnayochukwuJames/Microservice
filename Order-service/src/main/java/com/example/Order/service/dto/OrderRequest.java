package com.example.Order.service.dto;

import com.example.Order.service.model.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private Long customerId;
    private Set<OrderItem> orderItems;
    private double totalAmount;
    private String orderStatus;
    private Date orderDate;
    private Long orderItemId;
    private Long productId;
    private int quantity;
}
