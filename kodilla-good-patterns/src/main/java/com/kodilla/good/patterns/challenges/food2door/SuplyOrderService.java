package com.kodilla.good.patterns.challenges.food2door;

public class SuplyOrderService {
    public static void main(String[] args) {
        HSOrderRequestRetriever hsOrderRequestRetriever = new HSOrderRequestRetriever();
        OrderRequest orderRequest1 = hsOrderRequestRetriever.retrieve();

        OrderProcessor orderProcessor1 = new OrderProcessor(new HSInformTo(), new HSOrdersLibraryAdd(), new HSItemOrderService());
        orderProcessor1.process(orderRequest1);

        EFSOrderRequestRetriever efsOrderRequestRetriever = new EFSOrderRequestRetriever();
        OrderRequest orderRequest2 = efsOrderRequestRetriever.retrieve();
        OrderProcessor orderProcessor2 = new OrderProcessor(new EFSOMailTo(), new EFSOrdersList(), new EFSFoodORderSevice());
        orderProcessor2.process(orderRequest2);

    }
}
