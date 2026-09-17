package com.bridgelabz.java_stack_queue_hashmap;

public class QueueUsingStack {
    int[] stack1=new int[5];
    int top1=-1;
    int[] stack2=new int[5];
    int top2=-1;
    public void push1(int value){
        top1++;
        stack1[top1]=value;
    }
    public int pop1(){
        int value=stack1[top1];
        top1--;
        return value;
    }
    public void push2(int value){
        top2++;
        stack2[top2]=value;
    }
    public int pop2(){
        int value=stack2[top2];
        top2--;
        return value;
    }
    public void enqueue(int value){
        if(top1==stack1.length-1){
            System.out.println("Queue is full");
            return;
        }
        push1(value);
    }
    public int dequeue(){
        if(top1==-1&&top2==-1){
            System.out.println("Queue is empty");
            return -1;
        }
        if(top2==-1){
            while(top1!=-1){
                push2(pop1());
            }
        }
        return pop2();
    }
    public static void main(String[] args) {

        QueueUsingStack obj = new QueueUsingStack();

        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);

        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());

        obj.enqueue(40);

        System.out.println(obj.dequeue());
        System.out.println(obj.dequeue());
    }
}
