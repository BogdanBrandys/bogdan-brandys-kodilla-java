package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EndGameOrRestart {
    public static String getExitOrRestart(){
        System.out.println("If you want to exit game press x, if you want to restart game press n");
        Scanner sc = new Scanner(System.in);
        String input;
        do{
            try {
                input = sc.nextLine();
                if (input.equals("x") || input.equals("X")|| input.equals("n")|| input.equals("N")) {
                    break;
                } else {
                    System.out.println("Please enter a valid option");
                }
            } catch (final InputMismatchException e) {
                System.out.println("You have entered an invalid input. Try again.");
                sc.next();
            }
        } while(true);
        return input;
    }
}
