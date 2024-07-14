package com.kodilla.food2door;

public class SmsInfo implements OrderInformationService{
    @Override
    public void sendInfo() {
        System.out.println("Sending sms...");
    }
}
