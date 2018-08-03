package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private BuyService buyService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final BuyService buyService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.buyService = buyService;
        this.orderRepository = orderRepository;
    }

    public BuyDto process(final BuyRequest buyRequest) {
        boolean isInStock = buyService.buy(buyRequest.getUser(), buyRequest.getItem());

        if (isInStock) {
            informationService.inform(buyRequest.getUser());
            orderRepository.createOrder(buyRequest.getUser(), buyRequest.getItem());
            return new BuyDto(buyRequest.getUser(), true);
        } else {
            return new BuyDto(buyRequest.getUser(), false);
        }
    }
}
