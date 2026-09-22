/*
 * Problem 1 - Student Voting Eligibility
 *
 * Write a program to take user input for the age of all 10 students in a class and check
 * whether the student can vote depending on his/her age is greater or equal to 18.
 *
 * Hint =>
 * a. Define an array of 10 integer elements and take user input for the student's age.
 * b. Loop through the array using the length property and for the element of the array check
 *    If the age is a negative number print an invalid age and if 18 or above, print The student
 *    with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaArrays.Level1;

import java.util.Scanner;

public class StudentVotingEligibility {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Define an integer array to store the ages of 10 students
        int[] ages = new int[10];

        // Take user input for the age of each student
        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();
        }

        // Check the voting eligibility of each student
        for (int i = 0; i < ages.length; i++) {

            // Check if the age is negative
            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);

                // Check if the student is eligible to vote
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");

                // Student is not eligible to vote
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        // Close the Scanner
        input.close();
    }
}