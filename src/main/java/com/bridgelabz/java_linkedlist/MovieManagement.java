package com.bridgelabz.java_linkedlist;

public class MovieManagement {
    static class Node{
        String movieTitle;
        String director;
        int yearOfRelease;
        double rating;
        Node next;
        Node prev;
        Node(String movieTitle, String director, int yearOfRelease, double rating){
            this.movieTitle=movieTitle;
            this.director=director;
            this.yearOfRelease=yearOfRelease;
            this.rating=rating;
        }
    }
    Node head;
    Node tail;
    public void addAtBeginning(String movieTitle, String director,
                               int yearOfRelease, double rating) {

        Node newNode = new Node(movieTitle, director, yearOfRelease, rating);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addAtEnd(String movieTitle, String director,
                         int yearOfRelease, double rating) {

        Node newNode = new Node(movieTitle, director, yearOfRelease, rating);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void addAtPosition(String movieTitle, String director, int yearOfRelease, double rating, int position){
        Node newNode=new Node(movieTitle, director, yearOfRelease, rating);
        if(position==1){
            if(head == null){
                head=newNode;
                tail=newNode;
                return;
            }
            else{
                newNode.next=head;
                head.prev=newNode;
                head=newNode;
            }
            return;
        }
        Node current=head;
        for(int i=1;i<position-1&&current!=null;i++){
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
    public void removeMovie(String title){
        if(head==null){
            System.out.println("Movie not found");

            return;
        }
        Node current=head;
        while(current!=null && !current.movieTitle.equalsIgnoreCase(title)){
            current=current.next;
        }
        if(current==null){
            System.out.println("Movie not found");
            return;
        }
        if(current==head){
            head=head.next;
            if(head!=null) {
                head.prev = null;
            }
            else{
                tail=null;
            }
        }
        else if(current==tail){
            tail=tail.prev;
            tail.next=null;
        }
        else {

                current.prev.next=current.next;
                current.next.prev=current.prev;
        }
    }
    public void searchMovie(double rating){
        Node current=head;

        while(current!=null){
            if(current.rating==rating){
                    displayMovie(current);

            }
            current=current.next;
        }
    }
    public void updateRating(String title,double newRating){
        Node current=head;
        while (current!=null){
            if(current.movieTitle.equalsIgnoreCase(title)){
                current.rating=newRating;
                System.out.println("Rating updated Successfully");
                return;
            }
            current=current.next;
        }
        System.out.println("Movie not found");
    }
    public void displayForward(){
        if(head==null){
            System.out.println("Movie not found");
            return;
        }
        Node current= head;
        while (current!=null){
            displayMovie(current);
            current=current.next;
        }
    }
    public void displayReverse(){
        if(tail==null){
            System.out.println("Movie not found");
            return;
        }
        Node current=tail;
        while (current!=null){
            displayMovie(current);
            current=current.prev;
        }
    }
    public void displayMovie(Node current){
        System.out.println("------------------------");
        System.out.println("Movie Title: " + current.movieTitle);
        System.out.println("Director: " + current.director);
        System.out.println("Year: " + current.yearOfRelease);
        System.out.println("Rating: " + current.rating);
    }

    public static void main(String[] args) {
        MovieManagement movies=new MovieManagement();
        movies.addAtBeginning(
                "Inception",
                "Christopher Nolan",
                2010,
                8.8);

        movies.addAtEnd(
                "Interstellar",
                "Christopher Nolan",
                2014,
                8.7);

        movies.addAtEnd(
                "Parasite",
                "Bong Joon-ho",
                2019,
                8.5);

        movies.addAtPosition(
                "The Dark Knight",
                "Christopher Nolan",
                2008,
                9.0,
                2);

        System.out.println("Forward Display:");
        movies.displayForward();

        System.out.println("\nReverse Display:");
        movies.displayReverse();


        System.out.println("\nSearch by Rating:");
        movies.searchMovie(8.5);

        System.out.println("\nUpdate Rating:");
        movies.updateRating("Interstellar", 9.1);

        System.out.println("\nAfter Update:");
        movies.displayForward();

        System.out.println("\nRemove Movie:");
        movies.removeMovie("The Dark Knight");

        System.out.println("\nAfter Deletion:");
        movies.displayForward();
    }
}

