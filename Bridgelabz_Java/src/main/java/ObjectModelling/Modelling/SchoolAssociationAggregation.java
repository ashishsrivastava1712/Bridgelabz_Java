package ObjectModelling.Modelling;

import java.util.ArrayList;

/*
 * Author: Ashish
 * Problem Description: Demonstrate association between Student and Course
 * and aggregation between School and Student.
 */

class SchoolCourse {
    String courseName;
    ArrayList<SchoolStudent> students = new ArrayList<>();

    SchoolCourse(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(SchoolStudent student) {
        students.add(student);
    }

    void displayStudents() {
        System.out.println("Students in " + courseName + ":");

        for (SchoolStudent student : students) {
            System.out.println(student.name);
        }
    }
}

class SchoolStudent {
    String name;
    ArrayList<SchoolCourse> courses = new ArrayList<>();

    SchoolStudent(String name) {
        this.name = name;
    }

    void enrollCourse(SchoolCourse course) {
        courses.add(course);
        course.addStudent(this);
    }

    void viewCourses() {
        System.out.println(name + "'s Courses:");

        for (SchoolCourse course : courses) {
            System.out.println(course.courseName);
        }
    }
}

class School {
    String schoolName;
    ArrayList<SchoolStudent> students = new ArrayList<>();

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(SchoolStudent student) {
        students.add(student);
    }
}

public class SchoolAssociationAggregation {
    public static void main(String[] args) {

        School school = new School("ABC School");

        SchoolStudent student1 = new SchoolStudent("Ashish");
        SchoolStudent student2 = new SchoolStudent("Rahul");

        SchoolCourse java = new SchoolCourse("Java");
        SchoolCourse python = new SchoolCourse("Python");

        school.addStudent(student1);
        school.addStudent(student2);

        student1.enrollCourse(java);
        student1.enrollCourse(python);

        student2.enrollCourse(java);

        student1.viewCourses();
        java.displayStudents();
    }
}