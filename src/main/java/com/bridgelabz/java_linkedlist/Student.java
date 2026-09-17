package com.bridgelabz.java_linkedlist;

public class Student {
    public static class Node {
        int rollNumber;
        String name;
        int age;
        String grade;
        Node next;

        public Node(int rollNumber, String name, int age, String grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }

    Node head;

    public void insertAtBeginning(int rollNumber, String name, int age, String grade) {
        Node newNode = new Node(rollNumber, name, age, grade);

        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int rollNumber, String name, int age, String grade) {
        Node newNode = new Node(rollNumber, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtPosition(int rollNumber, String name, int age,
                              String grade, int position) {
        Node newNode = new Node(rollNumber, name, age, grade);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1; i++) {

            if (current == null) {
                System.out.println("Invalid position");
                return;
            }

            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }
    public void deleteByRollNumber(int rollNumber) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Student deleted successfully");
            return;
        }

        Node current = head;

        while (current.next != null &&
                current.next.rollNumber != rollNumber) {

            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Student not found");
            return;
        }

            current.next = current.next.next;

        System.out.println("Student deleted successfully");
    }

    public void searchByRollNumber(int rollNumber) {

        Node current = head;

        while (current != null) {

            if (current.rollNumber == rollNumber) {

                System.out.println("Student Found");
                System.out.println("Roll Number: " + current.rollNumber);
                System.out.println("Name: " + current.name);
                System.out.println("Age: " + current.age);
                System.out.println("Grade: " + current.grade);

                return;
            }

            current = current.next;
        }

        System.out.println("Student not found");
    }
    public void updateGrade(int rollNumber, String newGrade) {

        Node current = head;

        while (current != null) {

            if (current.rollNumber == rollNumber) {

                current.grade = newGrade;

                System.out.println("Grade updated successfully");
                return;
            }

            current = current.next;
        }

        System.out.println("Student not found");
    }
    public void displayStudents() {

        if (head == null) {
            System.out.println("No student records available");
            return;
        }

        Node current = head;

        while (current != null) {

            System.out.println("----------------------");
            System.out.println("Roll Number: " + current.rollNumber);
            System.out.println("Name: " + current.name);
            System.out.println("Age: " + current.age);
            System.out.println("Grade: " + current.grade);

            current = current.next;
        }
    }
    public static void main(String[] args) {

        Student list = new Student();

        list.insertAtBeginning(101, "Abhinav", 20, "A");

        list.insertAtEnd(102, "Rahul", 21, "B");
        list.insertAtEnd(103, "Priya", 20, "A");

        list.insertAtPosition(104, "Kiran", 22, "B", 2);

        System.out.println("Student Records:");
        list.displayStudents();

        System.out.println("\nSearching for Roll Number 103:");
        list.searchByRollNumber(103);

        System.out.println("\nUpdating Grade:");
        list.updateGrade(102, "A");

        System.out.println("\nAfter Grade Update:");
        list.displayStudents();

        System.out.println("\nDeleting Roll Number 104:");
        list.deleteByRollNumber(104);

        System.out.println("\nAfter Deletion:");
        list.displayStudents();
    }
}


