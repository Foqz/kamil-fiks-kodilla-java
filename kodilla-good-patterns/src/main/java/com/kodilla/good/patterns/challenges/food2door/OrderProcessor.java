package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    private Information information;
    private OrdersLibrary ordersLibrary;
    private OrderService orderService;

    public OrderProcessor(final Information information, final  OrdersLibrary ordersLibrary, final OrderService orderService) {
        this.information = information;
        this.ordersLibrary = ordersLibrary;
        this.orderService = orderService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isInStock = orderService.order(orderRequest.getSuplier(),orderRequest.getItem(),orderRequest.getAmount());

        if (isInStock) {
            information.inform(orderRequest.getSuplier());
            ordersLibrary.createOrder(orderRequest.getSuplier(),orderRequest.getItem(),orderRequest.getAmount());
            return new OrderDto(orderRequest.getSuplier(),true);

        }else {
            return new OrderDto(orderRequest.getSuplier(),false);
        }
    }
}
