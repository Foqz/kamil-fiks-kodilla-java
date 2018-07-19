package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final String countryName;
    private final String peopleQuantity;

    public Country(final String countryName, final String peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantityBD = new BigDecimal(peopleQuantity);
        return peopleQuantityBD;
    }
}
