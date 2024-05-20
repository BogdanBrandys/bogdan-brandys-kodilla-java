package com.kodilla.stream.world;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        List<Continent> continents = new ArrayList<>();
        //Europe
        List<Country> europeanCountries = new ArrayList<>();
        Country poland = new Country("Poland", new BigDecimal("37636508"));
        Country germany = new Country("Germany", new BigDecimal("84607016"));
        europeanCountries.add(poland);
        europeanCountries.add(germany);
        //North America
        List<Country> americanCountries = new ArrayList<>();
        Country usa = new Country("Usa", new BigDecimal("332403650"));
        Country canada = new Country("Canada", new BigDecimal("37943231"));
        americanCountries.add(usa);
        americanCountries.add(canada);
        //Africa
        List<Country> africanCountries = new ArrayList<>();
        Country egypt = new Country("Egypt", new BigDecimal("106437241"));
        Country congo = new Country("Congo", new BigDecimal("6142180"));
        africanCountries.add(egypt);
        africanCountries.add(congo);
        //creating continents
        continents.add(new Continent("Europe", europeanCountries));
        continents.add(new Continent("America", americanCountries));
        continents.add(new Continent("Africa", africanCountries));
        //creating world
        World world1 = new World(continents);
        //When
        BigDecimal totalPeople = world1.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("605169826");
        assertEquals(expectedPopulation, totalPeople);
    }
    }
