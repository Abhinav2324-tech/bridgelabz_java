package com.bridgelabz.java_stack_queue_hashmap;

public class Recursion {
    int[] stack;
    int top;
    Recursion(int size){
        stack=new int[size];
        top=-1;
    }
    public void push(int value){
        if(top==stack.length-1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top]=value;

    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        int value=stack[top];
        top--;
        return value;
    }
    public int peek(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void sortStack(){
        if(isEmpty()){
            return;
        }
        int current=pop();
        sortStack();
        sortInsertStack(current);
    }
    public void sortInsertStack(int value){
        if(isEmpty() || value>peek()){
            push(value);
            return;
        }
        int current=pop();
        sortInsertStack(value);
        push(current);
    }
public void display(){
    if(top==-1){
        System.out.println("Stack underflow");
        return;
    }
    for(int i=top;i>=0;i--){
        System.out.println(stack[i]);
    }
}
    public static void main(String[] args) {
        Recursion s=new Recursion(10);
        s.push(3);
        s.push(1);
        s.push(4);
        s.push(2);

        System.out.println("Before Sorting:");
        s.display();

        s.sortStack();

        System.out.println("After Sorting:");
        s.display();
    }
    }

