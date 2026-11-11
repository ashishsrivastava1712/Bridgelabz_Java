/*
Problem 3 : Variables and methods
Vehicle Registration
Create a Vehicle class to manage the details of vehicles:
Instance Variables: ownerName, vehicleType.
Class Variable: registrationFee (fixed for all vehicles).
Methods:
An instance method displayVehicleDetails() to display owner and vehicle details.
A class method updateRegistrationFee() to change the registration fee.
Author : Ashish Srivastava
Date : 04/10/2026*/

package main.java.JavaConstructor.VariablesAndMethods;

import java.util.*;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static int registrationFee;
    Vehicle(String ownerName, String vehicleType) { // Parameterized Constructor
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        registrationFee = 1000; // Default value for registrationFee
    }
    void displayVehicleDetails() { // Instance method to display the details of a vehicle
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }
    public static void updateRegistrationFee(int registrationFee) { // Class method to update the registration fee
        Vehicle.registrationFee = registrationFee;
    }
    public static void main(String[] args) { // Main method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vehicles");
        int n = scanner.nextInt();
        Vehicle vehicles[] = new Vehicle[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the owner name");
            String ownerName = scanner.next();
            System.out.println("Enter the vehicle type");
            String vehicleType = scanner.next();
            vehicles[i] = new Vehicle(ownerName, vehicleType);
        }
        for (int i = 0; i < n; i++) {
            vehicles[i].displayVehicleDetails();
        }
        System.out.println("Enter the new registration fee");
        int registrationFee = scanner.nextInt();
        Vehicle.updateRegistrationFee(registrationFee);
        for (int i = 0; i < n; i++) {
            vehicles[i].displayVehicleDetails();
        }
        scanner.close();
    }
}
