import java.util.Scanner;
/*
Problem 17 - GCR Control Flow Level 1
Create a program to find the bonus of employees based on their years of service.
Hint => 
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.

* Author : Ashish Srivastava
* Date : 25-09-2026*/  
class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary:");
        double salary = scanner.nextDouble();
        System.out.print("Enter years of service:");
        int yearsOfService = scanner.nextInt();
        double bonus = 0.0;
        double bonusPercent = 5.0;
        if (yearsOfService > 5) {
            bonus = (salary * bonusPercent) / 100;
        }
        System.out.println("The bonus amount is INR " + bonus);
        scanner.close();
    }
}