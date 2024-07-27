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
                if ("x".equals(input) || "X".equals(input)|| "n".equals(input)|| "N".equals(input)) {
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
