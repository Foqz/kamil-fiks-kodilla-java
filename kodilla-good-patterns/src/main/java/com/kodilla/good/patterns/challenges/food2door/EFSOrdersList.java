package com.kodilla.good.patterns.challenges.food2door;

public class EFSOrdersList implements OrdersLibrary {
    @Override
    public void createOrder(Supplier supplier, String item, int amount) {
        System.out.println("Thanks for your Order ! " + item + " amount: " + amount + ". Cheers from " + supplier.getSupplierName() + " team ! :)");
    }
}
