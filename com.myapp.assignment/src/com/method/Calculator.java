package com.method;

import java.util.Scanner;

public class Calculator { 
	
	
		int CalculateSum(int sum) {
			System.out.println("sum of two no " +sum);
			return sum;
			
		
			
	}
		int CalculateDifferce(int diff) { 
			System.out.println("sub of 2 no " +diff);
			return diff;
			
		}
		
		public static void main(String[] args) { 
		
		int num1,num2,sum,diff;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter th 1 no ");
		num1=sc.nextInt();
		System.out.println("enter the 2 no ");
		num2=sc.nextInt();
		sum=num1+num2;
		diff=num1-num2;
		Calculator c=new Calculator();
		c.CalculateSum(sum);
		c.CalculateDifferce(diff);
		

}
}