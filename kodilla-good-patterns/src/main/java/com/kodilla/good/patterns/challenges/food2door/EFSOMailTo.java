package com.kodilla.good.patterns.challenges.food2door;

public class EFSOMailTo implements Information {
    @Override
    public void inform(Supplier supplier) {
        System.out.println("Mail to :" + supplier.getSupplierName() + " has been sent!");
    }
}
