package com.array;

import java.util.Arrays;

public class RemoveSpecificElement {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70};
		System.out.println("Array Elements " +Arrays.toString(a));
		int removeIndex=1;
		for(int i=removeIndex;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		System.out.println("After removing second element" +Arrays.toString(a));
	}

}
