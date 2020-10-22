package com.inheritence;

class Human{
	   //Overridden method
	   public void eat()
	   {
	      System.out.println("Human is eating");
	   }
	}
	class Boy extends Human{
	   //Overriding method
	   public void eat(){
	      System.out.println("Boy is eating");
	   }
	   
	}