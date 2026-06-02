package java_basics.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> { // sorting by length of words in ascending order

	@Override
	public int compare(String val1, String val2) {
		// TODO Auto-generated method stub
		return Integer.compare(val1.length(), val2.length());
	}

}

public class queueRunner {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());

		queue.addAll(List.of("Apple", "Pigeon", "Bat", "Tiger", "Dog", "Lion"));
		System.out.println(queue);

		while (!queue.isEmpty()) {
			System.out.print(queue.poll());
			System.out.print(" ");
		}
	}

}
