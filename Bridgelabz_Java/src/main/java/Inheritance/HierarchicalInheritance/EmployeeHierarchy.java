package Inheritance.HierarchicalInheritance;

/*
 * Author: Ashish Srivastava
 * Problem Description: Create an Employee hierarchy with Manager,
 * Developer, and Intern subclasses having unique attributes.
 */

public class EmployeeHierarchy {

    static class Employee {
        String name;
        int id;
        double salary;

        Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Salary: " + salary);
        }
    }

    static class Manager extends Employee {
        int teamSize;

        Manager(String name, int id, double salary, int teamSize) {
            super(name, id, salary);
            this.teamSize = teamSize;
        }

        @Override
        void displayDetails() {
            super.displayDetails();
            System.out.println("Team Size: " + teamSize);
        }
    }

    static class Developer extends Employee {
        String programmingLanguage;

        Developer(String name, int id, double salary,
                  String programmingLanguage) {
            super(name, id, salary);
            this.programmingLanguage = programmingLanguage;
        }

        @Override
        void displayDetails() {
            super.displayDetails();
            System.out.println("Programming Language: " + programmingLanguage);
        }
    }

    static class Intern extends Employee {
        String collegeName;

        Intern(String name, int id, double salary, String collegeName) {
            super(name, id, salary);
            this.collegeName = collegeName;
        }

        @Override
        void displayDetails() {
            super.displayDetails();
            System.out.println("College: " + collegeName);
        }
    }

    public static void main(String[] args) {

        Employee[] employees = {
                new Manager("Ashish", 101, 90000, 8),
                new Developer("Rahul", 102, 70000, "Java"),
                new Intern("Aman", 103, 20000, "SRMIST")
        };

        for (Employee employee : employees) {
            System.out.println("\n--- Employee Details ---");
            employee.displayDetails();
        }
    }
}