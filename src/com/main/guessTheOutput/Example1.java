package com.main.guessTheOutput;

/*
 * A. In m1 B
This will work fine as ArrayIndexOutOfBoundsException and IndexOutOfBoundsException are Runtime exceptions and there is no rule for
 runtime exceptions while method overriding.
 * 
 * */
class A
{
	void m1() throws ArrayIndexOutOfBoundsException
	{
		System.out.println("In m1 A");
	}
}
class B extends A
{
	@Override
	void m1() throws IndexOutOfBoundsException
	{
		System.out.println("In m1 B");
	}
}

public class Example1 {

	public static void main(String[] args) {
		A a=new B();
		a.m1();
	}
}