package com.method;

import java.util.Scanner;

public class Student {  
	int rollNo;
	String name;
	int contactNo;
	int total_marks;
	void insert() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter roll no");
		int rollNo=sc.nextInt();
		System.out.println("enter name ");
		String name =sc.next();
		System.out.println("enter contactno");
		int contactNo=sc.nextInt();
		System.out.println("enter totalmarks");
		int total_marks=sc.nextInt();
		
		
	}
	void displayInformation(){System.out.println(rollNo+" "+name+ "" +contactNo+"" +total_marks);}  

}
