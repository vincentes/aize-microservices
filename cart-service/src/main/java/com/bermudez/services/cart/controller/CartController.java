package com.bermudez.services.cart.controller;

import com.bermudez.services.cart.client.ProductClient;
import com.bermudez.services.cart.dto.AddEntryRequest;
import com.bermudez.services.cart.model.Cart;
import com.bermudez.services.cart.model.CartEntry;
import com.bermudez.services.cart.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bermudez.services.cart.repository.CartRepository;

@RestController
public class CartController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CartController.class);

	@Autowired
	CartRepository repository;

	@Autowired
	ProductClient productClient;
	
	@PostMapping("/add")
	public Cart add(@RequestBody AddEntryRequest entry) {
		Product product = productClient.getById(Integer.toUnsignedLong(entry.getProductId()));

		LOGGER.info("Cart Entry add: {}", entry);
		return repository.add(new CartEntry(entry.getQuantity(), product));
	}
	@GetMapping("/")
	public Cart get() {
		LOGGER.info("Cart get all");
		return repository.get();
	}
	@PostMapping("/clear")
	public Cart clear() {
		LOGGER.info("Cart clear");
		return repository.clear();
	}
	
}
