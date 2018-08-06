package com.kodilla.good.patterns.challenges.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    public List flightThroughFilter(String depAirport,String throughAirport, String arrAirport){
        FlightList flightList = new FlightList();
        System.out.println("Showing routes from " +depAirport + " through " + throughAirport + " to " +arrAirport);
        List list1 = flightList.getFlightsList().stream()
                .filter(flights -> flights.getDepAirport().equals(depAirport))
                .filter(flights -> flights.getArrAirport().equals(throughAirport))
                .collect(Collectors.toList());

        List list2 = flightList.getFlightsList().stream()
                .filter(flights -> flights.getDepAirport().equals(throughAirport))
                .filter(flights -> flights.getArrAirport().equals(arrAirport))
                .collect(Collectors.toList());
        List finalList = new ArrayList();
        finalList.add(list1);
        finalList.add(list2);
        return finalList;
    }
    public List flightToFilter(String arrAirport){
        FlightList flightList = new FlightList();
        System.out.println("Showing routes to: " + arrAirport);
        return flightList.getFlightsList().stream()
                .filter(flights -> flights.getArrAirport().equals(arrAirport))
                .collect(Collectors.toList());
    }

    public List flightFromFilter(String depAirport){
        FlightList flightList = new FlightList();
        System.out.println("Showing routes from " + depAirport);
        return flightList.getFlightsList().stream()
                .filter(flights -> flights.getDepAirport().equals(depAirport))
                .collect(Collectors.toList());
    }
}
