/*
 * Question: Implementation and demonstration of Sort Stack
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Sort Stack.
 *
 * Author: Ashish Srivastava
 * Date: 16 - 10 - 2026
 */
package JavaStacksandQueues;

import java.util.Stack;

class SortStack {

    // Method to handle sort stack operations
    static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int value = stack.pop();

        sortStack(stack);

        insertSorted(stack, value);
    }

    // Method to handle insert sorted operations
    static void insertSorted(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() >= value) {
            stack.push(value);
            return;
        }

        int top = stack.pop();

        insertSorted(stack, value);

        stack.push(top);
    }

    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        sortStack(stack);
         

        System.out.println(stack);
    }
}
