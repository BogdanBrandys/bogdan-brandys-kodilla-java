package com.kodilla.testing;

public class Fibonacci {

    public int fibonacci(int n) {
        //Base case
        if(n <= 1) return n;
        //Recursive call
        return fibonacci(n-1) + fibonacci(n-2);

    }
}
