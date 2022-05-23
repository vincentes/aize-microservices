package com.bermudez.services.product.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;

import com.bermudez.services.product.model.Product;

public class ProductRepository {

	private List<Product> products = new ArrayList<>();

	public Product add(Product Product) {
		products.add(Product);
		return Product;
	}

	public Product findById(Long id) {
		return products.stream().filter(product -> Objects.equals(product.getId(), id)).findFirst().orElse(null);
	}

	public List<Product> findAll() {
		return products;
	}

	public List<Product> query(String text) {
		return products.stream().filter(product -> product.getTitle().toLowerCase(Locale.ROOT).contains(text)).collect(Collectors.toList());
	}


}
