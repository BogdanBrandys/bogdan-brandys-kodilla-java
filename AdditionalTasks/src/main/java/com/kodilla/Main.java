package com.kodilla;

public class Main {
    public static void main(String[] args) {
        DecimalToBinaryConverter decimalToBinaryConverter = new DecimalToBinaryConverter();
        String result = decimalToBinaryConverter.getBinary(5);
        System.out.println(result);
    }
}