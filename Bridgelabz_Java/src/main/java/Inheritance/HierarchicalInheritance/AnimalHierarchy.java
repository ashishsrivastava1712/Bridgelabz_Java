package Inheritance.HierarchicalInheritance;

/*
 * Author: Ashish Srivastava
 * Problem Description: Create an Animal hierarchy with Dog, Cat,
 * and Bird subclasses. Demonstrate method overriding and polymorphism.
 */

public class AnimalHierarchy {

    // Parent class
    static class Animal {

        String name;
        int age;

        Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Common method
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Child class 1
    static class Dog extends Animal {

        Dog(String name, int age) {

            // Calls Animal constructor
            super(name, age);
        }

        // Dog overrides parent's method
        @Override
        void makeSound() {
            System.out.println(name + " says: Woof!");
        }
    }

    // Child class 2
    static class Cat extends Animal {

        Cat(String name, int age) {
            super(name, age);
        }

        // Cat overrides parent's method
        @Override
        void makeSound() {
            System.out.println(name + " says: Meow!");
        }
    }

    // Child class 3
    static class Bird extends Animal {

        Bird(String name, int age) {
            super(name, age);
        }

        // Bird overrides parent's method
        @Override
        void makeSound() {
            System.out.println(name + " says: Chirp!");
        }
    }

    public static void main(String[] args) {

        /*
         * Polymorphism:
         * Parent reference can hold child objects.
         */
        Animal[] animals = {
                new Dog("Bruno", 3),
                new Cat("Kitty", 2),
                new Bird("Coco", 1)
        };

        /*
         * Java decides at runtime which overridden
         * makeSound() method should execute.
         */
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}