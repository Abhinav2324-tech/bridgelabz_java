package com.bridgelabz.java_linkedlist;

public class SLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void insertAtBeg(int data){
        Node newNode=new Node(data);

        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;

        }
        current.next=newNode;
    }
    public void insertAtPosition(int data,int position){
        Node newNode=new Node(data);
        if(position==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node current=head;
        for(int i=1;i<position-1;i++){
            current=current.next;
        }
        newNode.next=current.next;
        current.next=newNode;
    }
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }


            current = current.next;

        }
        return false;
    }
    public void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        SLL list=new SLL();
        list.insertAtBeg(10);
        list.insertAtBeg(20);
        list.insertAtEnd(40);
        list.insertAtPosition(30,3);
        list.display();
    }
}
