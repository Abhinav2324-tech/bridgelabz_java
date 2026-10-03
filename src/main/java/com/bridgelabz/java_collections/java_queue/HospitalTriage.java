package com.bridgelabz.java_collections.java_queue;
import java.util.PriorityQueue;

class Patient {

    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriage {

    public static void main(String[] args) {

        PriorityQueue<Patient> queue = new PriorityQueue<>(
                (p1, p2) -> p2.severity - p1.severity
        );

        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        while (!queue.isEmpty()) {

            Patient patient = queue.remove();

            System.out.println(patient.name);
        }
    }
}