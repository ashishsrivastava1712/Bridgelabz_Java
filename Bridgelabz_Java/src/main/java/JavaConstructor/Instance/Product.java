/*
 * Author: Ashish Srivastava
 * Problem Description: Create a Product class with instance variables
 * productName and price, and a class variable totalProducts shared
 * among all products. Add methods to display product details and
 * display the total number of products created.
 */

class Product {

    // Instance variables
    String productName;
    double price;

    // Class variable
    static int totalProducts = 0;

    // Parameterized constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {

        Product product1 = new Product("Laptop", 55000);
        Product product2 = new Product("Mobile", 25000);
        Product product3 = new Product("Headphones", 3000);

        product1.displayProductDetails();
        System.out.println();

        product2.displayProductDetails();
        System.out.println();

        product3.displayProductDetails();
        System.out.println();

        Product.displayTotalProducts();
    }
}