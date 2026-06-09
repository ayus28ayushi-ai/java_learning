package java_basics.threadsAndConcurrency.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
	private int number;

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.printf("\nTask %d starts!", number);
		for (int i = number * 100; i < number * 100 + 1; i++) {
			System.out.print(i + " ");
		}

		System.out.printf("\nTask %d done!", number);
	}

}

public class FixedThreadPool {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);

		service.execute(new Task(1));
		service.execute(new Task(2));
		service.execute(new Task(3));
		service.execute(new Task(4));
		service.execute(new Task(5));
		service.execute(new Task(6));
		service.execute(new Task(7));

		service.shutdown();
	}
}
