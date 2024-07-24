package com.kodilla.rps;

public enum Gesture {
    ROCK,
    PAPER,
    SCISSORS;

    public static Gesture fromInt(int input) {
        Gesture gest = null;
        switch (input) {
            case 1:
                gest = ROCK;
                break;
            case 2:
                gest = PAPER;
                break;
            case 3:
                gest = SCISSORS;
                break;
        }
        return gest;
    }
}

