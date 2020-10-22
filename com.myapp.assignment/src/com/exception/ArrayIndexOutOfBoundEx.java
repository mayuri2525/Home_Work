package com.exception;

public class ArrayIndexOutOfBoundEx {
	public static void main(String[] args) {
		int arr[]=new int[5];
		try {
			System.out.println(arr[7]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("exception handled");
		}
	}

}
