package com.inheritence;
//Muktilevel ingeritance

public class Car {

	void vehical() {
		System.out.println("car");
	}

}

class Honda extends Car {
	void speed() {
		System.out.println("Honda speed is good");
	}

	void brand() {
		System.out.println(" Honda brand is good");
	}
}


