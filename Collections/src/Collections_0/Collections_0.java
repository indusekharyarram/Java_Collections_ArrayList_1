package Collections_0;
import java.util.*;
import java.util.ArrayList;

public class Collections_0 {
	public static void main(String args[])
	{
		/*int a[]=new int[10];*/
		ArrayList<String> list1=new ArrayList<>();
		list1.add("abcde");
		list1.add("bcdea");
		list1.add("cdeab");
		list1.add("deabc");
		list1.add("eabcd");
		ArrayList<String> list2=new ArrayList<>();
		list2.add("vwxyz");
		list1.addAll(list2);
		System.out.println(list1);
	}
}
