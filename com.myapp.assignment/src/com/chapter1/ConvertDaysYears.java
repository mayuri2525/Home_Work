package com.chapter1;

public class ConvertDaysYears { 
	public static void main(String args[])
	{
		int days=0,week,years,m;
		System.out.println("Enter days: ");
		years=(days/365);
		week=(days%365)/7;
		days=days-((years*365) + (week * 7));
		System.out.println("years: " +years);
		System.out.println("week: " +week);
		System.out.println("days: " +days);
		
	}

}
