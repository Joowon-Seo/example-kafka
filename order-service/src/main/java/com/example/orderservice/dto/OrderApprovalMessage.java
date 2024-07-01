package com.example.orderservice.dto;

import lombok.Getter;

@Getter
public class OrderApprovalMessage {
	private Integer productId;
	private Integer quantity;

	public static OrderApprovalMessage of(
			final Integer productId,
			final Integer quantity
	) {
		OrderApprovalMessage orderApprovalMessage = new OrderApprovalMessage();
		orderApprovalMessage.productId = productId;
		orderApprovalMessage.quantity = quantity;
		return orderApprovalMessage;
	}
}
