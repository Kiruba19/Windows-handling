package org.test;

import java.util.LinkedList;
import java.util.List;

public class Company {
	public static void main(String[] args) {
		
		List<Employee> l=new LinkedList<Employee>();
		
		Employee e = new Employee();
		e.setId(123);
		e.setName("hi");
		e.setSal(123.53f);
		
		Employee e1= new Employee();
		e1.setId(23);
		e1.setName("kk");
		e1.setSal(12.356f);
		
		l.add(e);
		l.add(e1);
		
		//for loop
		for (int i = 0; i < l.size(); i++) {
			System.out.println("id id" + "\t" + l.get(i).getId());
			System.out.println("name is" + "\t" + l.get(i).getName());
			System.out.println("sal is" + "\t" + l.get(i).getSal());
			
		}
		//enhanced for loop
		for(Employee x:l) {
			
			System.out.println(x.getId());
			System.out.println(x.getName());
			System.out.println(x.getSal());
		}
		
	}

	

}
