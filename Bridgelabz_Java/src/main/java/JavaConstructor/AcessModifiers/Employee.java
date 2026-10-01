/*
 * Author: Ashish Srivastava
 * Problem Description: Create an Employee class with public
 * employeeID, protected department, and private salary. Provide
 * a public method to modify salary. Create a Manager subclass
 * to demonstrate access to employeeID and department.
 */

class Employee {

    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// Subclass
class Manager extends Employee {

    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Demonstrating public and protected members
    void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
}

class EmployeeDemo {

    public static void main(String[] args) {

        Manager manager =
                new Manager(
                        101,
                        "IT",
                        75000
                );

        manager.displayDetails();

        manager.setSalary(85000);

        System.out.println("Updated Salary: "
                + manager.getSalary());
    }
}