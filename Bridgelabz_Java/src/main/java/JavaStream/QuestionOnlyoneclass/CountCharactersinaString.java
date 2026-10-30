/*
 * Question: Implementation and demonstration of Count Charactersina String
 * Problem Statement:
 * Demonstrates the core logic, functionality, and operations for Count Charactersina String.
 *
 * Author: Ashish Srivastava
 * Date: 24 - 10 - 2026
 */
package JavaStream.QuestionOnlyoneclass;
import java.util.*;
public class CountCharactersinaString 
{
    public static void main(String[] args) 
    {
        Map<Character,Integer> mpp=new LinkedHashMap<>();
        
        String str="Ashish Srivastava";
        for(char c:str.toCharArray())
            {
                mpp.put(c,mpp.getOrDefault(c,0)+1);
            }
        mpp.entrySet().stream().filter(e->e.getKey()!=' ').forEach(e->System.out.println(e.getKey() +" "+ e.getValue()));
    }
}
