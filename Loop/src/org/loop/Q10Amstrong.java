package org.loop;

import java.util.Scanner;

public class Q10Amstrong {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int a=n, i=0,j=0;
		while(a>0) {
			i=a%10;
			j=(i*i*i)+j;
			a=a/10;
		}
		if(n==j) {
			System.out.println("it is amstrong");
		}
		else {
			System.out.println("it is not amstrong");
		}
	}
}