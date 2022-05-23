package com.bermudez.services.product.controller;

import java.util.List;

import com.bermudez.services.product.model.Product;
import com.bermudez.services.product.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ProductController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	ProductRepository repository;

	
	@GetMapping("/")
	public List<Product> findAll() {
		LOGGER.info("Employee find");
		return repository.findAll();
	}


	@GetMapping("/query")
	public List<Product> query(@RequestParam String text) {
		LOGGER.info("Employee query");
		return repository.query(text);
	}
	
}
