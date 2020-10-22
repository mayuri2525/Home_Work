package com.overriding;



public class Main { 
	
	public static void main(String args[]) {  
		
		Shape perent=new Shape();
		Squre child=new Squre();
		Circle child_ci=new Circle();
		perent=(Shape)child;
		perent.area(78.0f);
		perent.m1();
		perent.mShape();
		
		
		
		
		
		
		
//		Shape shape=new Shape();
//		Squre squre=new Squre(); 
//		Cube cube=new Cube();
//		shape.area(56.0f);
//		squre.area(78.9f);
//		 cube.area(678.90f);
//		
	}

}
