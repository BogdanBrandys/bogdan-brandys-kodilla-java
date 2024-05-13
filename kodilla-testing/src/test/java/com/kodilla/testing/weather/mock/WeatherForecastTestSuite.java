package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    @BeforeEach
    public void before() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        double temp1 = 25.5;
        double temp2 = 26.2;
        double temp3 = 24.8;
        double temp4 = 25.2;
        double temp5 = 26.1;
        temperaturesMap.put("Rzeszow", temp1);
        temperaturesMap.put("Krakow", temp2);
        temperaturesMap.put("Wroclaw", temp3);
        temperaturesMap.put("Warszawa", temp4);
        temperaturesMap.put("Gdansk", temp5);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }
    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @Test
    void testCalculateAverageTemperature() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double expected = WeatherForecast.calculateAverageTemperature();
        double actual = 25.56;
        //Then
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testCalculateMedianTemperature() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double expected = WeatherForecast.calculateMedianTemperature();
        double actual = 25.5;
        //Then
        Assertions.assertEquals(expected, actual);
    }
}