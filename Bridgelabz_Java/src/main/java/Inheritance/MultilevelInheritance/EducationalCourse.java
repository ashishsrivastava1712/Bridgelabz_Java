package Inheritance.MultilevelInheritance;

/*
 * Author: Ashish Srivastava
 * Problem Description: Create a course hierarchy:
 * Course -> OnlineCourse -> PaidOnlineCourse.
 */

public class EducationalCourse {

    // Level 1
    static class Course {

        String courseName;
        int duration;

        Course(String courseName, int duration) {
            this.courseName = courseName;
            this.duration = duration;
        }

        // Displays common course details
        void displayCourse() {
            System.out.println("Course: " + courseName);
            System.out.println(
                    "Duration: " + duration + " months"
            );
        }
    }

    // Level 2
    static class OnlineCourse extends Course {

        String platform;
        boolean isRecorded;

        OnlineCourse(String courseName,
                     int duration,
                     String platform,
                     boolean isRecorded) {

            // Initialize inherited fields
            super(courseName, duration);

            this.platform = platform;
            this.isRecorded = isRecorded;
        }

        // Override parent method
        @Override
        void displayCourse() {

            // Display Course information
            super.displayCourse();

            System.out.println("Platform: " + platform);
            System.out.println("Recorded: " + isRecorded);
        }
    }

    // Level 3
    static class PaidOnlineCourse extends OnlineCourse {

        double fee;
        double discount;

        PaidOnlineCourse(String courseName,
                         int duration,
                         String platform,
                         boolean isRecorded,
                         double fee,
                         double discount) {

            // Initialize OnlineCourse attributes
            super(courseName, duration, platform, isRecorded);

            this.fee = fee;
            this.discount = discount;
        }

        // Override displayCourse()
        @Override
        void displayCourse() {

            // Display all inherited information
            super.displayCourse();

            // Display own information
            System.out.println("Fee: ₹" + fee);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {

        PaidOnlineCourse course =
                new PaidOnlineCourse(
                        "Java OOP",
                        3,
                        "BridgeLabz",
                        true,
                        10000,
                        20
                );

        course.displayCourse();
    }
}