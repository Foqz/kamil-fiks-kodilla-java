package com.kodilla.good.patterns.challenges.food2door;

public class HSInformTo implements Information {
    @Override
    public void inform(Supplier supplier) {
        System.out.println("Information sent to: "+ supplier.getSupplierName());
    }
}
