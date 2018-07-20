package com.kodilla.stream.world;

import java.util.List;

public final class Continent {
    private final List<Country> countries;

    public Continent(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> getCountries() {
        return countries;
    }
}