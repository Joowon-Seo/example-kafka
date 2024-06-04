package com.example.orderservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderservice.dto.OrderRequest;
import com.example.orderservice.service.OrderService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/orders/v1")
@Slf4j
public class OrderController {

	private final OrderService orderService;

	@PostMapping
	public ResponseEntity<String> createOrder(@RequestBody OrderRequest request) {
		log.info("OrderController");
		orderService.createOrder(request);
		return ResponseEntity.ok().build();
	}
}
