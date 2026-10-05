package EncapsulationPolymorphismInterfaceAbstractClass;

import java.util.ArrayList;
import java.util.List;

/*
 * Author: Ashish Srivastava
 * Problem Description:
 * Build an employee management system using abstract classes,
 * encapsulation, interfaces and polymorphism.
 */

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        // Create employee objects
        Employee employee1 = new FullTimeEmployee("Ashish", 101, 60000);
        Employee employee2 = new PartTimeEmployee("Rahul", 102, 30000);

        // Polymorphism: Employee reference holding child objects
        employee1.displayDetails();
        employee2.displayDetails();
    }
}

// Abstract class
abstract class Employee {

    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Encapsulation through getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Abstract method
    abstract void displayDetails();
}

// Child class
class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    void displayDetails() {
        System.out.println("Full-Time Employee");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Salary: " + getSalary());
        System.out.println();
    }
}

// Another child class
class PartTimeEmployee extends Employee {

    public PartTimeEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    void displayDetails() {
        System.out.println("Part-Time Employee");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Salary: " + getSalary());
    }
}