/*
 * Problem 1 - Student Voting Eligibility
 *
 * Write a program to take user input for the age of all 10 students
 * in a class and check whether the student can vote depending on
 * whether his/her age is greater than or equal to 18.
 *
 * Hint =>
 * a. Define an array of 10 integer elements and take user input
 *    for the student's age.
 * b. Loop through the array using the length property.
 * c. If the age is negative, print an invalid age.
 * d. If age is 18 or above, print that the student can vote.
 * e. Otherwise, print that the student cannot vote.
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level1;

import java.util.Scanner;

public class StudentVotingEligibility {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Declare an integer array to store ages of 10 students
        int[] ages = new int[10];

        // Take input for the age of each student
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        // Check voting eligibility for each student
        for (int i = 0; i < ages.length; i++) {

            // Validate the age
            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            }

            // Check whether the student can vote
            else if (ages[i] >= 18) {
                System.out.println(
                        "The student with the age " + ages[i] + " can vote."
                );
            }

            // Student is below voting age
            else {
                System.out.println(
                        "The student with the age " + ages[i] + " cannot vote."
                );
            }
        }

        // Close the Scanner object
        input.close();
    }
}