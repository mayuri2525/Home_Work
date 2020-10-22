package com.array;

import java.util.Scanner;

public class BubbleSort {

	void input() {
		Scanner sc = new Scanner(System.in);

		int size;
		System.out.println("Enter size of array: ");
		size = sc.nextInt();

		int a[] = new int[size];
		System.out.println("Enter elements of array: ");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		bubbleSort(a);

	}

	void bubbleSort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}
		for (int i : a) {
			System.out.println(" " + i);
		}
	}
}
