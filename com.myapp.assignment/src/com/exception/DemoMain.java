package com.exception;

public class DemoMain {
	public static void main(String[] args) {
		try {
		Demo d=new Demo();
		int res=d.division(12, 0);
		System.out.println(res);
	}catch(ArithmeticException e) {
		System.out.println("Divisor cannot be zero");
	}finally {
		System.out.println("result");
	}
	}

}
