package com.kodilla.airline;
import java.util.ArrayList;

public final class AllFlightsFrom {

    public static void showDepartures(ArrayList<Flight> destinations, String query) {
        destinations.stream()
                        .filter(entry -> entry.getFrom().toString().equals(query))
                        .forEach(System.out::println);
    }
}