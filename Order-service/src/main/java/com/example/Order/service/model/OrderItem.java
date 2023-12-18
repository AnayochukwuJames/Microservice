package com.example.Order.service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
//@Table(name = "Order_items")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "stock_keeping_code")
    private String skuCode;

    @Column(name = "item_price")
    private Double price;

    @Column(name = "item_quantity")
    private int quantity;

//    @JsonIgnore
//    @OneToMany(fetch = FetchType.EAGER)
//    private Set<Order> order;

}
