package com.example.productservice.messaging;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.example.kafka.OrderApprovalModel;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaConsumer {

	@KafkaListener(id = "${kafka-consumer-config.order-group-id}", topics = "order-topic")
	public void listen(@Payload OrderApprovalModel message) {
		log.info(message.getOrderId() + "");
		log.info(message.getProductId() + "");
		log.info(message.getQuantity() + "");
		log.info("Received data: ");
	}
}
