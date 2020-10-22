package com.operator;

public class OpearatorDemo { 
	public static void main(String[] args) {
		System.out.println();
		int a=5;
		int b=10;
		int c=20;
		int i=2;
		int result=0;
	//	result=a*5*(++i)*i -  c*2*i--;//660
		
	//	result=a*5*(++i)*i -  (c*2*i--*++i);/// -540
		
		result=(a*=i--)*5*++i*i -  (c*=2*i)*i--*++i;
		System.out.println(result);
		System.out.println("a" +a);
		System.out.println("b" +b);
		System.out.println("c" +c);
		System.out.println("i" +i);}
		
//		a*5*(6)*i-20*2*6
//		a*5*6*5-20*2*6
//		25*6*5-240;
//		150*5-240
//		750-240
//		510 /// false
//		
//		a*5*(6)*i-20*2*6
//		5*5(6)*(6)-20*2*6
//		25*6*6-240
//		900-240
//		660// true
		
		
//		a*5*(6)*i-20*2*6
//		5*5(6)*(6)-(20*2*6*6)
//		25*6*6-1440
//		900-1440
//		-540
//		
		

}
