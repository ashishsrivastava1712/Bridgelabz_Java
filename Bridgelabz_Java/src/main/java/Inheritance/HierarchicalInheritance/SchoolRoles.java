package Inheritance.HierarchicalInheritance;

/*
 * Author: Ashish Srivastava
 * Problem Description: Create a school hierarchy with Person as
 * the superclass and Teacher, Student, and Staff as subclasses.
 */

public class SchoolRoles {

    // Parent class
    static class Person {

        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Generic role
        void displayRole() {
            System.out.println("Person");
        }
    }

    // Child class 1
    static class Teacher extends Person {

        String subject;

        Teacher(String name, int age, String subject) {

            super(name, age);
            this.subject = subject;
        }

        @Override
        void displayRole() {

            System.out.println(
                    name + " is a Teacher teaching "
                            + subject
            );
        }
    }

    // Child class 2
    static class Student extends Person {

        String grade;

        Student(String name, int age, String grade) {

            super(name, age);
            this.grade = grade;
        }

        @Override
        void displayRole() {

            System.out.println(
                    name + " is a Student in grade "
                            + grade
            );
        }
    }

    // Child class 3
    static class Staff extends Person {

        String department;

        Staff(String name, int age, String department) {

            super(name, age);
            this.department = department;
        }

        @Override
        void displayRole() {

            System.out.println(
                    name + " is Staff of "
                            + department
                            + " department"
            );
        }
    }

    public static void main(String[] args) {

        // Parent reference pointing to child objects
        Person[] people = {
                new Teacher("Mr. Sharma", 40, "Java"),
                new Student("Ashish", 21, "B.Tech"),
                new Staff("Ramesh", 35, "Administration")
        };

        // Runtime polymorphism
        for (Person person : people) {
            person.displayRole();
        }
    }
}