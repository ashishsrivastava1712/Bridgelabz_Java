/*
 * Author: Ashish Srivastava
 * Problem Description: Create a CarRental class with attributes
 * customerName, carModel, and rentalDays. Add constructors to
 * initialize rental details and calculate total cost.
 */

class CarRental {

    String customerName;
    String carModel;
    int rentalDays;

    // Default constructor
    CarRental() {
        customerName = "Unknown";
        carModel = "Unknown";
        rentalDays = 0;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    double calculateTotalCost(double dailyRate) {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    void displayRental(double dailyRate) {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost(dailyRate));
    }

    public static void main(String[] args) {

        CarRental rental =
                new CarRental("Ashish", "Toyota Camry", 5);

        double dailyRate = 2000;

        rental.displayRental(dailyRate);
    }
}