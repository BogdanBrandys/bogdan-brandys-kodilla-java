package com.kodilla.testing;

public enum MaxOrMin {
    MAX("MAX"),
    MIN("MIN");

    public final String val;

    private MaxOrMin(String val) {
        this.val = val;
    }
}