// Program to handle Book details
/*
 * Author: Ashish Srivastava
 * Problem Description: Write a program to create a Book class with
 * attributes title, author, and price. Add a method to display the
 * book details.
 * Program: Handle Book Details
 */

class Book {
    String title;
    String author;
    double price;

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }

    public static void main(String[] args) {

        Book book = new Book();

        book.title = "Java Programming";
        book.author = "James Gosling";
        book.price = 599;

        book.displayDetails();
    }
}