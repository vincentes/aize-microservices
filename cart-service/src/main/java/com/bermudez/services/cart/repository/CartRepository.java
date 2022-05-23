package com.bermudez.services.cart.repository;

import com.bermudez.services.cart.model.Cart;
import com.bermudez.services.cart.model.CartEntry;

public class CartRepository {

	private Cart cart = new Cart();

	public Cart add(CartEntry entry) {
		if(cart.contains(entry)) {
			cart.sum(entry);
		} else {
			cart.add(entry);
		}
		return cart;
	}
	
	public Cart get() {
		return cart;
	}

	public Cart clear() {
		cart.clear();
		return cart;
	}
	

}
