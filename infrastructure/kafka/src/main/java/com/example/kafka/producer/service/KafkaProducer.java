package com.example.kafka.producer.service;

import java.io.Serializable;

import org.apache.avro.specific.SpecificRecordBase;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer<K extends Serializable, V extends SpecificRecordBase> {

	private final KafkaTemplate<K, V> kafkaTemplate;

	public void send(String topicName, K key, V message) {
		log.info("Sending message={} to topic={}", message, topicName);
		kafkaTemplate.send(topicName, key, message);
		log.info("finish message={} to topic={}", message, topicName);
	}

	@PreDestroy
	public void close() {
		if (kafkaTemplate != null) {
			log.info("Closing kafka producer!");
			kafkaTemplate.destroy();
		}
	}
}
