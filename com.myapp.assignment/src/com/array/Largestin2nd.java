package com.array;

import java.util.Scanner;

public class Largestin2nd {
	void input() {
		Scanner sc = new Scanner(System.in);

		int size,total = 0;
		System.out.println("Enter size of array: ");
		size = sc.nextInt();

		int a[] = new int[size];
		System.out.println("Enter largest element of array: "+getSecondLargest(a, total));




	
getSecondLargest(a, total);

}int getSecondLargest(int[] a, int total){  
	int temp;  
	for (int i = 0; i < total; i++)   
	        {  
	            for (int j = i + 1; j < total; j++)   
	            {  
	                if (a[i] > a[j])   
	                {  
	                    temp = a[i];  
	                    a[i] = a[j];  
	                    a[j] = temp;  
	                }  
	            }  
	        }  
	       return a[total-2];  
}
}
