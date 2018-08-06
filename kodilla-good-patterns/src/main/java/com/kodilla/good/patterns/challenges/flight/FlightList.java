package com.kodilla.good.patterns.challenges.flight;

import java.util.ArrayList;
import java.util.List;


public class FlightList {
    private final List<Flights> flightsList = new ArrayList<>();
    public FlightList() {
        flightsList.add(new Flights("airport1", "airport2"));
        flightsList.add(new Flights("airport1", "airport3"));
        flightsList.add(new Flights("airport3", "airport4"));
        flightsList.add(new Flights("airport2", "airport1"));
        flightsList.add(new Flights("airport2", "airport3"));
    }
    public List<Flights> getFlightsList() {
        return new ArrayList<>(flightsList);
    }
}
