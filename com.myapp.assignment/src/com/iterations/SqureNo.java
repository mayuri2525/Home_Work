package com.iterations;

import java.util.Scanner;

public class SqureNo {
	public static void main(String args[]) {
		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
		int num,num1;
		num=sc.nextInt();
		num1=num*num;
		System.out.println("power is" +num1);
	}

}
