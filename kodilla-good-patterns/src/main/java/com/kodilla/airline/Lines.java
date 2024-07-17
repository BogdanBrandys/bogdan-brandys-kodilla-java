package com.kodilla.airline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lines {
    public static ArrayList<Flight> getList() {
        final ArrayList<Flight> listOfLines = new ArrayList<>();

        Flight line1 = new Flight(Destination.KRAKOW, Destination.RZESZOW);
        Flight line2 = new Flight(Destination.KRAKOW, Destination.KATOWICE);
        Flight line3 = new Flight(Destination.WARSZAWA, Destination.LODZ);
        Flight line4 = new Flight(Destination.WARSZAWA, Destination.RZESZOW);
        Flight line5 = new Flight(Destination.LODZ, Destination.WARSZAWA);
        Flight line6 = new Flight(Destination.KATOWICE, Destination.LODZ);
        Flight line7 = new Flight(Destination.GDANSK, Destination.WARSZAWA);
        Flight line8 = new Flight(Destination.POZNAN, Destination.KRAKOW);
        Flight line9 = new Flight(Destination.RZESZOW, Destination.GDANSK);
        Flight line10 = new Flight(Destination.RZESZOW, Destination.KRAKOW);

        listOfLines.add(line1);
        listOfLines.add(line2);
        listOfLines.add(line3);
        listOfLines.add(line4);
        listOfLines.add(line5);
        listOfLines.add(line6);
        listOfLines.add(line7);
        listOfLines.add(line8);
        listOfLines.add(line9);
        listOfLines.add(line10);

        return new ArrayList<>(listOfLines);
    }
}
