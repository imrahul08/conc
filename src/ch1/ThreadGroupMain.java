package ch1;

public class ThreadGroupMain {

	public static void main(String[] args) {
		MyThreadGroup threadGroup = new MyThreadGroup("MyThreadGroup");
		ThreadGriupTask task = new ThreadGriupTask();
		for (int i = 0; i < 2; i++) {
			Thread t = new Thread(threadGroup, task);
			t.start();
		}

	}

}
