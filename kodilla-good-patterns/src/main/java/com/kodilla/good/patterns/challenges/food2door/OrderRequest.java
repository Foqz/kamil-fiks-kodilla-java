package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {
    private Supplier supplier;
    private String item;
    private int amount;

    public OrderRequest(Supplier supplier, String item, int amount) {
        this.supplier = supplier;
        this.item = item;
        this.amount = amount;
    }

    public Supplier getSuplier() {
        return supplier;
    }

    public String getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }
}
