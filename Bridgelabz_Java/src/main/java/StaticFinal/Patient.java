/*
 * Author: Ashish
 * Problem: Hospital Management System
 */

public class Patient {

    static String hospitalName = "Apollo Hospital";
    static int totalPatients = 0;

    String name;
    int age;
    String ailment;
    final int patientID;

    public Patient(String name, int age,
                   String ailment, int patientID) {

        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void displayDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Patient ID: " + patientID);
    }

    public static void main(String[] args) {

        Patient patient1 =
                new Patient("Ashish", 21, "Fever", 101);

        Patient patient2 =
                new Patient("Rahul", 25, "Cold", 102);

        if (patient1 instanceof Patient) {
            patient1.displayDetails();
        }

        if (patient2 instanceof Patient) {
            patient2.displayDetails();
        }

        getTotalPatients();
    }
}