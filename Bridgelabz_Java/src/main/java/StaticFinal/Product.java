/*
 * Author: Ashish
 * Problem: Shopping Cart System
 */

public class Product {

    static double discount = 10.0;

    String productName;
    double price;
    int quantity;
    final int productID;

    public Product(String productName, double price,
                   int quantity, int productID) {

        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount Updated: " + discount + "%");
    }

    public void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productID);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }

    public static void main(String[] args) {

        Product product =
                new Product("Laptop", 60000, 2, 101);

        if (product instanceof Product) {
            product.displayDetails();
        }

        updateDiscount(15.0);
    }
}