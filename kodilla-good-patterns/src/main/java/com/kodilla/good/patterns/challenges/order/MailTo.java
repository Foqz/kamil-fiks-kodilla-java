package com.kodilla.good.patterns.challenges.order;

public class MailTo implements InformationService{

    @Override
    public void inform(User user) {
        System.out.println("Mail send to " + user.getUsername());
    }
}
