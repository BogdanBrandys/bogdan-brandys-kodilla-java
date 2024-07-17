package com.kodilla.airline;

import java.util.ArrayList;

public class AirlineApp {
    public static void main(String[] args) {
       ArrayList<Flight> lines = Lines.getList();
        System.out.println("All Flights from Warszawa:");
        AllFlightsFrom.showDepartures(lines, "WARSZAWA");
        System.out.println("All Flights to Katowice:");
        AllFlightsTo.showArrivals(lines, "KATOWICE");
        System.out.println("Flights with change");
        FlightWithChange.showFlightsWithChange(lines, new Flight(Destination.LODZ, Destination.RZESZOW));
    }
}