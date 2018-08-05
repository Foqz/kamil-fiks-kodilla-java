package com.kodilla.good.patterns.challenges.food2door;

public class HSItemOrderService implements OrderService {
    @Override
    public boolean order(Supplier supplier, String item, int amount) {
        System.out.println("Your order : " + item + ". Amount: " + amount);
        return true;
    }
}
