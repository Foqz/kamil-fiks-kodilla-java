package com.kodilla.good.patterns.challenges.flight;

public class FlightAppRunner {
    public static void main(String[] args) {
        FlightToFilter flightToFilter = new FlightToFilter();
        flightToFilter.flightToFilter();

        FlightFromFilter flightFromFilter = new FlightFromFilter();
        flightFromFilter.flightFromFilter();

        FlightThroughFilter flightThroughFilter = new FlightThroughFilter();
        flightThroughFilter.flightThroughFilter();
    }
}
