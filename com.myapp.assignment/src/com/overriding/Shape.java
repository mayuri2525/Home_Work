package com.overriding;

public class Shape {

	public void area(float a) { 
		System.out.println("area of class in shape" +a);
		
	}
	void m1() {
		System.out.println("child class m1");
	}
	void mShape() {
		System.out.println("child mshape class m2");
	}
}
 class Squre extends Shape{ 
	 public void area(float a) { 
			System.out.println("area of class in squre" +a);
			
		}
	 
	 void m1() {
			System.out.println("child class m1");
		}
		void mSqure() {
			System.out.println("child class m2");
		}
		void m() {
			this.m1();
			super.m1();
		}
 }

 
	 class Circle extends Shape{
		 public void area(float a) {
		 System.out.println("area of class in Circle" +a);
	 }
	 }
 