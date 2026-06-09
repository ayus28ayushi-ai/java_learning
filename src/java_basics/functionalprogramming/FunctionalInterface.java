package java_basics.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {
	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}
}

class PrintingConsumer implements Consumer<Integer> {
	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}
}

class SquareNumberFunction implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		return number * number;
	}
}

public class FunctionalInterface {

	public static void main(String[] args) {

		System.out.println("Usual way:");
		List.of(23, 43, 34, 45, 36, 48).stream().filter(e -> e % 2 == 0).map(e -> e * e)
				.forEach(e -> System.out.println(e));

		System.out.println("Interface way:");
		List.of(23, 43, 34, 45, 36, 48).stream().filter(new EvenNumberPredicate()).map(new SquareNumberFunction())
				.forEach(new PrintingConsumer());

	}

}