package java_basics.threadsAndConcurrency.multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(3);

		List<CallableTask> task = List.of(new CallableTask("Ayushi"), new CallableTask("Subhi"),
				new CallableTask("Sue"));

		System.out.print("Fastest is:");
		System.out.println(service.invokeAny(task));

		List<Future<String>> welcome = service.invokeAll(task);

		for (Future<String> name : welcome) {
			System.out.println(name.get());
		}

		System.out.print("Fastest is:");
		System.out.println(service.invokeAny(task));
		service.shutdown();

	}

}
