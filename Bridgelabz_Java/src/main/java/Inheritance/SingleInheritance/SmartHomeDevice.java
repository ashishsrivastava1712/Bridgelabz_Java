
package Inheritance.SingleInheritance;

/*
 * Author: Ashish Srivastava
 * Problem Description: Create a Device class and extend it using
 * Thermostat. Display device status and temperature settings.
 */

public class SmartHomeDevice {

    // Parent class
    static class Device {

        String deviceId;
        String status;

        // Constructor initializes device information
        Device(String deviceId, String status) {
            this.deviceId = deviceId;
            this.status = status;
        }

        // Displays common device information
        void displayStatus() {
            System.out.println("Device ID: " + deviceId);
            System.out.println("Status: " + status);
        }
    }

    // Child class inherits Device
    static class Thermostat extends Device {

        double temperatureSetting;

        // Constructor of Thermostat
        Thermostat(String deviceId, String status,
                   double temperatureSetting) {

            // Initialize parent class attributes
            super(deviceId, status);

            this.temperatureSetting = temperatureSetting;
        }

        // Overriding parent method
        @Override
        void displayStatus() {

            // Reuse parent's implementation
            super.displayStatus();

            // Add Thermostat-specific information
            System.out.println(
                    "Temperature: " + temperatureSetting + "°C"
            );
        }
    }

    public static void main(String[] args) {

        // Creating child class object
        Thermostat thermostat =
                new Thermostat("T101", "ON", 24.5);

        // Calling overridden method
        thermostat.displayStatus();
    }
}