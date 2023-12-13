package com.example.Order.service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Long customerId;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_item")
    private Set<OrderItem> orderItems;

    private double totalAmount;
    private String orderStatus;
    private Date orderDate;

}
