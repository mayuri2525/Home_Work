 package com.constructerassign;

public class ShapeCircle {
	
	float pi;
	float redius;
	public ShapeCircle(float redius) {
		
		this.redius = redius;
	}
	public ShapeCircle(float pi, float redius) {
		super();
		this.pi = (float) 3.5;
		this.redius = redius;
	}


		public static void main(String[] args) { 
			ShapeCircle sc=new ShapeCircle((float) 3.5);
			System.out.println(sc.redius);
			
			
	}
}	
		
	

	
	
