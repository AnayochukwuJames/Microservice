package com.example.Order.service.serviceImp;

import com.example.Order.service.dto.OrderRequest;
import com.example.Order.service.model.Order;
import com.example.Order.service.repository.OrderRepository;
import com.example.Order.service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.example.Order.service.OrderMapper.*;

@Service
@RequiredArgsConstructor
public class OrderImp implements OrderService {
    public final OrderRepository orderRepository;
    @Override
    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        orderRequest.getOrderItems().stream()
                .map(orderItem -> mapOrderRequestToOrder(orderRequest));

    }
}
