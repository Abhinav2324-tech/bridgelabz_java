package com.bridgelabz.java_linkedlist;

public class DLL {
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head;
    Node tail;
    public void insertAtBeg(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public void deleteAtBeg(){
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        head=head.next;
        head.prev=null;
    }
    public void deleteAtEnd(){
        if(tail==null){
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        tail.prev=tail;
        tail.next=null;
    }
    void displayForward() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    void displayBackward() {

        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        DLL list = new DLL();

        list.insertAtBeg(10);
        list.insertAtBeg(20);
        list.insertAtEnd(30);
        list.insertAtEnd(5);

        list.displayForward();
        list.displayBackward();
    }
}
