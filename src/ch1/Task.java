package ch1;

public class Task implements Runnable {

	@Override
	public void run() {
		int numero = Integer.parseInt("TTT");
		System.out.println("After exception");
	}

}
