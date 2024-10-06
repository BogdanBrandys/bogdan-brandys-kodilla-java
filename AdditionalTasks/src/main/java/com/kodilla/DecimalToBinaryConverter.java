package com.kodilla;

public class DecimalToBinaryConverter {
    public String getBinary(int num) {
        String binary = "";
        while (num > 0) {
            int remainder = num % 2;
            num = num / 2;
            binary = binary + remainder;
        }
        return binary;
    }
}
