package com.kodilla.testing;

import java.util.List;

public class TestingMain {

    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        int numberToFibonacci = 10;
        for (int i = 0; i < numberToFibonacci; i++) {

            System.out.print(fibo.fibonacci(i) + " ");
        }
        System.out.println();
        System.out.println("Task with Min and Max value");
        //MaxAndMin task
        List<Integer> list = List.of(3,1,5,6,7,9,15,3,4,7,10);
        MaxAndMin maxAndMin = new MaxAndMin();
        int result = maxAndMin.MaxAndMin(list, MaxOrMin.MIN);
        System.out.println(result);
        }

    }