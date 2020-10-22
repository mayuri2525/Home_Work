package com.exception;

import java.io.File;
import java.io.IOException;

public class ThrowExMainMsg {

	public static void main(String[] args) throws IOException { 
		File file=new File("Test.txt");
	
		file.createNewFile();
		System.out.println("file is cretaed");
		
		
	}

}

