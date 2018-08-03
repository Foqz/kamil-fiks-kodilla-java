package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {
        BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();
        BuyRequest buyRequest = buyRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailTo(),new ItemBuyService(),new OrderRepossitoryAdd());
        orderProcessor.process(buyRequest);
    }
}
