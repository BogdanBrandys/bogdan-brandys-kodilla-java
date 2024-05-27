package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchEngine {

    Map<String, Boolean> airport = new HashMap<String, Boolean>();

    public void putAirport(String airport, boolean status) {
        this.airport.put(airport, status);
    }

    public String findFlight(Flight flight) {
        try {
            for (Map.Entry<String, Boolean> k : airport.entrySet()) {
                if (k.getKey() == flight.getArrivalAirport()) {
                    if (k.getValue()) {
                        return "There is a flight to: " + flight.getArrivalAirport();
                    } else {
                        return "There is no available flight.";
                    }
                }
            }
            throw new RouteNotFoundException("Exception: route not found!");
        }
            catch (RouteNotFoundException e) {
                System.out.println("Wrong destination! " + e.getMessage());
            }
        return "";
        }
        public static void main (String[]args){
            FlightSearchEngine flightSearchEngine = new FlightSearchEngine();
            //Airports
            flightSearchEngine.putAirport("Balice", true);
            flightSearchEngine.putAirport("Chicago", true);
            flightSearchEngine.putAirport("Dallas", true);
            flightSearchEngine.putAirport("New York", false);
            flightSearchEngine.putAirport("Paris", false);
            System.out.println(flightSearchEngine.airport.size());
            //when you ask for existing airport and flight is possible
            Flight flight1 = new Flight("Balice", "Chicago");
            System.out.println(flightSearchEngine.findFlight(flight1));
            //when you ask for existing airport but flight is impossible
            Flight flight2 = new Flight("New York", "Paris");
            System.out.println(flightSearchEngine.findFlight(flight2));
            //when you ask for not existing airport
            Flight flight3 = new Flight("Balice", "Montreal");
            System.out.println(flightSearchEngine.findFlight(flight3));
        }

}


