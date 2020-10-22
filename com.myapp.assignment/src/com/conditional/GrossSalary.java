package com.conditional;

import java.util.Scanner;

public class GrossSalary { 
	public static void main(String[] args) {
		float basic_salary,da,hra,gross = 0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the salary");
		
		basic_salary=scan.nextFloat();
		if(basic_salary<=10000) {
			da=basic_salary*20/100;
			hra=basic_salary*80/100;
			System.out.println("the gross salary is" +gross);
		}
		
		if(basic_salary<= 20000)
		 {
		 da=basic_salary*25/100;
		 hra=basic_salary*90/100;
		 gross=basic_salary+da+hra;
		 System.out.println("the gross salary" +gross);
		 }
		 else if(basic_salary>20000)
		 {
		 da=basic_salary*30/100;
		 hra=basic_salary*95/100;
		 gross=basic_salary+da+hra;
		 System.out.println("the gross salary of" +gross);
			
		 }
		 else
		 {
			 System.out.println("you have no salary");
				
		 }
	}
}
