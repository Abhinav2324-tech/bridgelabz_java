package com.bridgelabz.java_abstraction;
/*
This program demonstrates a Hospital Patient Management System using
abstraction, inheritance, encapsulation, interfaces, method overriding,
and polymorphism. InPatient and OutPatient calculate their hospital bills
differently and maintain medical records securely.
*/

import java.util.Scanner;

interface MedicalRecord {

    void addRecord(String diagnosis, String medicalHistory);

    void viewRecords();
}

abstract class Patient implements MedicalRecord {

    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private String medicalHistory;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Bill Amount: " + calculateBill());
        viewRecords();
    }
}

class InPatient extends Patient {

    private int numberOfDays;
    private double roomChargePerDay;

    public InPatient(int patientId, String name, int age,
                     int numberOfDays, double roomChargePerDay) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
        this.roomChargePerDay = roomChargePerDay;
    }

    @Override
    public double calculateBill() {
        return numberOfDays * roomChargePerDay;
    }

    @Override
    public void addRecord(String diagnosis, String medicalHistory) {
        setDiagnosis(diagnosis);
        setMedicalHistory(medicalHistory);
    }

    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + getDiagnosis());
        System.out.println("Medical History: " + getMedicalHistory());
    }
}

class OutPatient extends Patient {

    private double consultationFee;
    private double medicineCharge;

    public OutPatient(int patientId, String name, int age,
                      double consultationFee, double medicineCharge) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicineCharge = medicineCharge;
    }

    @Override
    public double calculateBill() {
        return consultationFee + medicineCharge;
    }

    @Override
    public void addRecord(String diagnosis, String medicalHistory) {
        setDiagnosis(diagnosis);
        setMedicalHistory(medicalHistory);
    }

    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + getDiagnosis());
        System.out.println("Medical History: " + getMedicalHistory());
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter InPatient ID:");
        int inPatientId = input.nextInt();
        input.nextLine();

        System.out.println("Enter InPatient Name:");
        String inPatientName = input.nextLine();

        System.out.println("Enter InPatient Age:");
        int inPatientAge = input.nextInt();

        System.out.println("Enter Number of Days Admitted:");
        int numberOfDays = input.nextInt();

        System.out.println("Enter Room Charge Per Day:");
        double roomChargePerDay = input.nextDouble();
        input.nextLine();

        System.out.println("Enter InPatient Diagnosis:");
        String inPatientDiagnosis = input.nextLine();

        System.out.println("Enter InPatient Medical History:");
        String inPatientHistory = input.nextLine();

        System.out.println("Enter OutPatient ID:");
        int outPatientId = input.nextInt();
        input.nextLine();

        System.out.println("Enter OutPatient Name:");
        String outPatientName = input.nextLine();

        System.out.println("Enter OutPatient Age:");
        int outPatientAge = input.nextInt();

        System.out.println("Enter Consultation Fee:");
        double consultationFee = input.nextDouble();

        System.out.println("Enter Medicine Charge:");
        double medicineCharge = input.nextDouble();
        input.nextLine();

        System.out.println("Enter OutPatient Diagnosis:");
        String outPatientDiagnosis = input.nextLine();

        System.out.println("Enter OutPatient Medical History:");
        String outPatientHistory = input.nextLine();

        Patient inPatient =
                new InPatient(inPatientId, inPatientName, inPatientAge,
                        numberOfDays, roomChargePerDay);

        Patient outPatient =
                new OutPatient(outPatientId, outPatientName, outPatientAge,
                        consultationFee, medicineCharge);

        inPatient.addRecord(inPatientDiagnosis, inPatientHistory);
        outPatient.addRecord(outPatientDiagnosis, outPatientHistory);

        Patient[] patients = new Patient[2];

        patients[0] = inPatient;
        patients[1] = outPatient;

        System.out.println("\nPatient Details");

        for (int i = 0; i < patients.length; i++) {
            System.out.println();
            patients[i].getPatientDetails();
        }

        input.close();
    }
}
