package ch2;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class EventStorage {
	private int maxSize;
	private LinkedList<Date> storage;

	public EventStorage() {
		maxSize = 10;
		storage = new LinkedList<>();
	}

	public synchronized void set() {
		while (storage.size() == maxSize) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		storage.offer(new Date());
		System.out.printf("Set: %d", storage.size());
		System.out.println();
		notifyAll();
	}

	public synchronized void get() {
		while (storage.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("Get: %d: %s", storage.size(), ((LinkedList<?>) storage).poll());
		System.out.println();
		notifyAll();
	}
}
