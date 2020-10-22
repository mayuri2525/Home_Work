package com.inheritence;
//Multilevel inheritance
class Maruti extends Honda {
	void speed() {
		System.out.println("Maruti speed is good");
	}

	void brand() {
		System.out.println("maruti brand is good");
	}

	public static void main(String[] args) {
		Maruti m = new Maruti();
		m.vehical();
		m.speed();
		m.brand();
	}
}