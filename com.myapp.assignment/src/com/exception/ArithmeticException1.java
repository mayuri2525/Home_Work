package com.exception;

import java.util.Scanner;

public class ArithmeticException1 {

	void method1() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		a = sc.nextInt();
		System.out.println("enter the 2 nd no");
		b = sc.nextInt();
		int res = 0;
		
			res = a / b;
		
		System.out.println("result " + res);

	}

	void method2() {

		method1();
		System.out.println("in method2");
	}

	void method3() {

		method2();
		System.out.println("in method3");

	}

	void method4() {
		method3();
		System.out.println("in method4");

	}
}

