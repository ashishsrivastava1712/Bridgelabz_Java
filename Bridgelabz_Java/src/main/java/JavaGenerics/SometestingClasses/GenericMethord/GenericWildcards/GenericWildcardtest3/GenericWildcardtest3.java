/*
 * Question: Implementation and demonstration of Generic Wildcardtest3
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Generic Wildcardtest3.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaGenerics.SometestingClasses.GenericMethord.GenericWildcards.GenericWildcardtest3;
import java.util.ArrayList;
public class GenericWildcardtest3 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> ls= new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        System.out.println(sum(ls));
    }
    public static <T extends Number>  double sum(ArrayList<T> ls)
    {
        double total = 0;
        for(Number element : ls)
        {
            total += element.intValue();
        }
        return total;
        // Now look at genericWildcardtest4
    }
}
