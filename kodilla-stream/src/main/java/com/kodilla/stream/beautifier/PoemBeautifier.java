package com.kodilla.stream.beautifier;

import java.util.Arrays;

public class PoemBeautifier{

    public String beautify(String text, PoemDecorator decorator){
        String result = decorator.beautify(text);
        return result;
    }

    public static String addStars(String txt) {
    return "*** " + txt + "***";
    }
    public static String replaceSpaces(String txt) {
        return txt.replace(" ", "-");
    }
    public static String changeFont(String txt) {
        return Arrays.toString(txt.toCharArray());
    }
}
