package com.bridgelabz.java_designpatterns;
interface Notification {
    void send();
}

class EmailNotification implements Notification {
    public void send() {
        System.out.println("Email sent");
    }
}

class SMSNotification implements Notification {
    public void send() {
        System.out.println("SMS sent");
    }
}

// Creator
abstract class NotificationFactory {
    abstract Notification createNotification();
}

class EmailFactory extends NotificationFactory {
    Notification createNotification() {
        return new EmailNotification();
    }
}

class SMSFactory extends NotificationFactory {
    Notification createNotification() {
        return new SMSNotification();
    }
}

public class Factory {
    public static void main(String[] args) {

        NotificationFactory factory = new EmailFactory();

        Notification notification = factory.createNotification();
        notification.send();

        factory = new SMSFactory();

        notification = factory.createNotification();
        notification.send();
    }
}