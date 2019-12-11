package org.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {
public static void main(String[] args) {
	
	Map<Integer, String> m=new HashMap<Integer, String>();
	
	m.put(1, "hi");
	m.put(2, "hello");
	m.put(3, "hh");
	
	System.out.println(m);
	
	//entryset(iterate only entries)
	
	Set<Entry<Integer, String>> en = m.entrySet();
	for (Entry<Integer,String> x:en) {
		System.out.println(x);
	}
	// iterate and get keys and values
	Set<Entry<Integer, String>> en1 = m.entrySet();
	for (Entry<Integer,String> x:en1) {
		System.out.println(x.getKey());
		System.out.println(x.getValue());
	}
	// iterate only keys
Set<Integer> keySet = m.keySet();
System.out.println(keySet);

// iterate only values
Collection<String> values = m.values();
System.out.println(values);
}

}
