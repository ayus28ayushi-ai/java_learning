package java_basics.threadsAndConcurrency.multithreading.concurrency;

public class Counter {

	private int i = 0;

	public int getI() {
		return i;
	}

	synchronized public void increment() {
		i++;
	}
}
