package java_basics.threadsAndConcurrency.multithreading.concurrency;

public class concurrencyRunner {

	public static void main(String[] args) {
		Counter counter = new Counter();
		counter.increment();
		counter.increment();
		counter.increment();
		
	    System.out.println(counter.getI());
	}

}
