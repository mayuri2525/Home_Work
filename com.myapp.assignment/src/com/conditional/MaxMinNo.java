package com.conditional;

import java.util.Scanner;

public class MaxMinNo { 
	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("enter the no " +num1+ " " +num2 );
		
		if(num1>num2) {
			System.out.println("maximum " +num1);
		} if(num2>num1) {
			System.out.println("maximum " +num2);
		} if(num1==num2) {
			System.out.println("both are equal");
		}
		
	}

}
