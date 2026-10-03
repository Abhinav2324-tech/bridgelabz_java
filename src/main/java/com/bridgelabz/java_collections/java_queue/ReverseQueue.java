package com.bridgelabz.java_collections.java_queue;import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

    public static void reverse(Queue<Integer> queue) {

        // Base condition
        if (queue.isEmpty()) {
            return;
        }

        // Remove front element
        int value = queue.remove();

        // Reverse remaining queue
        reverse(queue);

        // Add removed element at the end
        queue.add(value);
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Before: " + queue);

        reverse(queue);

        System.out.println("After: " + queue);
    }
}
