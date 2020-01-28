package Collections_0;
import java.util.ArrayList;
public class ArrayList_Add {
	public static void main(String args[])
	{
		/*int a[]=new int[10];*/
		ArrayList<String> a=new ArrayList<>(),b=new ArrayList<>();
		a.add("abcde");
		a.add("bcdea");
		a.add("cdeab");
		a.add("deabc");
		a.add("eabcd");
		b.add("vwxyz");
		b.addAll(a);
		System.out.println(b);
	}
}