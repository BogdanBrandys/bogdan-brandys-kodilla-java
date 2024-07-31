package com.kodilla.hibernate;

import java.util.List;

public class MaxMinApp {
    public static void main(String[] args) {
        List<Integer> testList = List.of(3,1,1,5,6,7,9,15,3,4,7,10);
        SecondMax second  = new SecondMax();
        int result = second.findSecondMax(testList);
        System.out.println(result);
        int result2 = second.findSecondMin(testList);
        System.out.println(result2);
    }
}
