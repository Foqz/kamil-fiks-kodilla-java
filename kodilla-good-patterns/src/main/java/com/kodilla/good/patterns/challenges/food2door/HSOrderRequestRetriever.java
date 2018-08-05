package com.kodilla.good.patterns.challenges.food2door;

public class HSOrderRequestRetriever {
    public OrderRequest retrieve() {
        Supplier supplier = new Supplier("HealthyShop");
        String item = "Hamburgery";
        int amount = 10;
        return new OrderRequest(supplier,item,amount);
    }
}
