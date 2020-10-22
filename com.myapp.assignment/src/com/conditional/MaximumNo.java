package com.conditional;

public class MaximumNo { 
	public static void main(String[] args) {
		int a=10,b=20,c=30;
		if(a>b && a>c) {
			System.out.println(a + " Maximum no");
			
		}else if(b>c&& c>a) {
			System.out.println(b+ " Maximum no");
			
		}else
		{
			System.out.println(c+ " Maximum no");
		}
	}

}
