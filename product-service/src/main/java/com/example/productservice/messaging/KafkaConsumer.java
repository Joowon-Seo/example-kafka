package com.example.productservice.messaging;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaConsumer {

	@KafkaListener(topics = "topic", groupId = "group_1")
	public void listen(Object data) {
		log.info("Received data: " + data);
	}
}
