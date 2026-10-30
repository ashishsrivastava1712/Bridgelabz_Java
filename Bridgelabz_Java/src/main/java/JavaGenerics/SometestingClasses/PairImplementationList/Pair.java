/*
 * Question: Implementation and demonstration of Pair
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Pair.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaGenerics.SometestingClasses.PairImplementationList;
import java.util.*;
public class Pair<K,V>
{
    private K key;
    private V value;
    public Pair()
    {
       
    }
    public Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }
    public K getKey()
    {
        return key;
    }
    public V getValue()
    {
        return value;
    }
    public void put(K key, V value)
    {
        this.key = key;
        this.value = value;
    }
}
