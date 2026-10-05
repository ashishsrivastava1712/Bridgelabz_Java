package ObjectModelling.Modelling;

import java.util.ArrayList;

/*
 * Author: Ashish
 * Problem Description: Demonstrate aggregation between Library and Book.
 */

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Library {
    String libraryName;
    ArrayList<Book> books = new ArrayList<>();

    Library(String libraryName) {
        this.libraryName = libraryName;
    }

    void addBook(Book book) {
        books.add(book);
    }

    void displayBooks() {
        System.out.println("Library: " + libraryName);

        for (Book book : books) {
            book.displayBookDetails();
        }
    }
}

public class LibraryAggregation {
    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "James Gosling");
        Book book2 = new Book("Clean Code", "Robert Martin");

        Library library1 = new Library("Central Library");
        Library library2 = new Library("City Library");

        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book1);

        library1.displayBooks();
        library2.displayBooks();
    }
}