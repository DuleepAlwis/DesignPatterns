package com.designpatterns.StrategyDesignPattern;

public class Context {

    private final NotificationService notificationService;

    public Context(final NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void sendNotification(String to,String message){
        this.notificationService.sendNotification(to,message);
    }
}
