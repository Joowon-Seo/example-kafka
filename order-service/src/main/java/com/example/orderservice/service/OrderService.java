package com.example.orderservice.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.kafka.producer.service.KafkaProducer;
import com.example.orderservice.domain.Order;
import com.example.orderservice.dto.OrderApprovalMessage;
import com.example.orderservice.dto.OrderRequest;
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
		List<OrderApprovalMessage> list = new LinkedList<>();
		list.add(OrderApprovalMessage.of(request.productId(), request.quantity()));
		list.add(OrderApprovalMessage.of(request.productId(), request.quantity()));
		list.add(OrderApprovalMessage.of(request.productId(), request.quantity()));
		// kafkaProducer.send(list);
	}
}
