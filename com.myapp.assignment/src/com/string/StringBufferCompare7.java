package com.string;

public class StringBufferCompare7 {
	public static void main(String[] args) {
		String str1 = "example.com", str2 = "Example.com";
	    StringBuffer str=new StringBuffer(str1);
	    
	     System.out.println("Comparing "+str1+" and "+str+": " + str1.contentEquals(str));
	      System.out.println("Comparing "+str2+" and "+str+": " + str2.contentEquals(str));
	}
	

}
