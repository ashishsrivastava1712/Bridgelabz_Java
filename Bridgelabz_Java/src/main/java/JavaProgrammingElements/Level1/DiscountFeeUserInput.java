/*
 * Problem 9 - Java Programming Elements Level 1
 * Write a new program similar to the program #6 but take user input
 * for Student Fee and University Discount.
 *
 * I/P => fee, discountPercent
 * O/P => The discount amount is INR ___ and final discounted fee is INR ___
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class DiscountFeeUserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fee = input.nextDouble();
        double discountPercent = input.nextDouble();

        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount
                + " and final discounted fee is INR " + finalFee);
    }
}