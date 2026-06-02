package java_basics.threadsAndConcurrency.multithreading;

class Task1 extends Thread {
	@Override
	public void run() {
		System.out.println("\nTask 1 starts!");
		for (int i = 1; i < 101; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\nTask 1 done!");

	}
}

class Task2 implements Runnable {
	@Override
	public void run() {
		System.out.println("\nTask 2 starts!");
		for (int i = 101; i < 201; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask 2 done!");

	}
}

public class Multithreading_runner {

	public static void main(String[] args) throws InterruptedException {
		// task 1
		Task1 task1 = new Task1();

		task1.start();

		// task 2
		Task2 task2 = new Task2();
		Thread threadTask2 = new Thread(task2);

		threadTask2.start();

		task1.join();
		threadTask2.join();

		// task 3
		System.out.println("\nTask 3 starts!");
		for (int i = 201; i < 301; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask 3 done!");
		System.out.println("\nMain done!");

	}

}
