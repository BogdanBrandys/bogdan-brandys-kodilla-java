package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberOfRounds {
    public int getNumberOfRounds(){
        System.out.println("Enter number of rounds: ");
        System.out.println("The max value is 5");
        Scanner sc = new Scanner(System.in);
        int number;
        do{
            try {
                number = sc.nextInt();
                if (number >= 1 && number <= 5) {
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and 5");
                    continue;
                }
            } catch (final InputMismatchException e) {
                System.out.println("You have entered an invalid input. Try again.");
                sc.next();
                continue;
            }
        } while(true);
        return number;
    }
}
