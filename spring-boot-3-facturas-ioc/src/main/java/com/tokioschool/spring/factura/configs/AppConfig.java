package com.tokioschool.spring.factura.configs;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.tokioschool.spring.factura.models.Item;
import com.tokioschool.spring.factura.models.Product;

@Configuration
@PropertySource(value="classpath:data.properties",encoding = "UTF-8")
public class AppConfig {

	@Bean
	@Qualifier("items")
	public List<Item> itemsInvoice(){
		Product p1 = new Product("Camere Sony", new BigDecimal(1599.99));
		Product p2 = new Product("Sky", new BigDecimal(99.99));
		Product p3 = new Product("Bag", new BigDecimal(0.10));
		
		return Arrays.asList(
				new Item(p1, new BigDecimal(1)),
				new Item(p2, new BigDecimal(2)),
				new Item(p3, new BigDecimal(4))
				);
	}
}
