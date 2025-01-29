package com.tokioschool.spring.factura.models;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor	
public class Item {

	@Autowired
	private Product product;
	private BigDecimal stock;
	
	public BigDecimal getTotal() {
		return this.stock.multiply(this.product.getPrice());
	}
}
