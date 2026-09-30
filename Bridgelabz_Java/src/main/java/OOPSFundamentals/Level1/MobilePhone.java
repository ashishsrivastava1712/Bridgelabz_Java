/*
 * Author: Ashish Srivastava
 * Problem Description: Create a MobilePhone class with attributes
 * brand, model, and price. Add a method to display all the details
 * of the phone.
 * Program: Handle Mobile Phone Details
 */

class MobilePhone {
    String brand;
    String model;
    double price;

    // Method to display mobile phone details
    public void displayDetails() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Model: " + model);
        System.out.println("Mobile Price: " + price);
    }

    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone();

        mobilePhone.brand = "Samsung";
        mobilePhone.model = "Galaxy S24";
        mobilePhone.price = 74999;

        mobilePhone.displayDetails();
    }
}