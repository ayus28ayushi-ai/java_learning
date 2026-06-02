package java_basics.functionalprogramming;

import java.util.List;

public class FilteringFP_runner {
	public static void main(String[] args) {
		List<String> list = List.of("Bottle", "Bat", "Apple", "Sample");
		System.out.println("Looping way:");
		print(list);
		System.out.println("Functional Prog way:");
		printWithFP(list);
		System.out.println("Functional Prog using Fitering way:");
		printWithFPUsingFilter(list);

		List<Integer> intList = List.of(23, 56, 32, 67, 1, 0);
		System.out.println("Even numbers");
		printEvenFP(intList);
		System.out.println("Odd numbers");
		printOddFP(intList);

	}

	private static void printOddFP(List<Integer> intList) {
		intList.stream().filter(element -> (element % 2 != 0)).forEach(element -> System.out.println(element));
	}

	private static void printEvenFP(List<Integer> intList) {
		intList.stream().filter(element -> (element % 2 == 0)).forEach(element -> System.out.println(element));
	}

	private static void print(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}

	private static void printWithFPUsingFilter(List<String> list) {
		list.stream().filter(element -> element.endsWith("le")).forEach(element -> System.out.println(element));
	}
}