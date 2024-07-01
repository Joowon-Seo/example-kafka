package com.example.orderservice.messaging;

import org.springframework.stereotype.Component;

import com.example.kafka.OrderApprovalModel;
import com.example.kafka.producer.service.KafkaProducer;
import com.example.orderservice.event.OrderCreatedEvent;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class OrderCreatedEventKafkaPublisher {

	private final KafkaProducer<String, OrderApprovalModel> kafkaProducer;

	public void publish(OrderCreatedEvent event) {
		kafkaProducer.send("order-topic",
				"key",
				new OrderApprovalModel(event.getOrderId(), event.getProductId(), event.getQuantity())
		);
	}
}
