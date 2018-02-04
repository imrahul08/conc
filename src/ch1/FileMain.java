package ch1;

import java.util.concurrent.TimeUnit;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileClock clock = new FileClock();
		Thread thread = new Thread(clock);
		thread.start();

		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt();

	}

}
