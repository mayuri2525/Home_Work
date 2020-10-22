package com.conditional;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

	    System.out.println("Enter name, age and salary:");
		int id=sc.nextInt();
		String name=sc.nextLine();
		System.out.println("id " +id);
		System.out.println("name " +name);
		
		
	}

}
