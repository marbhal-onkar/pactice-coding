package com.main.compare;

import java.util.Comparator;

/**
 * Can define comparator like this also in separate class
 * but more shortcut methods available
 * */

public class LaptopComparators implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		return o1.getPrice().compareTo(o2.getPrice());
	}
}
