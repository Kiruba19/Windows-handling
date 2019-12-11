package org.test;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<Integer>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		System.out.println(s);
		
		//enhanced for loop
		
		for(Integer x:s) {
			System.out.println(x);
		}
	}

}
