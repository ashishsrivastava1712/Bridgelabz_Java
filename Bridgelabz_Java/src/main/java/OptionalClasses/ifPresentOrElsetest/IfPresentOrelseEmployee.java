/*
 * Question: Implementation and demonstration of If Present Orelse Employee
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for If Present Orelse Employee.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package OptionalClasses.ifPresentOrElsetest;

import java.util.*;

public class IfPresentOrelseEmployee 
{
    
    public static void main(String[] args) 
    {
        Optional<Employee> emp1= Optional.of(new Employee("Ashish", 1000000.0));
        emp1.ifPresentOrElse(e->{System.out.println(e.getName());System.out.println(e.getSalary());},()->System.out.println("Well Bro we dont have any employee here you knowww hahahaahahahah"));
        Optional<Employee> emp2= Optional.empty();
        emp2.ifPresentOrElse(e->{System.out.println(e.getName());System.out.println(e.getSalary());},()->System.out.println("Well Bro we dont have any employee here you knowww hahahaahahahah"));
    }
   
}
 
class Employee
    {
        private String name;
        private double Salary;
        Employee (String name, Double Salary)
        {
            this.name=name;
            this.Salary=Salary;
        }
        public String getName()
        {
            return name;
        }
        public double getSalary()
        {
            return Salary;
        }
    }
