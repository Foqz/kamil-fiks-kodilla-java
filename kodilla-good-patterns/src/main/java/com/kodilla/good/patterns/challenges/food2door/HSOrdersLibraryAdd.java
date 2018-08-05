package com.kodilla.good.patterns.challenges.food2door;

public class HSOrdersLibraryAdd implements OrdersLibrary {
    @Override
    public void createOrder(Supplier supplier, String item, int amount) {
        System.out.println("Created order for " + item + ". Amount:" + amount + " Supplier: " +supplier.getSupplierName() );
    }
}
