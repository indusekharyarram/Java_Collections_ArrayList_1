package Collections_0;
import java .util.ArrayList;
public class ArrayList_ensuresCapacity {
	public static void main(String args[])
	{
	        ArrayList<String> a = new ArrayList<>();
	        a.add("abcde");
	        a.add("bcdea");
	        System.out.println(a);
	        a.ensureCapacity(0);
	        a.add("cdeab");
	        a.add("deabc");
	        a.add("eabcd");
	        System.out.println(a);
	    }
	}