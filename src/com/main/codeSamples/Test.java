package com.main.codeSamples;

class Mammal{

	void eat(Mammal m) {
		System.out.println("Mammal eats..!");
	}
}

class Cattle extends Mammal {

	void eat(Cattle c) {
		System.out.println("Cattle eats..!");
	}
}

class Horse extends Cattle {

	void eat(Horse c) {
		System.out.println("Horse eats..!");
	}
}

public class Test {

	public static void main(String[] args) {
		Mammal h = new Horse();
		Cattle c = new Horse();
		c.eat(h);
	}

}
