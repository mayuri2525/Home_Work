package com.method;

import java.util.Scanner;

public class CalculatorDemo {
	static int result;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome");
		while(true) {
			System.out.println("enter the first number") ;
	int	num1=sc.nextInt();
	System.out.println("enter the second number");
		int num2=sc.nextInt();
		
		
		System.out.println("to perform addition enter 1");
		System.out.println("to perform substraction enter 2");
		System.out.println("to perform multiplication enter 3");
		System.out.println("to perform division enter 4");
		System.out.println("to exit enter 9" );
		
		System.out.println("enter choice");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:System.out.println("Adding two no");
		add(num1,num2);
		break;
		case 2:System.out.println("Substrcting two no");
		subt(num1,num2);
		break;
		case 3:System.out.println("Multiplying two no");
		mul(num1,num2);
		break;
		case 4:System.out.println("Divide two no");
		div(num1,num2);
		break;
		case 9:System.out.println("visit again");
		System.exit(0);
		
		default:System.out.println("Incorrect input!!");
			break;
		}
		
	}

}
	
	
	private static void add(int num1, int num2) { 
		result=num1+num2;
		System.out.println("Addition result=" +result);
		// TODO Auto-generated method stub
		
	}
	private static void subt(int num1, int num2) { 
		result=num1-num2;
		System.out.println("Substraction result=" +result);
		// TODO Auto-generated method stub
		
	}
	private static void mul(int num1, int num2) { 
		result= num1*num2;
		System.out.println("Multiplication result=" +result);
		// TODO Auto-generated method stub
		
	}
	private static void div(int num1, int num2) { 
		result=num1/num2;
		System.out.println("Division result=" +result);
		// TODO Auto-generated method stub
		
	}
}