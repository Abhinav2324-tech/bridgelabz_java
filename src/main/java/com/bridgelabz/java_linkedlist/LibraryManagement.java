package com.bridgelabz.java_linkedlist;

public class LibraryManagement {
    static class Node{
        String title;
        String author;
        String genre;
        int bookId;
        boolean availability;

        Node next;
        Node prev;
        Node(String title, String author, String genre,int bookId,boolean availability){
            this.title=title;
            this.author=author;
            this.genre=genre;
            this.bookId=bookId;
            this.availability=availability;
        }
    }
    Node head;
    Node tail;
    public void addAtBeginning(String title, String author, String genre,int bookId,boolean availability){
        Node newNode=new Node(title,author,genre,bookId,availability);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void addAtEnd(String title, String author, String genre,int bookId,boolean availability){
        Node newNode=new Node(title,author,genre,bookId,availability);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public void addAtPosition(String title, String author, String genre,int bookId,boolean availability,int position){
        Node newNode=new Node(title,author,genre,bookId,availability);
        if(position==1) {
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }

            return;
        }
        Node current=head;
        for(int i=1;i<position-1 && current!=null;i++){
            current=current.next;
        }
        if (current == null) {
            System.out.println("Invalid position");
            return;
        }

        if (current.next == null) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            return;
        }
        newNode.next=current.next;
        newNode.prev=current;

        current.next.prev=newNode;
        current.next=newNode;
    }
    public void removeBook(int id) {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }
        Node current = head;
        while (current != null && current.bookId != id) {
            current = current.next;
            if (current == null) {
                System.out.println("Book not found");
                return;
            }
            if (current == head) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                } else {
                    tail = null;
                }
            } else if (current == tail) {
                tail = tail.prev;
                tail.next = null;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }

        }

    }
    public void searchBook(String title){
        Node current=head;
        while(current!=null){
            if(current.title.equalsIgnoreCase(title)){
                displayBook(current);
            }
            current=current.next;
        }
    }
    public void updateStatus(int id,boolean newStatus ){
        Node current=head;
        while(current!=null){
            if(current.bookId==id){
                current.availability=newStatus;
                System.out.println("Updated Successfully");
                return;
            }
            current=current.next;
        }
        System.out.println("Book not found");
    }
    public void displayForward(){
        if(head==null){
            System.out.println("Library is empty");
            return;
        }
        Node current=head;
        while(current!=null){
            displayBook(current);
            current=current.next;
        }
    }
    public void displayReverse(){
        if(tail==null){
            System.out.println("Library is empty");
            return;
        }
        Node current=tail;
        while(current!=null) {
            displayBook(current);
            current = current.prev;
        }
    }
    public int countBooks(){
        int count=0;
        Node current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    public void displayBook(Node current){
        System.out.println("----------------------");
        System.out.println("Book Title: " + current.title);
        System.out.println("Author: " + current.author);
        System.out.println("Genre: " + current.genre);
        System.out.println("Book ID: " + current.bookId);

        if (current.availability) {
            System.out.println("Status: Available");
        }

        else {
            System.out.println("Status: Not Available");
        }

    }

    public static void main(String[] args) {
        LibraryManagement library =
                new LibraryManagement();

        library.addAtBeginning(
                "Atomic Habits",
                "James Clear",
                "Self Help",
                101,
                true);

        library.addAtEnd(
                "The Alchemist",
                "Paulo Coelho",
                "Fiction",
                102,
                true);

        library.addAtEnd(
                "1984",
                "George Orwell",
                "Dystopian",
                103,
                false);

        library.addAtPosition(
                "Ikigai",
                "Hector Garcia",
                "Self Help",
                104,
                true,
                2);

        System.out.println("Forward Display:");
        library.displayForward();

        System.out.println("\nReverse Display:");
        library.displayReverse();

        System.out.println("\nSearch by Title:");
        library.searchBook("1984");



        System.out.println("\nUpdate Availability:");
        library.updateStatus(103, true);

        System.out.println("\nAfter Update:");
        library.displayForward();

        System.out.println("\nRemove Book:");
        library.removeBook(104);

        System.out.println("\nAfter Deletion:");
        library.displayForward();

        System.out.println("\nTotal Number of Books:");
        System.out.println(library.countBooks());
    }
}


