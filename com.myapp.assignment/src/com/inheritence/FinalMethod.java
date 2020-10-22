package com.inheritence;

public class FinalMethod { 
	
	final void demo() {
		System.out.println("final method");
	}
}
	class Xyz extends FinalMethod{
		public static void main(String[] args) { 
			Xyz x=new Xyz();
			x.demo();
			
		}
	}

