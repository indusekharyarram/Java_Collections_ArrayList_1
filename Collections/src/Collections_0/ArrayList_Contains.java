package Collections_0;
import java.util.ArrayList;
public class ArrayList_Contains {
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList<>();
		a.add("abcde");
		a.add("bcdea");
		a.add("cdeab");
		a.add("deabc");
		a.add("eabcd");
		System.out.println(a);
		if(a.contains("abcde"))
		System.out.println("Yes...!!!");
		else
		System.out.println("No...!!!");	
	}
}
