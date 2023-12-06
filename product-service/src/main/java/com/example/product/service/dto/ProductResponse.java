package com.example.product.service.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class ProductResponse {
    private Long id;
    private String names;
    private String description;
    private String price;
}
