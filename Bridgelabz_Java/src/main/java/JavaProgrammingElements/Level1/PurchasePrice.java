
/*
 * Problem 15 - GCR Control Flow Level 1
 * Write a program to input the unit price of an item and the quantity
 * to be bought. Then, calculate the total price.
 *
 * I/P => unitPrice, quantity
 * O/P => The total purchase price is INR ___ if the quantity ___
 *        and unit price is INR ___
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice
                + " if the quantity " + quantity
                + " and unit price is INR " + unitPrice);
    }
}