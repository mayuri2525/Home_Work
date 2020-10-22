package com.myapp.abstraction;

public class VotingAppMain {  
	public static void main(String[] args) {
		VotingApp v;
		v=new Kids();
		v.registerUser();
		v.requestVotingNo();
		v=new Adult();
		v.registerUser();
		v.requestVotingNo();
	}
	

}
