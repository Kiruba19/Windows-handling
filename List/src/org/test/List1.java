package org.test;

import java.util.ArrayList;
import java.util.List;

public class List1 {
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		System.out.println(li);
		
		//for loop
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		//enhanced for loop
		
		for(Integer x:li) {
		System.out.println(x);
	}

}}
