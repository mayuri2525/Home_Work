package com.myapp.abstraction;

abstract class Shape {
	
	abstract void numberOfSides();

}class Trapezoid extends Shape{
	void numberOfSides() {
		System.out.println("no of sides : 4");
	}
}class Trangle extends Shape{
	void numberOfSides() {
		System.out.println("no of sides: 3");
	}
}class Hexagon extends Shape{
	void numberOfSides() {
		System.out.println("no od sides : 6");
	}
}
