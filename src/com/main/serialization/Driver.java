package com.main.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Create the byte stream of person object and write it in yourfile.txt file.
 * 
 * Also, load this file and convert back to java object of person into p2 object
 * 
 * If the person does not implemet the serilizable interface then it will throw  java.io.NotSerializableException at runtime
 * **/
public class Driver {

	public static void main(String[] args) throws Exception {

		Person person = new Person();
		person.setHeight(20);
		person.setName("Joe");

		FileOutputStream fileOutputStream = new FileOutputStream("yourfile.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(person);
		objectOutputStream.flush();
		objectOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream("yourfile.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Person p2 = (Person) objectInputStream.readObject();
		objectInputStream.close();
	}
}
