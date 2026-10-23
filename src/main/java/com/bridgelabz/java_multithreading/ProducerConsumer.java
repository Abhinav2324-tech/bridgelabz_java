package com.bridgelabz.java_multithreading;

import java.util.*;

class SharedQueue {

    private Queue<Integer> queue = new LinkedList<>();
    private int capacity = 3;

    public synchronized void produce(int value)
            throws InterruptedException {

        while (queue.size() == capacity) {
            wait();
        }

        queue.add(value);

        System.out.println("Produced: " + value);

        notifyAll();
    }

    public synchronized int consume()
            throws InterruptedException {

        while (queue.isEmpty()) {
            wait();
        }

        int value = queue.remove();

        System.out.println("Consumed: " + value);

        notifyAll();

        return value;
    }
}

class Producer implements Runnable {

    private SharedQueue sharedQueue;

    public Producer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    public void run() {

        try {
            for (int i = 1; i <= 5; i++) {
                sharedQueue.produce(i);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Producer interrupted");
        }
    }
}

class Consumer implements Runnable {

    private SharedQueue sharedQueue;

    public Consumer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    public void run() {

        try {
            for (int i = 1; i <= 5; i++) {
                sharedQueue.consume();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Consumer interrupted");
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {

        SharedQueue sharedQueue = new SharedQueue();

        Thread producer = new Thread(
                new Producer(sharedQueue)
        );

        Thread consumer = new Thread(
                new Consumer(sharedQueue)
        );

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();

            System.out.println("All tasks processed");

        } catch (InterruptedException e) {
            producer.interrupt();
            consumer.interrupt();
            Thread.currentThread().interrupt();
        }
    }
}
