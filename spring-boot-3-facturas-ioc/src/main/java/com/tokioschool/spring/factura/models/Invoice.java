package com.tokioschool.spring.factura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor @AllArgsConstructor	
@Component
public class Invoice {
	
	@Autowired
	private Client client;
	
	@Value("${invoice.description}")
	private String description;
	
	@Autowired
	//@Qualifier("items")
	private List<Item> items;

}
