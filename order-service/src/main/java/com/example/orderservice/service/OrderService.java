package com.example.orderservice.service;

import org.springframework.stereotype.Service;

import com.example.orderservice.domain.Order;
import com.example.orderservice.dto.OrderRequest;
import com.example.orderservice.event.OrderCreatedEvent;
import com.example.orderservice.messaging.OrderCreatedEventKafkaPublisher;
import com.example.orderservice.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

	private final OrderRepository orderRepository;
	private final OrderCreatedEventKafkaPublisher orderCreatedEventKafkaPublisher;

	public void createOrder(OrderRequest request) {
		Order order = Order.of(request.productId(), request.quantity());
		orderRepository.save(order);
		orderCreatedEventKafkaPublisher.publish(
				OrderCreatedEvent.of(order.getId(), order.getProductId(), order.getQuantity())
		);

	}
}
