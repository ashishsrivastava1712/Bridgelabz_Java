/*
 * Problem 6 - GCR Java Programming Elements Level 2
 * Write a program to find the total income of a person
 * by taking salary and bonus from user.
 *
 * I/P => salary, bonus
 * O/P => The salary is INR ___ and bonus is INR ___.
 *        Hence Total Income is INR ___
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salary = input.nextDouble();
        double bonus = input.nextDouble();

        double totalIncome = salary + bonus;

        System.out.println("The salary is INR " + salary +
                " and bonus is INR " + bonus +
                ". Hence Total Income is INR " + totalIncome);
    }
}