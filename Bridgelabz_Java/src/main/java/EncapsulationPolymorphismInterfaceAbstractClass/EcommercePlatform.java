package EncapsulationPolymorphismInterfaceAbstractClass;

import java.util.ArrayList;
import java.util.List;

/*
 * Author: Ashish Srivastava
 * Problem Description:
 * Develop an e-commerce platform using abstraction,
 * interfaces, encapsulation and polymorphism.
 */

abstract class Product {

    private int productId;
    private String name;
    private double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setter protects price from invalid values.
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    // Every product calculates discount differently.
    public abstract double calculateDiscount();

    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}

// Interface defines taxation behavior.
interface Taxable {
    double calculateTax();
    void getTaxDetails();
}

class Electronics extends Product implements Taxable {

    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Electronics Tax: 18%");
    }
}

class Clothing extends Product implements Taxable {

    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Clothing Tax: 5%");
    }
}

class Groceries extends Product implements Taxable {

    Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.02;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Groceries Tax: 2%");
    }
}

public class EcommercePlatform {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 80000));
        products.add(new Clothing(102, "Jacket", 5000));
        products.add(new Groceries(103, "Rice", 1000));

        // Product reference allows different product types.
        for (Product product : products) {

            product.displayProduct();

            double discount = product.calculateDiscount();

            // Taxable reference demonstrates interface polymorphism.
            Taxable taxableProduct = (Taxable) product;
            double tax = taxableProduct.calculateTax();

            double finalPrice =
                    product.getPrice() + tax - discount;

            taxableProduct.getTaxDetails();

            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);

            System.out.println("--------------------");
        }
    }
}