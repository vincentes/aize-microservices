package com.bermudez.services.cart.model;

import java.util.Objects;

public class CartEntry {
    private int quantity;

    private Product product;

    public CartEntry(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartEntry cartEntry = (CartEntry) o;
        return product.equals(cartEntry.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }
}
