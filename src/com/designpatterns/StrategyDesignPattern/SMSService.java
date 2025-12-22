package com.designpatterns.StrategyDesignPattern;

public class SMSService implements NotificationService{
    @Override
    public void sendNotification(String to, String message) {
        System.out.println("***********Sms notification***************");
        System.out.println(to+" MSG : "+message);
    }
}
