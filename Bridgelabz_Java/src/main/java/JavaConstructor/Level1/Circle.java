/*
 * Author: Ashish Srivastava
 * Problem Description: Create a Circle class with a radius attribute.
 * Use constructor chaining to initialize radius with default and
 * user-provided values.
 */

class Circle {

    double radius;

    // Default constructor
    Circle() {
        this(1.0);
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to display radius
    void displayRadius() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {

        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(5.0);

        System.out.println("Default Circle:");
        defaultCircle.displayRadius();

        System.out.println("\nCustom Circle:");
        customCircle.displayRadius();
    }
}