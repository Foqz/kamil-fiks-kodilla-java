package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<ArrayList> worldList = new ArrayList<>();
    Continent continent = new Continent();
    Country country;
    public World(){
        worldList.add(continent.getEurope());
        worldList.add(continent.getAfrica());
        worldList.add(continent.getAsia());
//    }
//    public ArrayList world() {
//        resultList.add(continent.getEurope());
//        resultList.add(continent.getAsia());
//        resultList.add(continent.getAfrica());
//        return new ArrayList(resultList);
//    }
    public BigDecimal getPeopleQuantity(){
        return worldList.stream()
                .flatMap(
    }
//    public BigDecimal getPeopleQuantity(){
//        return resultList.stream()
//                .flatMap(continent -> continent.getEurope())
//                .filter()
}
