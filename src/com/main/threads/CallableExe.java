package com.main.threads;

import java.util.concurrent.Callable;

public class CallableExe implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		return 1;
	}

}
