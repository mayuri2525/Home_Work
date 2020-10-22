package com.array;

public class FindSpecificValue { 
	
	public static boolean contains(int arr[],int n) {
		for(int t :arr) {
			if(n==t) {
				return true;
			}
		}
		return false;
		
		
		
		
	}
	public static void main(String[] args) {
		int a[]= {10,20,40,50,30,70};
		System.out.println(contains(a,50));
		System.out.println(contains(a,100));
	}
	

}
