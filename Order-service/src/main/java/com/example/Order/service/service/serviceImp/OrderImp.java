package com.example.Order.service.service.serviceImp;

import com.example.Order.service.dto.OrderItemRequest;
import com.example.Order.service.model.OrderItem;
import com.example.Order.service.repository.OrderItemRepo;
import com.example.Order.service.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderImp implements OrderService {
    private final OrderItemRepo orderItemRepo;

    @Override
    public ResponseEntity<Boolean> createOrder(OrderItemRequest orderItemRequest){

        OrderItem newOrder = new OrderItem();
        newOrder.setPrice(orderItemRequest.getPrice());
        newOrder.setQuantity(orderItemRequest.getQuantity());
        newOrder.setSkuCode(orderItemRequest.getSkuCode());

              orderItemRepo.save(newOrder);
        return new ResponseEntity<>( HttpStatus.CREATED);
    }
    public OrderItem mapToDto(OrderItemRequest OrderItemDto){
        OrderItem orderItem = new OrderItem();
        orderItem.setQuantity(OrderItemDto.getQuantity());
        orderItem.setPrice(OrderItemDto.getPrice());
        orderItem.setSkuCode(OrderItemDto.getSkuCode());
        return orderItem;
    }
}
