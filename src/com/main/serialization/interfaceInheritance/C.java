package com.main.serialization.interfaceInheritance;

public class C implements A, B {

	public static void main(String[] args) {
		C c  = new C();
		c.test();
	}

	//	@Override
	//	public void test() {
	//		A.super.test();
	//	}

	//	@Override
	//	public void test() {
	//		System.out.println(" In C Class..");
	//	}

}
