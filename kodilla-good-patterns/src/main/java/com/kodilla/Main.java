package com.kodilla;

import com.kodilla.good.patterns.challenges.MovieStore;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies();
        movieStore.printMovies();
        System.out.println();
//second task
        System.out.println(movieStore.calculateFactorial(4));
    }
}