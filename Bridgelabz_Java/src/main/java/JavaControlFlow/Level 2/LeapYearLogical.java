import java.util.Scanner;
/*
Problem 2 - GCR Control Flow Level 2
Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
* Author : Ashish Srivastava
* Date : 25-09-2026*/
class LeapYearLogical {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year:");
        int year = scanner.nextInt();
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year < 1582) {
            System.out.println("The year must be 1582 or later.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        scanner.close();
    }
}
