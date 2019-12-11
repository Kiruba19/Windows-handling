package org.test;

public class ReverseArray {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		System.out.println("array is");
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		
		
	}
		System.out.println("reversed array is");
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.println(arr[i]);
		}

}}
