package com.exception;

import java.io.FileNotFoundException;

public class ThrowThrowsUn {
	
	
	public static void main(String[] args) 
    {
        try
        {
            //Can skip handling of NullPointerException (unchecked exception)
            method();   
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
     
    public static void method( ) throws FileNotFoundException {
    	throw new FileNotFoundException();  
    	}
}


