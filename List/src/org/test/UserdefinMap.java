package org.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserdefinMap {
	public static void main(String[] args) {
		
		Map<Integer, Employee> m = new HashMap<Integer, Employee>();
		
		Employee e = new Employee();
		e.setId(123);
		e.setName("kiru");
		e.setSal(2356.25f);
		
		Employee e1=new Employee();
		e1.setId(23);
		e1.setName("ll");
		e1.setSal(23.54f);
		
		m.put(1, e);
		m.put(2, e1);
		
		// for loop
		Set<Entry<Integer, Employee>> en = m.entrySet();
		for ( Entry<Integer, Employee>  x:en) {
			System.out.println(x.getKey());
			System.out.println(x.getValue().getId());
			System.out.println(x.getValue().getName());
		}
		
	}

}
