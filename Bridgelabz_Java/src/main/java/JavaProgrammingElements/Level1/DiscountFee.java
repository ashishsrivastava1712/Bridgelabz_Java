/*
 * Problem 6 - GCR Programming Elements Level 1
 * The University is charging the student a fee of INR 125000 for the course.
 * The University is willing to offer a discount of 10%.
 * Write a program to find the discounted amount and discounted price
 * the student will pay for the course.
 *
 * O/P => The discount amount is INR ___ and final discounted fee is INR ___
 *
 * Author: Ashish Srivastava
 * Date: 21-09-2026
 */

package JavaProgrammingElements.Level1;

public class DiscountFee {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;

        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }
}