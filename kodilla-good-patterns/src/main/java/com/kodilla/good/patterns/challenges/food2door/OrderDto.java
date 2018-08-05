package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {
    public Supplier supplier;
    public boolean isInStock;

    public OrderDto(Supplier supplier, boolean isInStock) {
        this.supplier = supplier;
        this.isInStock = isInStock;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isInStock() {
        return isInStock;
    }
}
