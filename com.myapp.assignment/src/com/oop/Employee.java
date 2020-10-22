package com.oop;

import java.util.Scanner;

public class Employee {

	void disply() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the salary ");
		double salary = sc.nextDouble();

		System.out.println("enter the bonus ");
		double bonus = sc.nextDouble();

		@SuppressWarnings("unused")
		double total;
		if (salary < 5 && salary > 5) {
			bonus = salary * 35;
			System.out.println("emp bonus " + bonus);
			total = salary + bonus;
			System.out.println("total");
		} else {
			bonus = salary * 15;
			System.out.println("emp bonus " + bonus);
		}

	}

	public static void main(String[] args) {

		Employee e = new Employee();
		e.disply();
		System.out.println(e.toString());

	}

}
