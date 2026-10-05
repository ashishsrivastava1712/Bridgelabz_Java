package Inheritance.HybridInheritance;

/*
 * Author: Ashish Srivastava
 * Problem Description: Model a restaurant system using a combination
 * of class inheritance and an interface.
 */

public class RestaurantManagement {

    // Parent class
    static class Person {

        String name;
        int id;

        Person(String name, int id) {
            this.name = name;
            this.id = id;
        }

        // Common Person information
        void displayPerson() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
        }
    }

    /*
     * Interface represents a common behavior.
     * Any Worker must implement performDuties().
     */
    interface Worker {

        void performDuties();
    }

    // Chef inherits Person and implements Worker
    static class Chef extends Person implements Worker {

        Chef(String name, int id) {
            super(name, id);
        }

        // Implementation of interface method
        @Override
        public void performDuties() {

            System.out.println(
                    name + " prepares food."
            );
        }
    }

    // Waiter also inherits Person and implements Worker
    static class Waiter extends Person implements Worker {

        Waiter(String name, int id) {
            super(name, id);
        }

        // Implementation of interface method
        @Override
        public void performDuties() {

            System.out.println(
                    name + " serves customers."
            );
        }
    }

    public static void main(String[] args) {

        Chef chef = new Chef("Rahul", 101);

        Waiter waiter = new Waiter("Aman", 102);

        // Inherited method from Person
        chef.displayPerson();

        // Implemented method from Worker
        chef.performDuties();

        System.out.println();

        waiter.displayPerson();
        waiter.performDuties();
    }
}