package com.kodilla.testing;

public class TestingMain {

    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        int numberToFibonacci = 10;
        for (int i = 0; i < numberToFibonacci; i++) {

            System.out.print(fibo.fibonacci(i) + " ");
        }

        }

    }