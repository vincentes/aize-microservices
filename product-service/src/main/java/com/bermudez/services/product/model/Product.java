package com.bermudez.services.product.model;

public class Product {

	protected static Long nextId = 0l;

	private Long id;
	private String title;
	private String description;
	private Double price;

	public Product(String title, String description, Double price) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.id = getNextId();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	// Not thread-safe. Race condition.
	protected static Long getNextId() {
		return nextId++;
	}

}
