/*
 * Author: Ashish Srivastava
 * Problem Description: Create an Item class with attributes itemCode,
 * itemName, and price. Add a method to display item details and
 * calculate the total cost for a given quantity.
 * Program: Track Inventory of Items
 */

class Item {
    int itemCode;
    String itemName;
    double price;

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }

    // Method to calculate total cost
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {

        Item item = new Item();

        item.itemCode = 101;
        item.itemName = "Laptop";
        item.price = 50000;

        int quantity = 3;

        item.displayDetails();

        double totalCost = item.calculateTotalCost(quantity);

        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
}