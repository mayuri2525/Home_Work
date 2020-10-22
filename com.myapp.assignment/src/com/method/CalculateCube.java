package com.method;

public class CalculateCube { 

		
	
	float height=(float) 23.4;
	float width=(float) 43.2;
	float dept=(float) 45.2;

	
	
void cube() { 
	double volume=height*width*dept;
	System.out.println(volume);

	
}public static void main(String[] args) { 
	CalculateCube c=new CalculateCube();
	c.cube();
}
}