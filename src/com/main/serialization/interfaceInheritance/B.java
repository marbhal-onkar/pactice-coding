package com.main.serialization.interfaceInheritance;

public interface B {

	default void test() {
		System.out.println("In B Interface ...");
	}
}
