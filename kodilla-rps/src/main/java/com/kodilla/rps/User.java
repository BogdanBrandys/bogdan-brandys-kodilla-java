package com.kodilla.rps;

import java.util.Random;

public class User {
    private String name;
    private int punctation;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPunctation() {
        return punctation;
    }

    public void setPunctation(int punctation) {
        this.punctation += punctation;
    }

    public int makeMove() {
        Random rand = new Random();
        return rand.nextInt(1,3);
    }
}
