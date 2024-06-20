package com.kodilla.good.patterns.challenges;

import java.util.*;

public class MovieStore {

    Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();

    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    public void printMovies() {
        Set<Map.Entry<String, List<String>>> entry = booksTitlesWithTranslations.entrySet();
        entry.stream().flatMap(e -> e.getValue().stream()).forEach(s -> System.out.print(s + "! "));
    }
    //additional task
    public int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i < n; i++) {
            factorial += factorial * i;
        }
        return factorial;
    }
}