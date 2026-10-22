package com.bridgelabz.java_objectmodelling;
import java.util.*;

class Patient {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();

    Patient(String name) {
        this.name = name;
    }

    void displayDoctors() {
        System.out.println("Patient: " + name);

        for (Doctor doctor : doctors) {
            System.out.println("Consulted: " + doctor.name);
        }
    }
}

class Doctor {
    String name;
    ArrayList<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.doctors.add(this);
        }

        System.out.println(
                "Dr. " + name + " consulted " + patient.name
        );
    }

    void displayPatients() {
        System.out.println("Doctor: " + name);

        for (Patient patient : patients) {
            System.out.println(patient.name);
        }
    }
}

class Hospital {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    Hospital(String name) {
        this.name = name;
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }
}

public class HospitalAssociation {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Kumar");
        Doctor d2 = new Doctor("Priya");

        Patient p1 = new Patient("Rahul");
        Patient p2 = new Patient("Amit");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        d1.displayPatients();
        d2.displayPatients();

        p1.displayDoctors();
    }
}
