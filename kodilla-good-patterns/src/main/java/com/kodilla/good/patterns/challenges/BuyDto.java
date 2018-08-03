package com.kodilla.good.patterns.challenges;

public class BuyDto {
    public User user;
    public boolean isInStock;

    public BuyDto(User user, boolean isInStock) {
        this.user = user;
        this.isInStock = isInStock;
    }

    public User getUser() {
        return user;
    }

    public boolean isInStock() {
        return isInStock;
    }
}
