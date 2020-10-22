package com.constructerassign;

public class Rectangle {
	int lenght,breadth;
	int calArea() {
		return lenght * breadth;
		
	}
	public Rectangle() {
		int length=0;
		int breadth=0;
		
	}
	public Rectangle(int lenght, int breadth) {
		
		this.lenght = lenght;
		this.breadth = breadth;
	}
Rectangle(int length){
	this.lenght=length;
	this.breadth=length;
}
	
} 
