package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {
    public void inform(User user){
        System.out.println("Transaction completed. Thank you " + user.getFirstName() + " " + user.getLastName());
    }

}
