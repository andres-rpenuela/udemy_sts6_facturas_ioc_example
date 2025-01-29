package com.tokioschool.spring.factura.models;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
@Component
public class Product {

	private String name;
	private BigDecimal price;
}
