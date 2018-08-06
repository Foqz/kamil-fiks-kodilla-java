package com.kodilla.good.patterns.challenges.flight;

import java.util.ArrayList;

public class FlightToFilter {
    public void flightToFilter(){
        FlightList flightList = new FlightList();
        System.out.println("Showing routes to airport 1");
        flightList.getFlightsList().stream()
                .filter(flights -> flights.getArrAirport() == "airport1")
                .forEach(System.out::println);
    }
}
