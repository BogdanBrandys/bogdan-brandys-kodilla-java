package com.kodilla.rps;

public class ShowResult {
    public static void showResult(User player, User computer, int Round){
        System.out.println();
        System.out.println("_______________________________________");
        System.out.println("Round " + Round);
        System.out.println(player.getName() + " : " + player.getPunctation());
        System.out.println(computer.getName() + " : " + computer.getPunctation());
        System.out.println("_______________________________________");
        System.out.println();
    }
    public static void showWinner(User player, User computer){
        if(player.getPunctation() == computer.getPunctation()){
            System.out.println("It's a tie!");
        } else if(player.getPunctation() > computer.getPunctation()){
            System.out.println(player.getName() + " wins!");
        } else if(player.getPunctation() < computer.getPunctation()){
            System.out.println("Computer wins!");
        }
    }
}
