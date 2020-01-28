package Collections_0;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayList_indexOf {
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList<String>(Arrays.asList("ABCDE","BCDEA","CDEAB","DEABC","EABCD"));
        int b = a.indexOf("BCDEA");
        System.out.println(b);
        b = a.indexOf("CDEAB");
        System.out.println(b);
	}

}
