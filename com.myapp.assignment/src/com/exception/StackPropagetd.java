package com.exception;

public class StackPropagetd {
	void method1() 
    { 
        int data = 50 / 0; 
    } 
  
    void method2() 
    { 
        method1(); 
        // exception propagated to p() 
    } 
  
    void method3() 
    { 
        try { 
            method2(); // exception handled 
        } 
        catch (Exception e) { 
            System.out.println("Exception handled"); 
        } 
    } 
  
    public static void main(String args[]) 
    { 
    	StackPropagetd obj = new StackPropagetd(); 
        obj.method3(); 
        System.out.println("Normal flow..."); 
    } 
} 


