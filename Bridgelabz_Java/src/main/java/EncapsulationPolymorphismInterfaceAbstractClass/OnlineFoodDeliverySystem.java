package EncapsulationPolymorphismInterfaceAbstractClass;

import java.util.ArrayList;
import java.util.List;

/*
 * Author: Ashish Srivastava
 * Problem Description:
 * Create an online food delivery system using abstraction,
 * encapsulation, interfaces and polymorphism.
 */

abstract class FoodItem {

    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity must be greater than zero.");
        }
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Food Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

interface Discountable {

    double applyDiscount();

    void getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {

    VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Veg item discount: 10%");
    }
}

class NonVegItem extends FoodItem implements Discountable {

    NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        // Additional non-veg charge.
        return (getPrice() * getQuantity()) + 50;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Non-veg item discount: 5%");
    }
}

public class OnlineFoodDeliverySystem {

    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(
                new VegItem("Paneer Biryani", 250, 2)
        );

        order.add(
                new NonVegItem("Chicken Biryani", 350, 2)
        );

        for (FoodItem item : order) {

            item.getItemDetails();

            double total = item.calculateTotalPrice();

            Discountable discountable = (Discountable) item;

            double discount = discountable.applyDiscount();

            discountable.getDiscountDetails();

            System.out.println("Total Price: " + total);
            System.out.println("Discount: " + discount);
            System.out.println(
                    "Final Price: " + (total - discount)
            );

            System.out.println("--------------------");
        }
    }
}