package com.kodilla.good.patterns.challenges.flight;

public class FlightFromFilter {
    public void flightFromFilter(){
        FlightList flightList = new FlightList();
        System.out.println("Showing routes from airport 1");
        flightList.getFlightsList().stream()
                .filter(flights -> flights.getDepAirport()=="airport1")
                .forEach(System.out::println);
    }
}
