package com.myapp.abstraction;

public interface MyApp {

	public void m1();
	public void m2();
}class Test implements MyApp{

	@Override
	public void m1() {
		System.out.println("Method m1 is created");
		
	}

	@Override
	public void m2() {
		System.out.println("method m2 i created");
		
	}
}