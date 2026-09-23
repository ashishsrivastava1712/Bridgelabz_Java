/*
 * Problem 8 - Student Marks, Percentage and Grade
 *
 * Create a program to take input marks of students in 3 subjects
 * Physics, Chemistry, and Maths. Compute the percentage and then
 * calculate the grade as per the given guidelines.
 *
 * Hint =>
 * a. Take input for the number of students.
 * b. Create arrays to store marks, percentages, and grades.
 * c. Take input for marks of students in Physics, Chemistry, and Maths.
 *    If the marks are negative, ask the user to enter positive values
 *    and decrement the index.
 * d. Calculate the percentage and grade of the students based on percentage.
 * e. Display the marks, percentages, and grades of each student.
 *
 * Author: Ashish Srivastava
 * Date: 23-09-2026
 */

package JavaArrays.Level2;

import java.util.Scanner;

public class StudentMarksGrade {
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

        // Create arrays to store marks of three subjects
        double[] physics = new double[number];
        double[] chemistry = new double[number];
        double[] maths = new double[number];

        // Create arrays to store percentage and grade
        double[] percentage = new double[number];
        String[] grade = new String[number];

        // Take input for marks of each student
        for (int i = 0; i < physics.length; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            // Take Physics marks
            System.out.print("Enter Physics marks: ");
            physics[i] = input.nextDouble();

            // Take Chemistry marks
            System.out.print("Enter Chemistry marks: ");
            chemistry[i] = input.nextDouble();

            // Take Maths marks
            System.out.print("Enter Maths marks: ");
            maths[i] = input.nextDouble();

            // Validate marks
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.err.println("Marks cannot be negative. Enter again.");
                i--;
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < physics.length; i++) {

            // Calculate percentage
            percentage[i] =
                    (physics[i] + chemistry[i] + maths[i]) / 3;

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

        for (int i = 0; i < physics.length; i++) {

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics: " + physics[i]);
            System.out.println("Chemistry: " + chemistry[i]);
            System.out.println("Maths: " + maths[i]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }

        // Close the Scanner Object
        input.close();
    }
}