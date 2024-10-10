package com.kodilla;

public class Main {
    public static void main(String[] args) {
        DecimalToHexadecimalConverter decimalToHexa = new DecimalToHexadecimalConverter();
        String result = decimalToHexa.getHexadecimal(20);
        System.out.println(result);
    }
}