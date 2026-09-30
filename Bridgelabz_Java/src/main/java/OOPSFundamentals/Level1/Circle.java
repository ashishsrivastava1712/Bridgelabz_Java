// Program to compute Area and Circumference of a Circle
/*
 * Author: Ashish Srivastava
 * Problem Description: Write a program to create a Circle class with an
 * attribute radius. Add methods to calculate and display the area and
 * circumference of the circle.
 * Program: Compute Area and Circumference of a Circle
 */

class Circle {
    double radius;

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display circle details
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {

        Circle circle = new Circle();

        circle.radius = 5;

        circle.displayDetails();
    }
}