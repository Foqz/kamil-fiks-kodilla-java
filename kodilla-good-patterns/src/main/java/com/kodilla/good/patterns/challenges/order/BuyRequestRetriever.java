package com.kodilla.good.patterns.challenges.order;

public class BuyRequestRetriever {
    public BuyRequest retrieve() {
        User user = new User("fixsioman");
        String item = "Gwoździe";
        return new BuyRequest(user,item);
    }

}
