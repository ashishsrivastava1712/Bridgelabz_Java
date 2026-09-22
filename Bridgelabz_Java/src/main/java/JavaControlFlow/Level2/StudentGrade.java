/*
 * Problem 3 - Calculate Percentage and Grade
 *
 * Write a program to input marks and 3 subjects physics, chemistry and maths.
 * Compute the percentage and then calculate the grade as per the following guidelines.
 *
 * Grade    Remarks                                      Marks
 * A        (Level 4, above agency-normalized standards) 80% and above
 * B        (Level 3, at agency-normalized standards)   70-79%
 * C        (Level 2, below, but approaching agency-    60-69%
 *          normalized standards)
 * D        (Level 1, well below agency-normalized      50-59%
 *          standards)
 * E        (Level 1-, too below agency-normalized      40-49%
 *          standards)
 * R        (Remedial standards)                         39% and below
 *
 * Hint =>
 * a. Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks.
 *
 * Author: Ashish Srivastava
 * Date: 22-09-2026
 */

package JavaControlFlow.Level2;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get marks for Physics, Chemistry, and Maths
        double physicsMarks = input.nextDouble();
        double chemistryMarks = input.nextDouble();
        double mathsMarks = input.nextDouble();

        // Calculate the average mark
        double averageMark = (physicsMarks + chemistryMarks + mathsMarks) / 3;

        // Declare variables for grade and remarks
        String grade;
        String remarks;

        // Calculate grade and remarks based on average marks
        if (averageMark >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (averageMark >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (averageMark >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (averageMark >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (averageMark >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display the average mark, grade, and remarks
        System.out.println("Average Mark: " + averageMark);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        // Close the Scanner
        input.close();
    }
}