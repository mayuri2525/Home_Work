package com.chapter1;

public class Swapping { 
	
	public static void main(String args[]) {
		int a=10,b=20;
		System.out.println("Before swap " +a+" "+ b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swap " +a+" "+b);
	}
	

}
