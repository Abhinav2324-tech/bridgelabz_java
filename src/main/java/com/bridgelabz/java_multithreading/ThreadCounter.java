package com.bridgelabz.java_multithreading;
import java.util.*;

class Counter {

    private int count = 1;
    private int limit;

    public Counter(int limit) {
        this.limit = limit;
    }

    public synchronized void printNumbers(int remainder) {

        while (count <= limit) {

            while (count <= limit && count % 2 != remainder) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    notifyAll();
                    return;
                }
            }

            if (count > limit) {
                notifyAll();
                break;
            }

            System.out.println(
                    Thread.currentThread().getName() + " : " + count
            );

            count++;

            notifyAll();
        }
    }
}

public class ThreadCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter limit: ");
            int limit = sc.nextInt();

            if (limit <= 0) {
                System.out.println("Enter a positive number");
                return;
            }

            Counter counter = new Counter(limit);

            Thread t1 = new Thread(
                    () -> counter.printNumbers(1), "Thread 1"
            );

            Thread t2 = new Thread(
                    () -> counter.printNumbers(0), "Thread 2"
            );

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            System.out.println("Counting completed");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Enter an integer.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted");
        } finally {
            sc.close();
        }
    }
}