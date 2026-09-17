package com.bridgelabz.java_linkedlist;

public class Reverse {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null ;
        }
    }
    Node head;
    public void reverse(){
        Node next=null;
        Node current=head;
        Node prev=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;

        }
        head=prev;
    }
public void display(){
        Node current=head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
}
    public static void main(String[] args) {
        Reverse list=new Reverse();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.println("Before reversing:");
        list.display();

        list.reverse();

        System.out.println("After reversing:");
        list.display();
    }
}
