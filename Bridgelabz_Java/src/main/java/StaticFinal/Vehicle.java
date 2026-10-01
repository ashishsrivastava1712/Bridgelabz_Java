/*
 * Author: Ashish
 * Problem: Vehicle Registration System
 */

public class Vehicle {

    static double registrationFee = 5000;

    String ownerName;
    String vehicleType;
    final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType,
                   String registrationNumber) {

        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration Fee Updated: " + registrationFee);
    }

    public void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void main(String[] args) {

        Vehicle vehicle =
                new Vehicle("Ashish", "Car", "TN01AB1234");

        if (vehicle instanceof Vehicle) {
            vehicle.displayDetails();
        }

        updateRegistrationFee(6000);
    }
}