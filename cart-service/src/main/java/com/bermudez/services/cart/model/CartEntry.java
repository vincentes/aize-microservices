package com.bermudez.services.cart.model;

import java.util.Objects;

// TODO: DTO and actual model should be separate.
public class CartEntry {
    private int quantity;

    // TODO: Should have a Product member instead of product id.
    private int productId;

    public CartEntry(int quantity, int productId) {
        this.quantity = quantity;
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartEntry cartEntry = (CartEntry) o;
        return productId == cartEntry.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
}
