/*
 * Author: Ashish Srivastava
 * Problem Description: Create a Vehicle class with instance variables
 * ownerName and vehicleType, and a class variable registrationFee
 * fixed for all vehicles. Add methods to display vehicle details and
 * update the registration fee.
 */

class Vehicle {

    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable
    static double registrationFee = 5000;

    // Parameterized constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {

        Vehicle vehicle1 =
                new Vehicle("Ashish", "Car");

        Vehicle vehicle2 =
                new Vehicle("Rahul", "Bike");

        System.out.println("Before Updating Registration Fee:");

        vehicle1.displayVehicleDetails();
        System.out.println();

        vehicle2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(7500);

        System.out.println("\nAfter Updating Registration Fee:");

        vehicle1.displayVehicleDetails();
        System.out.println();

        vehicle2.displayVehicleDetails();
    }
}