package java_basics.functionalprogramming;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOperation_runner {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 21, 56, 44, 87, 98, 55);
		System.out.print("Sum:");
		int sum = list.stream().reduce(0, (num1, num2) -> num1 + num2);
		System.out.println(sum);
		System.out.print("Odd sum:");
		printOddSum(list);
		System.out.println("Square of first 10 numbers:");
		createSquare(IntStream.range(1, 11));

		List<String> strList = List.of("Apple", "Ant", "Bat");
		System.out.println("\nLower Case:");
		printLowerCase(strList);
		System.out.println("\nLengths:");
		printLength(strList);
		System.out.println("\nList of even numbers:");
		System.out.println(listEvenNumbers(list));
		System.out.println("\nMax and min element:");
		maxAndMin(list);

	}

	private static void maxAndMin(List<Integer> list) {
		int max = list.stream().max((n1, n2) -> Integer.compare(n1, n2)).orElse(0);
		int min = list.stream().min((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.print(max + " " + min);

	}

	private static List<Integer> listEvenNumbers(List<Integer> list) {
		return list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

	}

	private static void printLength(List<String> strList) {
		strList.stream().map(e -> e.length()).forEach(e -> System.out.print(e + " "));

	}

	private static void printLowerCase(List<String> strList) {
		strList.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.print(e + " "));
	}

	private static void createSquare(IntStream range) {
		Collection<Integer> temp = range.map(e -> e * e).boxed().collect(Collectors.toList());
		System.out.println(temp);
	}

	private static void printOddSum(List<Integer> list) {
		int sum = list.stream().filter(elem -> elem % 2 == 1).reduce(0, (num1, num2) -> num1 + num2);
		System.out.println(sum);
	}

}