/*
 * Problem 7 - Student Vote Checker
 *
 * Take user input for the age of 10 students and check whether
 * each student can vote.
 *
 * Author: Ashish Srivastava
 */

package JavaMethods.Level2;

import java.util.Scanner;

public class StudentVoteChecker {

    // Check whether a student can vote
    public boolean canStudentVote(int age) {

        // Validate negative age
        if (age < 0) {
            return false;
        }

        // Check voting eligibility
        if (age >= 18) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Create object of StudentVoteChecker
        StudentVoteChecker studentVoteChecker = new StudentVoteChecker();

        // Create an array to store ages of 10 students
        int[] ages = new int[10];

        // Take input for the age of each student
        for (int i = 0; i < ages.length; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            // Check whether the student can vote
            boolean canVote = studentVoteChecker.canStudentVote(ages[i]);

            // Display the result
            if (canVote) {
                System.out.println("The student with age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with age " + ages[i] + " cannot vote.");
            }
        }

        // Close Scanner Object
        input.close();
    }
}