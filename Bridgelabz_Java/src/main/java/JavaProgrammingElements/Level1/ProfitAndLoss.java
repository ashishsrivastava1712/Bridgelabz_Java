/*
 * Problem 4 - GCR Programming Elements Level 1
 * Create a program to calculate the profit and loss in number and percentage
 * based on the cost price of INR 129 and the selling price of INR 191.
 *
 * Hint =>
 * a. Use a single print statement to display multiline text and variables.
 * b. Profit = selling price - cost price
 * c. Profit Percentage = profit / cost price * 100
 *
 * I/P => NONE
 * O/P =>
 * The Cost Price is INR ___ and Selling Price is INR ___
 * The Profit is INR ___ and the Profit Percentage is ___
 *
 * Author: Ashish Srivastava
 * Date: 21-09-2026
 */

package JavaProgrammingElements.Level1;

public class ProfitAndLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = sellingPrice - costPrice;
        double profitPercentage = (double) profit / costPrice * 100;

        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
                "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}