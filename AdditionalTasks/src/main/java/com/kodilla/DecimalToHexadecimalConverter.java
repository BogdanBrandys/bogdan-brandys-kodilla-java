package com.kodilla;

public class DecimalToHexadecimalConverter {
    public String getHexadecimal(int number) {
        if (number == 0) {
            return "0";
        }
        StringBuilder hexadecimal = new StringBuilder();
        while (number > 0) {
            int remainder = number % 16;
            if (remainder == 10) {
                hexadecimal.append("A");
            } else if (remainder == 11) {
                hexadecimal.append("B");
            } else if (remainder == 12) {
                hexadecimal.append("C");
            } else if (remainder == 13) {
                hexadecimal.append("D");
            } else if (remainder == 14) {
                hexadecimal.append("E");
            } else if (remainder == 15) {
                hexadecimal.append("F");
            } else {
                hexadecimal.append(remainder);
            }
            number = number / 16;
        }
        return hexadecimal.reverse().toString();
    }
}
