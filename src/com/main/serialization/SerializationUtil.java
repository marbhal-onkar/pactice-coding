package com.main.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * A simple class with generic serialize and deserialize method implementations
 * 
 * @author onkar_m
 * 
 *         see stackoverflow bookmarks for the difference between
 *         FileInputStream and FileReader OR FileOutputStream and FileWriter
 * 
 * 
 *         How to pass charset to FileReader or FileWriter
 *         FileReader f = new FileReader("onkar.srs", Charset.forName("UTF-8"));
 * 
 * 
 */
public class SerializationUtil {

	// deserialize to Object from given file
	public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		ois.close();
		return obj;
	}

	// serialize the given object and save it to file
	public static void serialize(Object obj, String fileName) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);

		fos.close();
	}

}