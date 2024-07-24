package com.kodilla.rps;

public class CheckResult {
    public static void checkResult(User player, User computer, Gesture player1gesture, Gesture computerGesture){
            if(player1gesture == computerGesture){
                System.out.println("It's a Tie!");
                player.setPunctation(1);
                computer.setPunctation(1);
            } else if((computerGesture == Gesture.SCISSORS) && (player1gesture == Gesture.ROCK)){
                System.out.println("Rock crushes Scissors!");
                player.setPunctation(1);
                computer.setPunctation(0);
            } else if((player1gesture == Gesture.SCISSORS) && (computerGesture == Gesture.ROCK)){
                System.out.println("Rock crushes Scissors!");
                player.setPunctation(0);
                computer.setPunctation(1);
            } else if((player1gesture == Gesture.SCISSORS) && (computerGesture == Gesture.PAPER)){
                System.out.println("Scissors cuts paper!");
                player.setPunctation(1);
                computer.setPunctation(0);
            } else if((player1gesture == Gesture.PAPER) && (computerGesture == Gesture.SCISSORS)){
                System.out.println("Scissors cuts paper!");
                player.setPunctation(0);
                computer.setPunctation(1);
            } else if((player1gesture == Gesture.ROCK) && (computerGesture == Gesture.PAPER)){
                System.out.println("Paper covers rock!");
                player.setPunctation(0);
                computer.setPunctation(1);
            } else if((player1gesture == Gesture.PAPER) && (computerGesture == Gesture.ROCK)){
                System.out.println("Paper covers rock!");
                player.setPunctation(1);
                computer.setPunctation(0);
            }
    }
}
