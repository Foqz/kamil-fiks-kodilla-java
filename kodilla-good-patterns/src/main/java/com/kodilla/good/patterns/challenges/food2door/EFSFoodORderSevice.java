package com.kodilla.good.patterns.challenges.food2door;

public class EFSFoodORderSevice implements OrderService {
    @Override
    public boolean order(Supplier supplier, String item, int amount) {
        System.out.println(item + " , amount " + amount + " confirmed");
        return true;
    }
}
