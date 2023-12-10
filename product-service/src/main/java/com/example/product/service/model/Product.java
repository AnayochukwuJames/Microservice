package com.example.product.service.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(value = "product")
public class Product {
    @Id
    private Long id;
    private String names;
    private String colour;
    private String description;
    private String price;
}
