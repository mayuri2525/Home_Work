package com.constructerassign;

public class RectangleMain {
public static void main(String[] args) {
	Rectangle r=new Rectangle();
	System.out.println("area of " +r.calArea());
	Rectangle r1=new Rectangle(20,30);
	System.out.println("area of "+r1.calArea());
	Rectangle r2=new Rectangle(10);
	System.out.println("area of " +r2.calArea());
	
}
}
