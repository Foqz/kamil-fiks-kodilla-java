package com.kodilla.good.patterns.challenges.food2door;

public class EFSOrderRequestRetriever {
    public OrderRequest retrieve() {
        Supplier supplier = new Supplier("ExtraFoodShop");
        String item = "Kotlety";
        int amount = 5;
        return new OrderRequest(supplier,item,amount);
    }
}
