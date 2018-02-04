package ch1;

public class MainInterrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread task = new PrimeGenerator();
		task.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		task.interrupt();
	}

}
