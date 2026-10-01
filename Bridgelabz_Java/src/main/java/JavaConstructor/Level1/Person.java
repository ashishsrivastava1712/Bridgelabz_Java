/*
 * Author: Ashish Srivastava
 * Problem Description: Create a Person class with a copy constructor
 * that clones another person's attributes.
 */

class Person {

    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }

    // Method to display person details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Person person1 = new Person("Ashish", 21);

        Person person2 = new Person(person1);

        System.out.println("Original Person:");
        person1.displayDetails();

        System.out.println("\nCopied Person:");
        person2.displayDetails();
    }
}