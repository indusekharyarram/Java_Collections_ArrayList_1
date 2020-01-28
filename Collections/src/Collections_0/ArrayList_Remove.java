package Collections_0;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayList_Remove 
{
	public static void main(String[] args) 
    {
        ArrayList<String> a=new ArrayList<String>(Arrays.asList("abcde","bcdea","cdeab","deabc","eabcd"));
        System.out.println(a);  
        a.remove(2);
        System.out.println(a);  
    }
}
