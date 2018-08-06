package com.kodilla.good.patterns.challenges.flight;

public class FlightAppRunner {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        System.out.println(flightFinder.flightFromFilter("airport1"));
        System.out.println(flightFinder.flightToFilter("airport2"));
        System.out.println(flightFinder.flightThroughFilter("airport1","airport2","airport3"));
    }
}
