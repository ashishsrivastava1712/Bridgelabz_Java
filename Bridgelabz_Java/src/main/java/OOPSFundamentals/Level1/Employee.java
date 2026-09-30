// Program to display Employee details
/*
 * Author: Ashish Srivastava
 * Problem Description: Write a program to create an Employee class with
 * attributes name, id, and salary. Add a method to display the details.
 * Program: Display Employee Details
 */
class Employee {
    String name;
    int id;
    double salary;

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.name = "Ashish";
        employee.id = 101;
        employee.salary = 50000;

        employee.displayDetails();
    }
}