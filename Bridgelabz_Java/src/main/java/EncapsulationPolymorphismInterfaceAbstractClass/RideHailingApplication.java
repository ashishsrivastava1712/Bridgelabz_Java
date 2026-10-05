package EncapsulationPolymorphismInterfaceAbstractClass;

import java.util.ArrayList;
import java.util.List;

/*
 * Author: Ashish Srivastava
 * Problem Description:
 * Develop a ride-hailing application using abstraction,
 * encapsulation, interfaces and polymorphism.
 */

abstract class RideVehicle {

    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
        System.out.println("Rate/Km: " + ratePerKm);
    }

    // Each vehicle calculates fare differently.
    public abstract double calculateFare(double distance);
}

interface GPS {

    String getCurrentLocation();

    void updateLocation(String location);
}

class RideCar extends RideVehicle implements GPS {

    private String location = "Chennai";

    RideCar(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

class RideBike extends RideVehicle implements GPS {

    private String location = "Tambaram";

    RideBike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

class Auto extends RideVehicle implements GPS {

    private String location = "Guindy";

    Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

public class RideHailingApplication {

    public static void main(String[] args) {

        List<RideVehicle> vehicles = new ArrayList<>();

        vehicles.add(
                new RideCar("CAR101", "Ashish", 20)
        );

        vehicles.add(
                new RideBike("BIKE102", "Rahul", 10)
        );

        vehicles.add(
                new Auto("AUTO103", "Amit", 15)
        );

        double distance = 10;

        for (RideVehicle vehicle : vehicles) {

            vehicle.getVehicleDetails();

            // Polymorphic fare calculation.
            System.out.println(
                    "Fare: "
                            + vehicle.calculateFare(distance)
            );

            GPS gps = (GPS) vehicle;

            System.out.println(
                    "Current Location: "
                            + gps.getCurrentLocation()
            );

            gps.updateLocation("Chennai Central");

            System.out.println(
                    "Updated Location: "
                            + gps.getCurrentLocation()
            );

            System.out.println("--------------------");
        }
    }
}