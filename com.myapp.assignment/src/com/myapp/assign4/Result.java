package com.myapp.assign4;

import com.myapp.assign3.Addition;

public class Result { 
	public static void main(String[] args) {
		com.myapp.assign3.Addition a=new com.myapp.assign3.Addition();
		System.out.println(a.add(100, 200));
		com.myapp.assign3.Substraction s=new com.myapp.assign3.Substraction();
		System.out.println(s.sub(100, 200));
		com.myapp.assign3.Multiply m =new com.myapp.assign3.Multiply();
		System.out.println(m.mul(100, 2));
		com.myapp.assign3.Division d =new com.myapp.assign3.Division();
		System.out.println(d.div(10, 5));
		
		
	}

}
