/*
 * Question: Implementation and demonstration of Test Bonded1
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Test Bonded1.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaGenerics.SometestingClasses.BoundedImplementation1.Bounded1;



public class TestBonded1 
{
    // Main execution method to run and demonstrate the solution
    public static void main(String[] args) {
        MyNumber obj1 = new MyNumber(12);
        Box<MyNumber> box = new Box<>(obj1);
        box.getItem().print();
    }
}
 class Box<T extends Number & Printable>
{
    private T item;

    public Box(T item) {
        this.item = item;
    }

    // Method to handle set item operations
    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
interface Printable
{
    void print();
}
class MyNumber extends Number implements Printable
{
    private int value;
    MyNumber(int value)
    {
        this.value=value;
    }
    
    @Override
    // Method to handle print operations
    public void print() {
        System.out.println("MyNumber: " + value);
    }

    @Override
    // Method to handle int value operations
    public int intValue() {
        return value;
    }

    @Override
    // Method to handle long value operations
    public long longValue() {
        return value;
    }

    @Override
    // Method to handle float value operations
    public float floatValue() {
        return value;
    }

    @Override
    // Method to handle double value operations
    public double doubleValue() {
        return value;
    }
}
