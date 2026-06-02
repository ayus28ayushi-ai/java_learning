package java_basics.threadsAndConcurrency.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();

		service.execute(new Task1());
		service.execute(new Thread(new Task2()));

		// task 3
		System.out.println("\nTask 3 starts!");
		for (int i = 201; i < 301; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask 3 done!");
		System.out.println("\nMain done!");
		service.shutdown();

	}

}
