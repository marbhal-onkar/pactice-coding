package com.main.serialization;

import java.io.IOException;

//https://www.journaldev.com/2452/serialization-in-java
public class SerializationProxyTest {

	public static void main(String[] args) {
		String fileName = "data.ser";

		Data data = new Data("Onkar");

		try {
			SerializationUtil.serialize(data, fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			Data newData = (Data) SerializationUtil.deserialize(fileName);
			System.out.println(newData);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}