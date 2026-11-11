import java.util.Scanner;
/* 
Problem 3- GCR Control Flow Level 1
Write a program to check if the first, second, or third number is the largest of the three.
I/P => number1, number2, number3
O/P => 
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___
Author : Ashish Srivastava
* Date : 25-09-2026*/

class LargestOfThree {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1:");
        int number1 = scanner.nextInt();
        System.out.print("Enter number2:");
        int number2 = scanner.nextInt();
        System.out.print("Enter number3:");
        int number3 = scanner.nextInt();
        boolean firstLargest = number1 >= number2 && number1 >= number3;
        boolean secondLargest = number2 >= number1 && number2 >= number3;
        boolean thirdLargest = number3 >= number1 && number3 >= number2;
        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);
        scanner.close();
    }
}