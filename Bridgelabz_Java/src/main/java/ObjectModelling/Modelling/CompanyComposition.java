package ObjectModelling.Modelling;

import java.util.ArrayList;

/*
 * Author: Ashish
 * Problem Description: Demonstrate composition between Company,
 * Department, and Employee.
 */

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void displayEmployee() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String departmentName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String departmentName) {
        this.departmentName = departmentName;
    }

    void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    void displayDepartment() {
        System.out.println("Department: " + departmentName);

        for (Employee employee : employees) {
            employee.displayEmployee();
        }
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    void displayCompany() {
        System.out.println("Company: " + companyName);

        for (Department department : departments) {
            department.displayDepartment();
        }
    }

    void deleteCompany() {
        departments.clear();

        System.out.println("Company deleted.");
        System.out.println("Departments and employees are removed.");
    }
}

public class CompanyComposition {
    public static void main(String[] args) {

        Company company = new Company("Tech Solutions");

        company.addDepartment("Development");
        company.addDepartment("Human Resources");

        company.displayCompany();

        company.deleteCompany();
    }
}