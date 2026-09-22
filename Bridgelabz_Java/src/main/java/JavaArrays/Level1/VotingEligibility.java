/*
 * Problem 5 - Voting Eligibility
 *
 * Write a program to check whether a person can vote, depending on whether his/her age is
 * greater than or equal to 18.
 *
 * Hint =>
 * a. Get integer input from the user and store it in the age variable.
 * b. If the person is 18 or older, print "The person can vote." Otherwise, print "The person
 * cannot vote."
 *
 * I/P => age
 *
 * O/P => If the person's age is greater or equal to 18 then the output is
 * The person's age is ___ and can vote.
 * Otherwise
 * The person's age is ___ and cannot vote.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level1;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the age from the user
        int age = input.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the Scanner
        input.close();
    }
}