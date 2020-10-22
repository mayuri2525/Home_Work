package com.oop;

public class DemoClass { 
	
		int a=10;
		int b=20;
		
		public int add() { 
			
			int total=a+b;
			System.out.println("add" +total);
			return total;
		
		}
			
			public static void main(String args[]) {
				
				
				DemoClass demo=new DemoClass();
				demo.add();
	} 

}
