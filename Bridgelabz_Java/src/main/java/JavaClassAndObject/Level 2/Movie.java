/*
Problem 4 : Java Class And Object Level 2
Program to Model a Movie Ticket Booking System
Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
Book a ticket (assign seat and update price).
Display ticket details.
Explanation: The MovieTicket class organizes ticket information with attributes. The methods handle booking logic and display ticket details.
Author : Ashish Srivastava
Date: 03/10/2026*/

import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName; 
        this.seatNumber = seatNumber;
        this.price = price;
    }
    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
    public static void main(String args[]) {
        MovieTicket m = new MovieTicket();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the movie name: ");
        String movieName = scanner.nextLine();
        System.out.print("Enter the seat number: ");
        int seatNumber = scanner.nextInt();
        System.out.print("Enter the price: ");
        double price = scanner.nextDouble(); 
        m.bookTicket(movieName, seatNumber, price);
        m.displayTicket();
        scanner.close();
    }
}