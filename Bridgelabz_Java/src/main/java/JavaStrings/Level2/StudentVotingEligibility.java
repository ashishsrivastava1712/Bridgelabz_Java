/*
 * Program to take the age of students and check whether
 * each student can vote based on age.
 *
 * Hint =>
 * 1. Create a method to generate random 2-digit ages.
 * 2. Create a method to check voting eligibility.
 * 3. Return age and can/cannot vote in a 2D String array.
 * 4. Display the 2D array in tabular format.
 *
 * Author: Ashish Srivastava
 */

package JavaStrings.Level2;

import java.util.Scanner;

public class StudentVotingEligibility {

    // Method to generate random 2-digit ages
    public static int[] generateAges(int numberOfStudents) {

        int[] ages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = (int) (Math.random() * 90) + 10;
        }

        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            int age = ages[i];

            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "false";
            } else if (age >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayTable(String[][] result) {

        System.out.println("\nAge\tCan Vote");

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    result[i][0] + "\t" + result[i][1]
            );
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Generate ages
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] result = checkVotingEligibility(ages);

        // Display result
        displayTable(result);

        input.close();
    }
}