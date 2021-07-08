package com.main.guessTheOutput;
//package com.main.guessTheOutput;
//
//import java.io.IOException;
///*
// * B. Compile-time error
//As IOException and Exception are checked exception, so you can not broaden the scope of Exception while method overriding.*/
//public class Example2 {
//	public static void main(String[] args) {
//		A a=new B();
//		try {
//			a.m1();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}
//
//class A
//{
//	void m1() throws IOException
//	{
//		System.out.println("In m1 A");
//	}
//}
//class B extends A
//{
//	@Override
//	void m1() throws Exception
//	{
//		System.out.println("In m1 B");
//	}
//}

import java.util.HashSet;

public class Customer {

	String name;
	int age;

	Customer(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {

		Customer c1= new Customer("John",20);
		Customer c2= new Customer("John",20);

		HashSet<Customer> customerSet=new HashSet<>();
		customerSet.add(c1);
		customerSet.add(c2);
		System.out.println(customerSet.size());
	}

	// getters and setters
}
