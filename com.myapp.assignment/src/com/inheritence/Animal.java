package com.inheritence;

// hirarchical inheritance
public class Animal {

	void eat() {
		System.out.println("eating");
	}
}

class Cat extends Animal {
	void meow() {
		System.out.println("meowing===");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking");
	}
} class AnimalMain {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();

	}}