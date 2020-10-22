package com.conditional;

import java.util.Scanner;

public class LeapYear { 
	public static void main(String[] args) {
		int year;
		System.out.println("enter the year");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		
		if(year%4==0) {
			System.out.println("leap year " +year);
		}
		else {
			System.out.println("not leap year" +year);
		}
	}

}
