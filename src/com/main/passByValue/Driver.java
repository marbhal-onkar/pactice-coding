package com.main.passByValue;

public class Driver {
	public static void main(String[] args) {
		Dog aDog = new Dog("Max");
		Dog oldDog = aDog;

		// we pass the object to foo
		foo(aDog);
		// aDog variable is still pointing to the "Max" dog when foo(...) returns
		System.out.println("aDog.getName().equals('Max') -"+aDog.getName().equals("Max")); // true
		System.out.println("aDog.getName().equals('Fifi') -"+aDog.getName().equals("Fifi")); // false
		System.out.println(aDog == oldDog);// true
	}

	public static void foo(Dog d) {

		System.out.println("d.getName().equals('Max') -" +d.getName().equals("Max")); // true
		// change d inside of foo() to point to a new Dog instance "Fifi"
		d = new Dog("Fifi");
		System.out.println("d.getName().equals('Fifi') -"+d.getName().equals("Fifi")); // true
	}
}
