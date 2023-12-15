package com.example.Order.service.serviceImp;

import com.example.Order.service.dto.OrderItemDto;
import com.example.Order.service.dto.OrderRequest;
import com.example.Order.service.model.Order;
import com.example.Order.service.model.OrderItem;
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
    public void placeOrder(OrderRequest request){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        request.getOrderItems()
                .stream()
                .map(orderItem -> mapOrderRequestToOrder(request));
        orderRepository.save(order);
    }

    public OrderItem mapToDto(OrderItemDto OrderItemDto){
        OrderItem orderItem = new OrderItem();
        orderItem.setQuantity(OrderItemDto.getQuantity());
        orderItem.setPrice(OrderItemDto.getPrice());
        orderItem.setSkuCode(OrderItemDto.getSkuCode());
        return orderItem;
    }
}
