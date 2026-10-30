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
