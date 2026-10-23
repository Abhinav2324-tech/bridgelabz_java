package com.bridgelabz.java_designpatterns;
import java.util.*;

interface Observer {
    void update(String message);
}

class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

// Subject
class YouTubeChannel {

    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    public void uploadVideo(String videoName) {

        for (Observer observer : subscribers) {
            observer.update("New video: " + videoName);
        }
    }
}

public class Observer1 {
    public static void main(String[] args) {

        YouTubeChannel channel = new YouTubeChannel();

        Observer s1 = new Subscriber("Rahul");
        Observer s2 = new Subscriber("Priya");

        channel.subscribe(s1);
        channel.subscribe(s2);

        channel.uploadVideo("Java Design Patterns");
    }
}