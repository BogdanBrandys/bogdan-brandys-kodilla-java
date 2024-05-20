package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Continent {

    private String nameOfContinent;
    List<Country> countries = new ArrayList<>();

    public Continent(String nameOfContinent, List<Country> countries) {
        this.nameOfContinent = nameOfContinent;
        this.countries = countries;
    }
    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(nameOfContinent, continent.nameOfContinent);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nameOfContinent);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "nameOfContinent='" + nameOfContinent + '\'' +
                '}';
    }
}
