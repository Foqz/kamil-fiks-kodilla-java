package com.kodilla.exception.test;

public class FlightApplicationRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("airport2","airport5");
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }finally {
            System.out.println("processing");
        }
    }
}
