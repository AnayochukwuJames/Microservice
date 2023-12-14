package com.example.Order.service.repository;

import com.example.Order.service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OderRepository extends JpaRepository<Order, Long> {
}
