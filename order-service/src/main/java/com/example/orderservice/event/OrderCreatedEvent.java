package com.example.orderservice.event;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class OrderCreatedEvent {

	private Long orderId;
	private Integer productId;
	private Integer quantity;

	public static OrderCreatedEvent of(Long orderId, Integer productId, Integer quantity) {
		OrderCreatedEvent orderCreatedEvent = new OrderCreatedEvent();
		orderCreatedEvent.orderId = orderId;
		orderCreatedEvent.productId = productId;
		orderCreatedEvent.quantity = quantity;
		return orderCreatedEvent;
	}
}
