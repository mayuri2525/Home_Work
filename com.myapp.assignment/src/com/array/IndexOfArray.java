package com.array;

public class IndexOfArray {

	public static int find(int arr[], int n) {

		if (arr == null) {
			return -1;
		}

		// find length of array

		int len = arr.length;
		int i = 0;

		while (i < len) {
			if (arr[i] == n) {
				return i;
			} else {
				i = i + 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int a[] = { 2, 6, 7, 8, 9, 7 };
		System.out.println("find th index " + find(a, 7));
		System.out.println("find th index " + find(a, 9));
	}

}
