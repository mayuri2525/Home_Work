package com.myapp.abstraction;

abstract class Vehicle { 
	
	abstract void numWheels();

}class Car extends Vehicle{
	void numWheels() {
		System.out.println("Car class");
	}
}class Truck extends Vehicle{
	void numWheels() {
		System.out.println("Truck class");
	}
}
