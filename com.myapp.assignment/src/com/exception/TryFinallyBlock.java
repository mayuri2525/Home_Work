package com.exception;

public class TryFinallyBlock {
	public static void main(String[] args) {
		try {
			int i=25/0;
			System.out.println("divide");
		}catch(ArithmeticException e) {
			System.out.println("exception");
		}
		finally {
			System.out.println("always excuted block");
		}
	}

}
