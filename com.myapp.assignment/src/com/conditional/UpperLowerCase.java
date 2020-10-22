package com.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperLowerCase { 
	public static void main(String args[]) throws IOException {
	char m;
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter any alphabet");
	m=(char) bf.read();
	
	if(m>=97 && m<=123) {
		System.out.println("Lower Case");
	}
	else if(m>=65 && m<=97) {
		System.out.println("Upper case");
	}else if(m >= 48 && m <= 57)
    {
        System.out.println("Digit");
    }
	}

}
