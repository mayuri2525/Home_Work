package com.exception;

import java.util.Scanner;

public class AnyOneExceptionhandle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=0;
		try {
			res=a/b;
		}catch(ArithmeticException e) {
			System.out.println("infinite");
		}
		
	}

}
