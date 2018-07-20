package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private static String peopleQuantity;

    public Country(final String peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }
    public static BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantityBD = new BigDecimal(peopleQuantity);
        return peopleQuantityBD;
    }
}
