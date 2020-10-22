package com.conditional;

import java.util.Scanner;

public class CalculateMarks { 
	public static void main(String[] args) {
		int marks[]=new int[6];
		int i;
		float total=0,avg;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<6;i++) {
			System.out.println("enter marks"+(i+1)+"");
			marks[i]=sc.nextInt();
			total=total+marks[i];
		}
		avg=total/6;
		System.out.println("Student grade is");
		if(avg>90) {
		System.out.println("A");
		}else if(avg>80)
		{
			System.out.println("B");
		}else if(avg>70 && avg<80) {
			System.out.println("C");
		}else if(avg>60 && avg<70) {
			System.out.println("D");
		}else if(avg>50 && avg<60) {
			System.out.println("E");
			
		}else {
			System.out.println("F");
		}
		
	}

}
