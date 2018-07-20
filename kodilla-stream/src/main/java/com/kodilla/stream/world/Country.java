package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private  String peopleQuantity;

    public Country(String peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }
    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantityBD = new BigDecimal(peopleQuantity);
        return peopleQuantityBD;
    }
}
