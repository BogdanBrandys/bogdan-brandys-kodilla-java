package com.kodilla.rps;

import java.util.Scanner;

public class CloseGame {
    public static boolean doYouWantToCloseTheGame(){
        System.out.println("Do You really want to end this game (y/n)?");
        Scanner sc = new Scanner(System.in);
        String dec;
        do{
            try{
                dec = sc.nextLine();
                if (dec.equals("y") || dec.equals("Y")){
                    return true;
                } else if (dec.equals("n") || dec.equals("N")){
                    return false;
                } else {
                    System.out.println("Please enter correct values");
                }
            } catch (Exception e){
                System.out.println("You entered wrong values");
            }
        }while(true);
    }
}
