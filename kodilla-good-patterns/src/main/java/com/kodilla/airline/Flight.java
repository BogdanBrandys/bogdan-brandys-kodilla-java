package com.kodilla.airline;

import java.util.Objects;

public class Flight {
    private Destination from;
    private Destination to;

    public Flight(Destination from, Destination to) {
        this.from = from;
        this.to = to;
    }

    public Destination getTo() {
        return to;
    }

    public Destination getFrom() {
        return from;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return from == flight.from && to == flight.to;
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
