package com.kodilla.good.patterns.challenges.order;

public class OrderRepossitoryAdd implements OrderRepository {
    @Override
    public void createOrder(User user, String item) {
        System.out.println("Adding " + item +" to order List. Customer : " + user.getUsername() );
    }
}
