package com.bermudez.services.cart.dto;

import java.util.Objects;

public class AddEntryRequest {
    private int quantity;

    private int productId;

    public AddEntryRequest(int quantity, int productId) {
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
        AddEntryRequest cartEntry = (AddEntryRequest) o;
        return productId == cartEntry.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
}
