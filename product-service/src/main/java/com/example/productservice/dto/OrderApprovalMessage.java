package com.example.productservice.dto;

import lombok.Data;

@Data
public class OrderApprovalMessage {
	private Integer productId;
	private Integer quantity;
}
