package com.kodilla.good.patterns.challenges.order;

public interface OrderRepository {
    void createOrder(User user, String item);
}
