package com.example.orderservice.dto;

public record OrderRequest(
		Integer productId,
		Integer quantity
) {
}
