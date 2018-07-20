package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        List<Country> countries = new ArrayList<>();
        List<ArrayList> continents = new ArrayList<>();
        Country poland = new Country("2");
        Country deutchland = new Country("3");
        Country russia = new Country("2");
        Country gambia = new Country("1");

        countries.add(poland);
        countries.add(deutchland);
        countries.add(russia);
        countries.add(gambia);

        continents.add(countries);

        //When
        BigDecimal totalPeople = BigDecimal.ZERO;
        for(int n = 0; n <worldList.size(); n++) {
            totalPeople = totalPeople.add(world.getPeopleQuantity());
        }
        //Then
        BigDecimal expectedPeople = new BigDecimal("10");
        Assert.assertEquals(expectedPeople,totalPeople);

    }
}
