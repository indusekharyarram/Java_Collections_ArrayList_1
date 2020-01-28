package Collections_0;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayList_LastindexOf 
{
 public static void main(String[] args) 
	    {
	        ArrayList<String> a = new ArrayList<>(Arrays.asList("abcde", "bcdea", "cdeab","deabc","eabcd","abcde", "bcdea", "cdeab","deabc","eabcd"));
	        int b = a.lastIndexOf("abcde");
	        System.out.println(b);
	        b = a.lastIndexOf("eabcd");
	        System.out.println(b);
	    }
}
