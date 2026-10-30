/*
 * Question: Implementation and demonstration of Facade Pattern
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Facade Pattern.
 *
 * Author: Ashish Srivastava
 * Date: 28 - 10 - 2026
 */
package JavaDesignPatterns.FacadePattern;


class CPU {
    // Method to handle start operations
    void start() {
        System.out.println("CPU started");
    }
}

class Memory {
    // Method to handle check operations
    void check() {
        System.out.println("Memory checked");
    }
}

class HardDrive {
    // Method to handle load operations
    void load() {
        System.out.println("Operating system loaded");
    }
}

// Facade
class ComputerFacade {
    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private HardDrive hardDrive = new HardDrive();

    // Method to handle start computer operations
    public void startComputer() {
        cpu.start();
        memory.check();
        hardDrive.load();
    }
}

public class FacadePattern {
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
    }
}
