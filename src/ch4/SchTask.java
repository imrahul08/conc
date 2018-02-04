package ch4;

import java.util.Date;
import java.util.concurrent.Callable;

public class SchTask implements Callable<String> {
	private String name;

	public SchTask(String name) {
		this.name = name;
	}

	public String call() throws Exception {
		System.out.printf("%s: Starting at : %s\n", name, new Date());
		return "Hello, world";
	}
}
