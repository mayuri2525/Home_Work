package com.exception;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowThrowsChecked {

	Scanner sc = new Scanner(System.in);

	String userName;
	int age;

	void registerationProfile() throws InvalidAgeException { 
		System.out.println("Enter userName: ");
		userName = sc.next();

		System.out.println("Enter age: ");
		age = sc.nextInt();

		try {
			
	
		if (age < 18) {
			throw new InvalidAgeException("Invalid age");
		} else {
			System.out.println("User's age is valid");
		}
		}
		catch(InvalidAgeException e) {
			System.out.println("user age in not valid");
		}
	}
}
