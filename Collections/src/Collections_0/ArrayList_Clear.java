package Collections_0;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Clear {
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList<>();
		a.add("abcde");
		a.add("bcdea");
		a.add("cdeab");
		a.add("deabc");
		a.add("eabcd");
		System.out.println(a);
		a.clear();
		System.out.println(a);
	}
}
