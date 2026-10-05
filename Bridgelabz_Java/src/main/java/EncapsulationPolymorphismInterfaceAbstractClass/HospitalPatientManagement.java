package EncapsulationPolymorphismInterfaceAbstractClass;

import java.util.ArrayList;
import java.util.List;

/*
 * Author: Ashish Srivastava
 * Problem Description:
 * Manage hospital patients using abstraction,
 * encapsulation, interfaces and polymorphism.
 */

abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Sensitive details are protected through private fields.
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public abstract double calculateBill();
}

interface MedicalRecord {

    void addRecord(String record);

    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {

    private double roomCharges;
    private String medicalRecord = "";

    InPatient(int id, String name, int age, double roomCharges) {
        super(id, name, age);
        this.roomCharges = roomCharges;
    }

    @Override
    public double calculateBill() {
        return roomCharges + 5000;
    }

    @Override
    public void addRecord(String record) {
        medicalRecord = record;
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Record: " + medicalRecord);
    }
}

class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;
    private String medicalRecord = "";

    OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalRecord = record;
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Record: " + medicalRecord);
    }
}

public class HospitalPatientManagement {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        patients.add(
                new InPatient(101, "Ashish", 21, 5000)
        );

        patients.add(
                new OutPatient(102, "Rahul", 25, 1000)
        );

        for (Patient patient : patients) {

            patient.getPatientDetails();

            System.out.println(
                    "Bill: " + patient.calculateBill()
            );

            MedicalRecord record =
                    (MedicalRecord) patient;

            record.addRecord("Regular check-up completed.");
            record.viewRecords();

            System.out.println("--------------------");
        }
    }
}