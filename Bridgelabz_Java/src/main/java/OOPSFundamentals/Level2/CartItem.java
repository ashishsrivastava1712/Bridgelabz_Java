/*
 * Author: Ashish Srivastava
 * Problem Description: Create a CartItem class with attributes itemName,
 * price, and quantity. Add methods to add an item to the cart, remove
 * an item from the cart, and display the total cost.
 * Program: Simulate a Shopping Cart
 */

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Method to add an item to the cart
    public void addItem(int quantityToAdd) {
        quantity = quantity + quantityToAdd;
        System.out.println("Item Added: " + quantityToAdd);
    }

    // Method to remove an item from the cart
    public void removeItem(int quantityToRemove) {
        if (quantityToRemove <= quantity) {
            quantity = quantity - quantityToRemove;
            System.out.println("Item Removed: " + quantityToRemove);
        } else {
            System.out.println("Cannot remove more items than available");
        }
    }

    // Method to display total cost
    public void displayTotalCost() {
        double totalCost = price * quantity;

        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {

        CartItem cartItem = new CartItem();

        cartItem.itemName = "Laptop";
        cartItem.price = 50000;
        cartItem.quantity = 1;

        cartItem.addItem(2);
        cartItem.removeItem(1);

        cartItem.displayTotalCost();
    }
}