package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {
    private final List<Continent> worldList;

    public World(List<Continent> worldList) {
        this.worldList = worldList;
    }

    public BigDecimal getPeopleQuantity(){
        return worldList.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO,(sum,current) -> sum = sum.add(current));
    }
}
