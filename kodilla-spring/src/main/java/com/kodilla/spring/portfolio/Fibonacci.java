package com.kodilla.spring.portfolio;

public class Fibonacci {
    public int calcFibonacci(int num){
        int previousValue = 0;
        int nextValue = 1;
        int result = 0;
        for(int i = 0; i < num; i++){
            result = previousValue + nextValue;
            previousValue = nextValue;
            nextValue = result;
        }
        return result;
    }
}
