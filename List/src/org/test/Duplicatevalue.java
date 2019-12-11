package org.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicatevalue {
	public static void main(String[] args) {
		
	
	
	List<String> li=new ArrayList<String>();
	li.add("a");
	li.add("a");
	li.add("b");
	li.add("c");
	
	Set <String> s = new HashSet<String>(li);
	System.out.println(li.size() - s.size());
	
	//for loop(String : duplicate count)
	for(String x:s) {
		System.out.println(x + ":" + Collections.frequency(li, x));
	}

}
}