package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public final class Continent {
    private final List<Country> countries;

    public Continent(List<Country> countries) {
        this.countries = countries;
    }

    public List<BigDecimal> getCountries() {
        return countries.stream()
                .map(country -> country.getPeopleQuantity())
                .collect(Collectors.toList());
    }
}

//    private final ArrayList<Country> europe = new ArrayList<>();
//    private final ArrayList<Country> asia = new ArrayList<>();
//    private final ArrayList<Country> africa = new ArrayList<>();

//    public Continent()
//    {
//        europe.add(new Country("Poland", "111144442222"));
//        europe.add(new Country("Deutchland", "123456789"));
//        europe.add(new Country("Holland", "98765432111"));
//        asia.add(new Country("Russia","999955556666"));
//        asia.add(new Country("China","11114444555566"));
//        asia.add(new Country("Afganistan","9876515166"));
//        africa.add(new Country("Gambia","749879679"));
//        africa.add(new Country("Ghana","6456456456"));
//        africa.add(new Country("Kongo","45675899677"));
//    }
//
//    public ArrayList<Country> getEurope() {
//        return europe;
//    }
//
//    public ArrayList<Country> getAsia() {
//        return asia;
//    }
//
//    public ArrayList<Country> getAfrica() {
//        return africa;
//    }
//}
