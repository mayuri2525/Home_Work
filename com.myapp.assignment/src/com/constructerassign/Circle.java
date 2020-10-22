package com.constructerassign;

public class Circle { 
	
	float calArea(float redius) { 
		float r=(3.14f)*redius*redius;
		
		return r;
		
	}
	float calArea1(float redius) { 
		float r=2*3.14f*redius;
		return r;
		
	}
public static void main(String[] args) {
	Circle c=new Circle();
	System.out.println(c.calArea(2.3f));
	System.out.println(c.calArea1(3.2f));
	
}
}
