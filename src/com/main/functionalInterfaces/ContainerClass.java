package com.main.functionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ContainerClass {

	public Function<Integer, String> temp = new Function<Integer, String>(){

		@Override
		public String apply(Integer t) {
			// TODO Auto-generated method stub
			return null;
		}


	};

	void test() {

		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub

			}
		};

		Supplier<Integer> supplier = new Supplier<Integer>() {

			@Override
			public Integer get() {
				// TODO Auto-generated method stub
				return null;
			}
		};

		Predicate<Integer> predicate = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return false;
			}
		};

		Function<Integer, String> function  = new Function<Integer, String>() {

			@Override
			public String apply(Integer t) {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}
