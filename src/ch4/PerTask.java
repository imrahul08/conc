package ch4;

public class PerTask implements Runnable {
	private String name;

	public PerTask(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("Do nothing");
	}

}
