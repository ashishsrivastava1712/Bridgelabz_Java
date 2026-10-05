package EncapsulationPolymorphismInterfaceAbstractClass;

import java.util.ArrayList;
import java.util.List;

/*
 * Author: Ashish Srivastava
 * Problem Description:
 * Manage vehicle rentals using abstraction,
 * inheritance, interfaces, encapsulation and polymorphism.
 */

abstract class RentalVehicle {

    private String vehicleNumber;
    private String type;
    private double rentalRate;

    RentalVehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Subclasses calculate rental cost differently.
    public abstract double calculateRentalCost(int days);
}

interface Insurable {

    double calculateInsurance();

    void getInsuranceDetails();
}

class Car extends RentalVehicle implements Insurable {

    private String policyNumber;

    Car(String number, double rate, String policyNumber) {
        super(number, "Car", rate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 1500;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Car Insurance Available");
    }
}

class Bike extends RentalVehicle implements Insurable {

    private String policyNumber;

    Bike(String number, double rate, String policyNumber) {
        super(number, "Bike", rate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Bike Insurance Available");
    }
}

class Truck extends RentalVehicle implements Insurable {

    private String policyNumber;

    Truck(String number, double rate, String policyNumber) {
        super(number, "Truck", rate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 3000;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Truck Insurance Available");
    }
}

public class VehicleRentalSystem {

    public static void main(String[] args) {

        List<RentalVehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 2000, "CAR-P101"));
        vehicles.add(new Bike("BIKE102", 800, "BIKE-P102"));
        vehicles.add(new Truck("TRUCK103", 5000, "TRUCK-P103"));

        int rentalDays = 3;

        for (RentalVehicle vehicle : vehicles) {

            System.out.println("Vehicle: " + vehicle.getType());
            System.out.println("Number: " + vehicle.getVehicleNumber());

            System.out.println(
                    "Rental Cost: "
                            + vehicle.calculateRentalCost(rentalDays)
            );

            Insurable insurable = (Insurable) vehicle;

            System.out.println(
                    "Insurance: "
                            + insurable.calculateInsurance()
            );

            insurable.getInsuranceDetails();

            System.out.println("--------------------");
        }
    }
}