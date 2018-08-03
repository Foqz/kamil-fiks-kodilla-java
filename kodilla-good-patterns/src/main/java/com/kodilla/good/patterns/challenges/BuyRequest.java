package com.kodilla.good.patterns.challenges;

public class BuyRequest {
    private User user;
    private String item;

    public BuyRequest(User user, String item) {
        this.user = user;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public String getItem() {
        return item;
    }
}
