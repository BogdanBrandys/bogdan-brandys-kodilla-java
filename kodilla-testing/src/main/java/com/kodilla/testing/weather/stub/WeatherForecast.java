package com.kodilla.testing.weather.stub;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class WeatherForecast {
    private static Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public static double calculateAverageTemperature() {
        double average = 0;
        double iter = 0;
        for (Map.Entry<String, Double> temperature2 :
                temperatures.getTemperatures().entrySet()) {
            iter++;
            average += temperature2.getValue();
        }
        return average / iter;
    }
    
    public static double calculateMedianTemperature() {
        double median;
        int length;
        ArrayList<Double> listOfTemperatures = new ArrayList<Double>();
        for (Map.Entry<String, Double> temperature3 :
                temperatures.getTemperatures().entrySet()) {
            listOfTemperatures.add(temperature3.getValue());

        }
        Collections.sort(listOfTemperatures);
        length = listOfTemperatures.size();
        if (length % 2 == 0) {
            median = ((listOfTemperatures.get(length / 2) + listOfTemperatures.get(length / 2 - 1)) / 2);
        }
        else{
            median = listOfTemperatures.get(length / 2);
        }
        return median;
    }
}