package com.example.orderservice.service;

import org.springframework.stereotype.Service;

import com.example.orderservice.domain.Order;
import com.example.orderservice.dto.OrderRequest;
import com.example.orderservice.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

	private final OrderRepository orderRepository;

	public void createOrder(OrderRequest request) {
		orderRepository.save(
				Order.of(request.productId(), request.quantity())
		);
	}
}
