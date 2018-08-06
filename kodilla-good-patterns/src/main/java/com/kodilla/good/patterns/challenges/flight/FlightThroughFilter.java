package com.kodilla.good.patterns.challenges.flight;

public class FlightThroughFilter {
    public void flightThroughFilter(){
        FlightList flightList = new FlightList();
        System.out.println("Showing routes from airport 1 through airport 2 to airport 3");
        flightList.getFlightsList().stream()
                .filter(flights -> flights.getDepAirport()=="airport1")
                .filter(flights -> flights.getArrAirport()=="airport2")
                .forEach(System.out::println);

        flightList.getFlightsList().stream()
                .filter(flights -> flights.getDepAirport()=="airport2")
                .filter(flights -> flights.getArrAirport()=="airport3")
                .forEach(System.out::println);
    }
}
