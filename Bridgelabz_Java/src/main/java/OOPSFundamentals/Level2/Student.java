/*
 * Author: Ashish Srivastava
 * Problem Description: Create a Student class with attributes name,
 * rollNumber, and marks. Add methods to calculate the grade based on
 * marks and display the student's details and grade.
 * Program: Simulate Student Report
 */

class Student {
    String name;
    int rollNumber;
    double marks;

    // Method to calculate grade
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Ashish";
        student.rollNumber = 101;
        student.marks = 85;

        student.displayDetails();
    }
}