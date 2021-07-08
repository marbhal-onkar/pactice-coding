package com.main.cutomAnnotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Driver {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		apply(new Test());
	}

	//To apply this annotations
	static void apply(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> clazz = obj.getClass();

		if(clazz.isAnnotationPresent(CustomAnnotation.class)) { // class leval annotation checking
			for (Method method : clazz.getDeclaredMethods()) {
				if (method.isAnnotationPresent(MethodAnnotation.class)) { // method level annotations
					method.setAccessible(true);
					method.invoke(obj);
				}
			}
		}
	}
}
