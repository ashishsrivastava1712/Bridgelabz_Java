/*
 * Author: Ashish
 * Problem: Library Management System
 */

public class Book {

    static String libraryName = "Central Library";

    String title;
    String author;
    final int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {

        Book book = new Book("Java Programming", "James Gosling", 1001);

        displayLibraryName();

        if (book instanceof Book) {
            book.displayDetails();
        }
    }
}