package com.main.codeSamples;

class CustExe extends Exception { }

class Person {

	public void sal() throws CustExe {
		throw new CustExe();
	}
}

public class Company {

	//	public void pay(){
	//		new Person().sal();
	//	}

	public static void main(String[] args) {
		String a = "onkar";
		String d = "onkar";
		String b = new String("Onkar");
		String c = new String("Onkar");

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(a == d);

		String S1 = "S1 ="+"123"+"456";
		String S2 = "S2 ="+(123+456);

		System.out.println(S1);
		System.out.println(S2);

	}

}
