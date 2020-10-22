package com.iterations;

public class Demo {

	public static void main(String args[]) {
		int countp = 0, county = 0;
		for (int i = 33; i <= 999; i++) {
			if (i % 3 == 0) {

				System.out.println("pink");
				countp = countp + 1;
			} else if (i % 5 == 0) {
				System.out.println("yellow");
				county = county + 1;
			}
			System.out.println(i);

		}
		System.out.println("count pink " + countp);
		System.out.println("count yellow " + county);
	}

}
