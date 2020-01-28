package Collections_0;
import java.util.ArrayList;
public class ArrayList_Clone 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<>();
        a.add("abcde");
        a.add("bcdea");
        a.add("cdeab");
        a.add("deabc");
        a.add("eabcd");
        System.out.println(a);
        System.out.println(a.clone());
	}
}
