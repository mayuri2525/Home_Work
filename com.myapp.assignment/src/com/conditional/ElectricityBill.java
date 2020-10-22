package com.conditional;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		{

			float amt = 0, total_amt, sur_charge;

			Scanner sc = new Scanner(System.in);
			System.out.println("enter unit");
			float unit = sc.nextFloat();

			if (unit <= 50) {
				amt = (float) (unit * 0.50);
			} else if (unit <= 150) {
				amt = (float) (25 + ((unit - 50) * 0.75));
			} else if (unit <= 250) {
				amt = (float) (100 + ((unit - 150) * 1.20));
			} else if (unit > 250) {
				amt = (float) (220 + ((unit - 250) * 1.50));
			}

			/*
			 * Calculates total electricity bill after adding sur charges
			 */
			sur_charge = (float) (amt * 0.20);
			total_amt = amt + sur_charge;
			System.out.println("Electricity bill  " + total_amt);

		}
	}

}
