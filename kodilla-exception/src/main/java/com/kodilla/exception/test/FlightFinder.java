package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("airport1", true);
        flightMap.put("airport2", false);
        flightMap.put("airport3", true);
        flightMap.put("airport4", true);

        if (flightMap.containsKey(flight.getDepartureAirport()) && flightMap.containsKey(flight.getArrivalAirport())) {
            boolean val1 = flightMap.get(flight.getDepartureAirport());
            boolean val2 = flightMap.get(flight.getArrivalAirport());
            System.out.println(val1 && val2);
            return val1 && val2;
        } else {
            throw new RouteNotFoundException("Route not found");
        }
    }
}
