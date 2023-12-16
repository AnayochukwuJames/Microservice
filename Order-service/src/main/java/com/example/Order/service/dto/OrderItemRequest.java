package com.example.Order.service.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class OrderItemDto {
    private String skuCode;
    private Double price;
    private int quantity;
}
