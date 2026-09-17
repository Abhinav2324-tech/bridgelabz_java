package com.bridgelabz.java_stack_queue_hashmap;

public class StackUsingQueue {
    int[] queue1=new int[5];
    int front1=0;
    int rear1=0;
    int size1=0;

    int[] queue2=new int[5];
    int front2=0;
    int rear2=0;
    int size2=0;

    public void enqueue1(int value){
        queue1[rear1]=value;
        rear1++;
        size1++;
    }
    public int dequeue1(){
        int value=queue1[front1];
        front1++;
        size1--;
        return value;
    }
    public void enqueue2(int value) {

        queue2[rear2] = value;
        rear2++;
        size2++;
    }


    // Dequeue from Queue 2
    public int dequeue2() {

        int value = queue2[front2];
        front2++;
        size2--;

        return value;
    }
    public void push(int value){
        if(size1==queue1.length){
            System.out.println("Stack overflow");
            return;
        }
        enqueue1(value);
    }
    public int pop(){
        if(size1==0){
            System.out.println("Stack underflow");
            return -1;
        }
        while(size1>1){
            enqueue2(dequeue1());
        }
        int value=dequeue1();

        int[] tempQueue=queue1;
        queue1=queue2;
        queue2=tempQueue;

        int tempFront=front1;
        front1=front2;
        front2=tempFront;

        int tempRear=rear1;
        rear1=rear2;
        rear2=tempRear;

        int tempSize=size1;
        size1=size2;
        size2=tempSize;

        return value;
    }
    public static void main(String[] args) {

        StackUsingQueue obj = new StackUsingQueue();

        obj.push(10);
        obj.push(20);
        obj.push(30);

        System.out.println("Popped: " + obj.pop());
        System.out.println("Popped: " + obj.pop());
    }
}
