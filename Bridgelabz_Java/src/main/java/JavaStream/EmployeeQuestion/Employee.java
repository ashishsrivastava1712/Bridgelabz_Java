/*
 * Question: Implementation and demonstration of Employee
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Employee.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
/**
 * 1. Find all employees working in IT.
2. Find employees whose salary is greater than ₹70,000.
3. Sort employees by salary in ascending order.
4. Sort employees by salary in descending order.
5. Find the employee with the highest salary.
6. Find the employee with the lowest salary.
7. Find the second-highest distinct salary.
8. Group employees by department.
9. Count employees in each department.
10. Find the average salary.
11. Find the total salary paid by each department.
12. Find the highest-paid employee in each department.
13. Find employees earning more than the overall average salary.
14. Return the top three highest-paid employees.
15. Convert the employee list into a map of employee names to salaries.
lets do these qus
 */
package JavaStream.EmployeeQuestion;

public class Employee 
{
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Method to handle get id operations
    public int getId() {
        return id;
    }

    // Method to handle set id operations
    public void setId(int id) {
        this.id = id;
    }

    // Method to handle get name operations
    public String getName() {
        return name;
    }

    // Method to handle set name operations
    public void setName(String name) {
        this.name = name;
    }

    // Method to handle get department operations
    public String getDepartment() {
        return department;
    }

    // Method to handle set department operations
    public void setDepartment(String department) {
        this.department = department;
    }

    // Method to handle get salary operations
    public double getSalary() {
        return salary;
    }

    // Method to handle set salary operations
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
