package Collections_0;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayList_Get {
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList<String>(Arrays.asList("ABCDE","BCDEA","CDEAB","DEABC","EABCD"));
         
        String b = a.get(0);         
        String c = a.get(1);        
        System.out.println(b.toLowerCase());
        System.out.println(c.toLowerCase());
    }
}