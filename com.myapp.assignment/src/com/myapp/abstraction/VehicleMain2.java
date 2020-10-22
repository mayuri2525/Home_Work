package com.myapp.abstraction;

public class VehicleMain2 {
	public static void main(String[] args) {
		Vehicle v;
		v=new Car();
		v.numWheels();
		v=new Truck();
		v.numWheels();
	}

}
