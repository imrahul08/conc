package ch1;

import java.util.concurrent.TimeUnit;

public class FileSearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSearch searcher = new FileSearch("/Users/rahmitta", "FileSearch.java");
		Thread thread = new Thread(searcher);
		thread.start();
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt();
	}

}
