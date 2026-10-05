package ObjectModelling.Modelling;

import java.util.ArrayList;

/*
 * Author: Ashish
 * Problem Description: Demonstrate association and aggregation
 * between Student, Professor, and Course.
 */

class UniversityStudent {
    String name;
    ArrayList<UniversityCourse> courses = new ArrayList<>();

    UniversityStudent(String name) {
        this.name = name;
    }

    void enrollCourse(UniversityCourse course) {
        courses.add(course);
        course.addStudent(this);

        System.out.println(
                name + " enrolled in " +
                        course.courseName
        );
    }
}

class Professor {
    String name;
    ArrayList<UniversityCourse> courses = new ArrayList<>();

    Professor(String name) {
        this.name = name;
    }

    void addCourse(UniversityCourse course) {
        courses.add(course);
    }

    void displayCourses() {

        System.out.println(name + " teaches:");

        for (UniversityCourse course : courses) {
            System.out.println(course.courseName);
        }
    }
}

class UniversityCourse {
    String courseName;
    Professor professor;
    ArrayList<UniversityStudent> students = new ArrayList<>();

    UniversityCourse(String courseName) {
        this.courseName = courseName;
    }

    void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.addCourse(this);

        System.out.println(
                professor.name +
                        " assigned to " +
                        courseName
        );
    }

    void addStudent(UniversityStudent student) {
        students.add(student);
    }

    void displayCourseDetails() {

        System.out.println("\nCourse: " + courseName);

        if (professor != null) {
            System.out.println(
                    "Professor: " + professor.name
            );
        }

        System.out.println("Students:");

        for (UniversityStudent student : students) {
            System.out.println(student.name);
        }
    }
}

public class UniversityManagement {
    public static void main(String[] args) {

        UniversityStudent student = new UniversityStudent("Ashish");

        Professor professor =
                new Professor("Dr. Sharma");

        UniversityCourse java =
            new UniversityCourse("Java Programming");

        UniversityCourse database =
            new UniversityCourse("Database Management");

        student.enrollCourse(java);
        student.enrollCourse(database);

        java.assignProfessor(professor);

        java.displayCourseDetails();

        professor.displayCourses();
    }
}