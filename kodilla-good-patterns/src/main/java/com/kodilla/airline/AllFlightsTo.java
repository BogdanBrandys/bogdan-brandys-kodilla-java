package com.kodilla.airline;

import java.util.ArrayList;

public final class AllFlightsTo {
    public static void showArrivals(ArrayList<Flight> destinations, String query) {
        destinations.stream()
                .filter(entry -> entry.getTo().toString().equals(query))
                .forEach(System.out::println);
    }
}
