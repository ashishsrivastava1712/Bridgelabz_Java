package Inheritance.HybridInheritance;

/*
 * Author: Ashish Srivastava
 * Problem Description: Model vehicles using a Vehicle parent class
 * and a Refuelable interface. ElectricVehicle can charge while
 * PetrolVehicle can refuel.
 */

public class VehicleManagement {

    // Parent class
    static class Vehicle {

        int maxSpeed;
        String model;

        Vehicle(int maxSpeed, String model) {
            this.maxSpeed = maxSpeed;
            this.model = model;
        }

        // Common vehicle information
        void displayVehicle() {

            System.out.println(
                    "Model: " + model
            );

            System.out.println(
                    "Maximum Speed: "
                            + maxSpeed + " km/h"
            );
        }
    }

    /*
     * Interface defines a common refueling behavior.
     */
    interface Refuelable {

        void refuel();
    }

    /*
     * ElectricVehicle inherits Vehicle.
     * It has charging behavior instead of refueling.
     */
    static class ElectricVehicle extends Vehicle {

        ElectricVehicle(int maxSpeed, String model) {

            super(maxSpeed, model);
        }

        // Electric-specific behavior
        void charge() {

            System.out.println(
                    model + " is charging."
            );
        }
    }

    /*
     * PetrolVehicle inherits Vehicle AND implements Refuelable.
     */
    static class PetrolVehicle
            extends Vehicle
            implements Refuelable {

        PetrolVehicle(int maxSpeed, String model) {

            super(maxSpeed, model);
        }

        // Implementation of Refuelable interface
        @Override
        public void refuel() {

            System.out.println(
                    model + " is being refueled."
            );
        }
    }

    public static void main(String[] args) {

        // Create ElectricVehicle object
        ElectricVehicle electricCar =
                new ElectricVehicle(
                        180,
                        "Tesla"
                );

        // Create PetrolVehicle object
        PetrolVehicle petrolCar =
                new PetrolVehicle(
                        200,
                        "Toyota"
                );

        // Inherited method
        electricCar.displayVehicle();

        // ElectricVehicle-specific method
        electricCar.charge();

        System.out.println();

        // Inherited method
        petrolCar.displayVehicle();

        // Interface method implementation
        petrolCar.refuel();
    }
}