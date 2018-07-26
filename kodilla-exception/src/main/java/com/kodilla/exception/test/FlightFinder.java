package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight (Flight flight) throws RouteNotFoundException {
        HashMap<String,Boolean> flightMap = new HashMap<>();
        flightMap.put("airport1",true);
        flightMap.put("airport2",false);
        flightMap.put("airport3",true);
        flightMap.put("airport4",true);

        for(Map.Entry<String,Boolean> entry : flightMap.entrySet()){
            if((entry.getValue() == true) && (flight.getDepartureAirport().equals(entry.getKey()))) {
                System.out.println("Flight from " + entry.getKey() +" is avaliable ");
            } else if (entry.getValue() == true && flight.getArrivalAirport().equals(entry.getKey())) {
                System.out.println("Flight to " + entry.getKey() +" is avaliable ");
            } else {
                throw new RouteNotFoundException("Route not found!");
            }
        }
    }
}
