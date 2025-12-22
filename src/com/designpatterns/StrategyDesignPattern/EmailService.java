package com.designpatterns.StrategyDesignPattern;

public class EmailService implements NotificationService{
    @Override
    public void sendNotification(String to, String message) {
        System.out.println("***********Email notification***************");
        System.out.println(to+" MSG : "+message);
    }
}
