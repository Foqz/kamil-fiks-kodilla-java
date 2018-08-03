package com.kodilla.good.patterns.challenges;

public class ItemBuyService implements BuyService {
    @Override
    public boolean buy(User user, String item) {
        System.out.println("Customer: " +user.getUsername() + " bought: " + item);
        return true;
    }
}
