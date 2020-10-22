package com.string;

public class CompreToIgnoring4 {

	public static void main(String[] args) {
		String s1 = "java is a";
		String s2 = "programming language";
		System.out.println(s1 + " " + s2);

		int result = s1.compareToIgnoreCase(s2);
	}

}
