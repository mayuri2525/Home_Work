package com.array;

import java.util.Arrays;

public class IteratingArray {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		int array[]=new int[10];
		System.out.println("first array elements " +Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			array[i]=arr[i];
		}
		System.out.println("New Array " +Arrays.toString(array));
	}

}
