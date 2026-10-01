/*
 * Author: Ashish Srivastava
 * Problem Description: Design a Course class with instance variables
 * courseName, duration, and fee, and a class variable instituteName
 * common for all courses. Add methods to display course details and
 * update the institute name for all courses.
 */

class Course {

    // Instance variables
    String courseName;
    int duration;
    double fee;

    // Class variable
    static String instituteName = "BridgeLabz";

    // Parameterized constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method
    static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {

        Course course1 =
                new Course("Java", 3, 15000);

        Course course2 =
                new Course("Python", 4, 18000);

        System.out.println("Before Updating Institute Name:");

        course1.displayCourseDetails();
        System.out.println();

        course2.displayCourseDetails();

        Course.updateInstituteName("BridgeLabz Technologies");

        System.out.println("\nAfter Updating Institute Name:");

        course1.displayCourseDetails();
        System.out.println();

        course2.displayCourseDetails();
    }
}