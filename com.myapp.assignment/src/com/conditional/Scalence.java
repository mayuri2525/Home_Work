package com.conditional;

import java.util.Scanner;

public class Scalence { 
	public static void main(String[] args) {
		int sidea,sideb,sidec;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sidea");
		sidea=sc.nextInt();
		System.out.println("enter sideb");
		sideb=sc.nextInt();
		System.out.println("enter sidec");
		sidec=sc.nextInt();
		
//		
		if(sidea==sideb || sideb==sidec) {
			System.out.println("this is equlatral trangle");
		}
		else if(sidea==sideb || sidea==sidec|| sideb==sidec){
			System.out.println("This is an isosceles triangle");
		}else {
			System.out.println("This is a scalene triangle");
		}
	}

}
