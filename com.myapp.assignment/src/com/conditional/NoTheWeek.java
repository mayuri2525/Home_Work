package com.conditional;

import java.util.Scanner;

public class NoTheWeek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter day");
		int day = sc.nextInt();
		System.out.println(getDayName(day));
	}

	public static String getDayName(int day) {
		String dayname = "";
		switch (day) {
		case 1:
			dayname = "Monday";
			break;
		case 2:
			dayname = "tuesday";
			break;
		case 3:
			dayname = "wendsday";
			break;
		case 4:
			dayname = "thursday";
			break;
		case 5:
			dayname = "friday";
			break;
		case 6:
			dayname = "saturday";
			break;
		case 7:
			dayname = "sunday";
			break;

		default:
			dayname = "invalid day";
			break;
		}
		return dayname;

	}

}
