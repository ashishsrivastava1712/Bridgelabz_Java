/*
 * Author: Ashish
 * Problem: University Student Management
 */

public class Student {

    static String universityName = "SRM University";
    static int totalStudents = 0;

    String name;
    final int rollNumber;
    String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    public void updateGrade(String newGrade) {
        this.grade = newGrade;
    }

    public static void main(String[] args) {

        Student student =
                new Student("Ashish", 101, "A");

        if (student instanceof Student) {
            student.displayDetails();

            student.updateGrade("A+");

            System.out.println("\nAfter Grade Update:");
            student.displayDetails();
        }

        displayTotalStudents();
    }
}