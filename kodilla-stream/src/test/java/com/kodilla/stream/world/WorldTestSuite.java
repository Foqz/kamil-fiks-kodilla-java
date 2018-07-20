package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        List<Country> countries_europe = new ArrayList<>();
        List<Country> countries_asia = new ArrayList<>();
        List<Country> countries_africa = new ArrayList<>();

        List<Continent> continents = new ArrayList<>();

        Country poland = new Country("5");
        Country deutchland = new Country("5");
        Country holland = new Country("5");
        Country russia = new Country("2");
        Country china = new Country("4");
        Country afghanistan = new Country("2");
        Country gambia = new Country("1");
        Country kongo = new Country("3");
        Country nigeria = new Country("11");

        countries_europe.add(poland);
        countries_europe.add(deutchland);
        countries_europe.add(holland);
        countries_asia.add(russia);
        countries_asia.add(china);
        countries_asia.add(afghanistan);
        countries_africa.add(gambia);
        countries_africa.add(kongo);
        countries_africa.add(nigeria);

        Continent europe = new Continent(countries_europe);
        Continent asia = new Continent(countries_asia);
        Continent africa = new Continent(countries_africa);

        continents.add(europe);
        continents.add(asia);
        continents.add(africa);

        World world = new World(continents);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then
        BigDecimal expectedPeople = new BigDecimal("38");
        Assert.assertEquals(expectedPeople,totalPeople);
    }
}
