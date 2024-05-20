package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {

    private String nameOfCountry;
    private BigDecimal population;

    public Country(String name, BigDecimal population) {
        this.nameOfCountry = name;
        this.population = population;
    }

    public BigDecimal getPeopleQuantity() {
        return this.population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(nameOfCountry, country.nameOfCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nameOfCountry);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + nameOfCountry + '\'' +
                ", population=" + population +
                '}';
    }
}
