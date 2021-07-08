package com.main.compare;

import java.util.Comparator;

/*
 * Comparing methods
 * */
public class Driver {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		LaptopComparators comparator1 = new LaptopComparators();

		// without creating new class
		Comparator<Laptop> c2 = Comparator.comparing(Laptop::getName);
		Comparator<Laptop> c3 = Comparator.comparing(Laptop::getPrice);

		Comparator<Laptop> c13 = new Comparator<Laptop>() {
			@Override
			public int compare(Laptop o1, Laptop o2) {
				return o1.getRam().compareTo(o2.getRam());
			}
		};

		// can also be used like in case getPrice returns the custom object
		Comparator<Laptop> c4 = Comparator.comparing(Laptop::getPrice, (p1, p2) -> {
			return p1.compareTo(p2);
		});

		//comparators can be reversed like
		Comparator<Laptop> c5 = c4.reversed();
		Comparator<Laptop> c6 = c2.reversed();

		//for specific data types Double, Long and Integer
		Comparator<Laptop> c7 = Comparator.comparingInt(Laptop::getPrice);

		//obtaining natural order comparator -  to work below line Laptop class must implements Comparable interface
		Comparator<Laptop> c8 = Comparator.<Laptop>naturalOrder();

		//revserd natural ordering
		Comparator<Laptop> c9 = Comparator.<Laptop>reverseOrder();

		//considering null values
		//null first
		Comparator<Laptop> c10 = Comparator.nullsFirst(c9);

		//null last
		Comparator<Laptop> c11 = Comparator.nullsLast(c9);

		//comparing with multiple conditions --  then comparing
		Comparator<Laptop> c12 = Comparator.comparing(Laptop::getPrice).thenComparing(c2).thenComparing(Laptop::getRam);
	}
}
