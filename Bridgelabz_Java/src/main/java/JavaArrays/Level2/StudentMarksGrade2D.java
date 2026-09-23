/*
 * Problem 9 - Student Marks, Percentage and Grade Using 2D Array
 *
 * Rewrite the above program to store the marks of the students in
 * Physics, Chemistry, and Maths in a 2D array and then compute
 * the percentage and grade.
 *
 * Hint =>
 * a. All the steps are the same as Problem 8 except the marks are
 *    stored in a 2D array.
 * b. Use the 2D array to calculate the percentages and grades.
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level2;

import java.util.Scanner;

public class StudentMarksGrade2D {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter number of students: ");
        int number = input.nextInt();

        // Validate the number of students
        if (number <= 0) {
            System.err.println("Invalid number of students.");
            System.exit(0);
        }

        // Create a 2D array to store Physics, Chemistry and Maths marks
        double[][] marks = new double[number][3];

        // Create arrays to store percentage and grade
        double[] percentage = new double[number];
        String[] grade = new String[number];

        // Take input for marks of each student
        for (int i = 0; i < marks.length; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            // Take Physics marks
            System.out.print("Enter Physics marks: ");
            marks[i][0] = input.nextDouble();

            // Take Chemistry marks
            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = input.nextDouble();

            // Take Maths marks
            System.out.print("Enter Maths marks: ");
            marks[i][2] = input.nextDouble();

            // Validate marks
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.err.println("Marks cannot be negative. Enter again.");
                i--;
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < marks.length; i++) {

            // Calculate percentage using the 2D array
            percentage[i] =
                    (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            // Calculate grade based on percentage
            if (percentage[i] >= 90) {
                grade[i] = "A";
            } else if (percentage[i] >= 80) {
                grade[i] = "B";
            } else if (percentage[i] >= 70) {
                grade[i] = "C";
            } else if (percentage[i] >= 60) {
                grade[i] = "D";
            } else if (percentage[i] >= 50) {
                grade[i] = "E";
            } else {
                grade[i] = "F";
            }
        }

        // Display marks, percentage and grade
        System.out.println("\nStudent Details:");

        for (int i = 0; i < marks.length; i++) {

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }

        // Close the Scanner Object
        input.close();
    }
}