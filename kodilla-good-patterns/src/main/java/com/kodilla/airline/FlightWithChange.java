package com.kodilla.airline;

import java.util.ArrayList;

public final class FlightWithChange {
    public static void showFlightsWithChange(ArrayList<Flight> destinations, Flight query) {
        ArrayList<Flight> firstFlight = new ArrayList<>();
        ArrayList<Flight> secondFlight = new ArrayList<>();
        for (int i = 0; i < destinations.size(); i++) {
            if (destinations.get(i).getFrom().toString().equals(query.getFrom().toString())) {
                firstFlight.add(destinations.get(i));
            }
        }
        for (int i = 0; i < firstFlight.size(); i++) {
            for (int j = 0; j < destinations.size(); j++) {
                if (destinations.get(j).getTo().toString().equals(firstFlight.get(i).getTo().toString())) {
                    System.out.println(firstFlight.get(i));
                    break;
                } else {
                    if (destinations.get(j).getFrom().toString().equals(firstFlight.get(i).getTo().toString())) {
                        secondFlight.add(destinations.get(j));
                    }
                }
            }
        }
        for (int i = 0; i < secondFlight.size(); i++) {
            if (secondFlight.get(i).getTo().toString().equals(query.getTo().toString())) {
                System.out.println(secondFlight.get(i));
            }
        }
    }
}

