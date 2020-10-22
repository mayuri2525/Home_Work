package com.exception;

import java.util.Scanner;

public class FinallyBlock { 
	public static void main(String[] args) {  
		
		
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the 1st no");
			int a=sc.nextInt();
			System.out.println("enter the 2nd no");
			int b=sc.nextInt();
			int res=0;
			try {
				res=a/b;
			
		}catch(ArithmeticException e) {
			System.out.println("infinite");
		}
		finally {
			System.out.println("always excuted");
		}
	}

	 
}
