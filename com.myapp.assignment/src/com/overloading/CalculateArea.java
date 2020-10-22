package com.overloading;

public class CalculateArea { 
	float area (float radius) {
		float r=(3.14f)*radius*radius;
		return r;
		
	}
	float area (float length, float width) {
		float r=length*width;
		return r;
		
	}

}
