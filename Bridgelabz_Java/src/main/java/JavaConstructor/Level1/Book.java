/*
 * Author: Ashish Srivastava
 * Problem Description: Create a Book class with attributes title, author,
 * and price. Provide both default and parameterized constructors.
 */

class Book {

    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Book defaultBook = new Book();

        Book parameterizedBook =
                new Book("Java Programming", "James Gosling", 599.0);

        System.out.println("Default Book:");
        defaultBook.displayDetails();

        System.out.println("\nParameterized Book:");
        parameterizedBook.displayDetails();
    }
}