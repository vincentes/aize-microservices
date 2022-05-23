package com.bermudez.services.cart.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<CartEntry> entries = new ArrayList<>();

	public Cart() {

	}

	public void clear() {
		entries.clear();
	}

	public void add(CartEntry element) {
		entries.add(element);
	}

	public void sum(CartEntry element) {
		for(CartEntry entry : entries) {
			if(entry.getProduct().equals(element.getProduct())) {
				entry.setQuantity(entry.getQuantity() + element.getQuantity());
			}
		}
	}

	public boolean contains(CartEntry entry) {
		return entries.contains(entry);
	}

	public List<CartEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<CartEntry> entries) {
		this.entries = entries;
	}
}
