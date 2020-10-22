package com.array;

public class ReverseArray3rdEle {
	public static void reverse(int a[],int temp) {
		
		int[] arr = new int[temp]; 
		int j=temp;
		for(int i=0;i<temp;i++) {
			arr[j-1]=a[i];
			j=j-1;
		}
		System.out.println("reverse array ");
		for(int k=0;k<temp;k++) {
			System.out.println(arr[k]);
		}
		
	}public static void main(String[] args) 
    { 
        int [] arr = {10, 20, 30, 40, 50}; 
        reverse(arr, arr.length); 
       
    } 

}
