/*
 * Question: Implementation and demonstration of Using Runnable Interface Cause W Ecantuse Extend Thread6
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Using Runnable Interface Cause W Ecantuse Extend Thread6.
 *
 * Author: Ashish Srivastava
 * Date: 28 - 10 - 2026
 */
package JavaMultiThreadingFolder.StudentAndPerson;


class Person {
    // Method to handle introduce operations
    void introduce() {
        System.out.println("I am a person.");
    }
}

class Student extends Person implements Runnable {
    @Override
    // Method to handle run operations
    public void run() {
        System.out.println("Student is studying.");
    }
}

public class UsingRunnableInterfaceCauseWEcantuseExtendThread6 {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        Student student = new Student();

        student.introduce();

        Thread t = new Thread(student);
        t.start();
    }

}
// I am a person.
// Student is studying.
