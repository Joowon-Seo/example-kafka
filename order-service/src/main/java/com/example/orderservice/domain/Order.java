package com.example.orderservice.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "orders")
@Getter
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private Integer productId;

	@Column(nullable = false)
	private Integer quantity;

	public static Order of(Integer productId, Integer quantity) {
		Order order = new Order();
		order.productId = productId;
		order.quantity = quantity;
		return order;
	}
}
