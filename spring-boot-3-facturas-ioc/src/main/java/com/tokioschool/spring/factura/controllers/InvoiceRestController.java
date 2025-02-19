package com.tokioschool.spring.factura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tokioschool.spring.factura.models.Invoice;

@RestController
@RequestMapping("/invoices")
public class InvoiceRestController {

	@Autowired
	private Invoice invoice;
	
	@GetMapping("/show")
	public Invoice show() {
		return invoice;
	}
}
