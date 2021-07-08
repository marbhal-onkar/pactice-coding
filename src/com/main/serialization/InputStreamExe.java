package com.main.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputStreamExe {

	public static void main(String[] args) throws FileNotFoundException {
		File initialFile = new File("src/main/resources/sample.txt");
		InputStream s = new FileInputStream(initialFile);
	}
}
