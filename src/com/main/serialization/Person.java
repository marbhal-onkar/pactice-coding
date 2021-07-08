package com.main.serialization;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2362913776627204953L;
	private String name;
	private int height;

	public Person() {

	}

	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	//	private void writeObject(ObjectOutputStream oos) throws IOException {
	//		oos.defaultWriteObject();
	//		oos.writeObject(address.getHouseNumber());
	//	}

}
