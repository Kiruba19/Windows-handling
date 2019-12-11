import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Reverse {
	
	public static void main(String[] args) {
		
		String s = "kiruba";
		StringBuilder s1=new StringBuilder(s);
		System.out.println(s1.reverse());
	
	
	List<String> li=new ArrayList<String>();
	li.add("kiruba");
	li.add("pavi");
	li.add("kiruba");
	Set <String> s2 = new HashSet<String>(li);
	System.out.println(li.size() - s2.size());
	
	//for loop(String : duplicate count)
	for(String x:s2) {
		System.out.println(x + ":" + Collections.frequency(li, x));
	}

}
}