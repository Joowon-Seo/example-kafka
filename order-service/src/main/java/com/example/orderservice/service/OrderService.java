package com.example.orderservice.service;

import org.springframework.stereotype.Service;

import com.example.orderservice.domain.Order;
import com.example.orderservice.dto.OrderApprovalMessage;
import com.example.orderservice.dto.OrderRequest;
import com.example.orderservice.messaging.KafkaProducer;
import com.example.orderservice.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

	private final OrderRepository orderRepository;
	private final KafkaProducer kafkaProducer;

	public void createOrder(OrderRequest request) {
		orderRepository.save(
				Order.of(request.productId(), request.quantity())
		);
		kafkaProducer.create(
				OrderApprovalMessage.of(request.productId(), request.quantity())
		);
	}
}
