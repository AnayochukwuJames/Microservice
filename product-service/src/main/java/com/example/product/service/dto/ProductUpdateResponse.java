package com.example.product.service.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductUpdateResponse {
    private String names;
    private String description;
    private String price;

}