package com.example.orderservice.messaging;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.example.orderservice.dto.OrderApprovalMessage;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class KafkaProducer {
	private final KafkaTemplate<String, Object> kafkaTemplate;

	public void create(final OrderApprovalMessage orderApprovalMessage) {
		kafkaTemplate.send("topic", orderApprovalMessage);
	}
}
