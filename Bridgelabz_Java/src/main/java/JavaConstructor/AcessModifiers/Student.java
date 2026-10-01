/*
 * Author: Ashish Srivastava
 * Problem Description: Create a Student class with public rollNumber,
 * protected name, and private CGPA. Provide public methods to access
 * and modify CGPA. Create a PostgraduateStudent subclass to demonstrate
 * access to protected members.
 */

class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

// Subclass
class PostgraduateStudent extends Student {

    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Demonstrating protected member
    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}

class StudentDemo {

    public static void main(String[] args) {

        PostgraduateStudent student =
                new PostgraduateStudent(101, "Ashish", 8.9);

        student.displayDetails();

        student.setCGPA(9.2);

        System.out.println("Updated CGPA: " + student.getCGPA());
    }
}