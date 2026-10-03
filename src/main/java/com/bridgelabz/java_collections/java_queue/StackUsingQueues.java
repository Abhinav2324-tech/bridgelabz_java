package com.bridgelabz.java_collections.java_queue;
import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int value) {

        // Add new element to q2
        q2.add(value);

        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {

        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return q1.remove();
    }

    public int top() {

        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return q1.peek();
    }


public class Main {

    public static void main(String[] args) {

        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top now: " + stack.top());
    }
}
}