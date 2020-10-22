package com.exception;

import java.util.Scanner;

public class ArithmeticTryCatch {

	void method1() {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		a = sc.nextInt();
		System.out.println("enter the 2 nd no");
		b = sc.nextInt();
		int res = 0;
		try {
			res = a / b;
		} catch (ArithmeticException e) {
			System.out.println("infinite");
		}
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


