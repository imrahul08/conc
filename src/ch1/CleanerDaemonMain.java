package ch1;

import java.util.ArrayDeque;
import java.util.Deque;

public class CleanerDaemonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Event> deque = new ArrayDeque<Event>();
		CleanerTask cleaner = new CleanerTask(deque);
		cleaner.start();
		WriterTask writer = new WriterTask(deque);
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread(writer);
			thread.start();
		}
		

	}

}
