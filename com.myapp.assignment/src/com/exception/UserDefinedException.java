package com.exception;

import java.util.Scanner;

public class UserDefinedException {
Scanner sc=new Scanner(System.in);

	String name,country;
	
	void register() throws InvalidCountryNameException { 
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter country");
		country=sc.next();
		try {
		if(country.equalsIgnoreCase("India") == false)
		{ 
	    	throw new InvalidCountryNameException("Invalid Country");
		}else {
			System.out.println("congrats user belongs to india");
		}
		}catch(InvalidCountryNameException e){
			System.out.println("country name is minor");
			
		}
	}
}
