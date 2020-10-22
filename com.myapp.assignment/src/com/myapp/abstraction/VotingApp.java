package com.myapp.abstraction;

import java.util.Scanner;

public interface VotingApp { 
	Scanner sc=new Scanner(System.in);
	public void registerUser();

	void requestVotingNo();

}

class Kids implements VotingApp {

	@Override
	public void registerUser() { 
		
		System.out.println("enter the age");
		int age = sc.nextInt();
		
		
		
		if (age <= 12) {
			System.out.println("you have successfully register kids");

		} else if (age >= 12) {
			System.out.println("you have not registered");
		}
		// TODO Auto-generated method stub

	}

	public void requestVotingNo() {
		
		System.out.println("sorry can not go for voting because age is greter than 12");
		
	}

}

class Adult implements VotingApp {
	@Override
	public void registerUser() { 
		System.out.println("enter the age");
		int age = sc.nextInt();
	
		if (age > 12) {
			System.out.println("you have successfully register under adult");

		} else if (age <12) {
			System.out.println("you have not registered");
		}

	}

	@SuppressWarnings("unused")
	@Override
	public void requestVotingNo() {
		String votingType = "Adult";
		if (votingType == "Adult") {
			System.out.println("your voting id will be generated whthin a day");
		} else {
			System.out.println("Oops, you are not");
		}
		// TODO Auto-generated method stub

	}

}
