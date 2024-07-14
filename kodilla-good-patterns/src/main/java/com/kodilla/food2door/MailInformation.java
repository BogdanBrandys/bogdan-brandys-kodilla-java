package com.kodilla.food2door;

public class MailInformation implements OrderInformationService{
    @Override
    public void sendInfo() {
        System.out.println("Sending email...");
    }
}
