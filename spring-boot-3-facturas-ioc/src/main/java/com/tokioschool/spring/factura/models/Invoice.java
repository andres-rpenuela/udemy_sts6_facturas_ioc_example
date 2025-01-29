package com.tokioschool.spring.factura.models;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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
	@Qualifier("itemsOficce")
	private List<Item> items;
	
	@PostConstruct
	public void init() {
		this.client.setName(this.client.getName().toUpperCase());
		this.client.setLastname(this.client.getLastname().toUpperCase());
		this.description = this.description.concat(" del cliente %s %s".formatted(this.client.getName(),this.client.getLastname()));
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("Destruyendo el componete Invoice, liberar recursos");
	}
	
	public BigDecimal getTotal() {
		return items.stream().map(Item::getTotal).reduce(new BigDecimal(0),BigDecimal::add);
	}
}
