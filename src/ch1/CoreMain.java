package ch1;

import java.util.concurrent.TimeUnit;

public class CoreMain {

	public static void main(String[] args) {
		UnsafeTask task = new UnsafeTask();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(task);
			thread.start();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		SafeTask task1 = new SafeTask();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(task1);
			thread.start();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
