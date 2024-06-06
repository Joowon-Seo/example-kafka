package com.example.productservice.messaging;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.example.productservice.dto.OrderApprovalMessage;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaConsumer {

	@KafkaListener(topics = "topic", groupId = "group_1")
	public void listen(@Payload OrderApprovalMessage message) {
		log.info("Received order approval message: {}", message);
		log.info("Received data: ");
	}
}
