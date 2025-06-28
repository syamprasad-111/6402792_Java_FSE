package com.VerifyNotification;

public class NotificationService {
    private NotifyInterface nService;
    public NotificationService(NotifyInterface nService) {
        this.nService=nService;
    }
    public String SendNotification(String user) { 
        String notification="Hello, " + user;
        nService.send(notification);
        return notification;
    }
}
