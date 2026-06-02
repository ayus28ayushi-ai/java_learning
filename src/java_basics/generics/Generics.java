package java_basics.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics<TYPE> {
	ArrayList<TYPE> list = new ArrayList<>();

	public void addElem(TYPE element) {
		list.add(element);
	}

	public TYPE get(int element) {
		return list.get(element);
	}

	public static <T, E extends List<T>> void duplicate(E list1) {
		list1.addAll(list1);
	}

	// upperbound wildcard
	public static double sum(List<? extends Number> number) {
		double sum = 0.0;
		for (Number num : number) {
			sum += num.doubleValue();
		}
		return sum;
	}

	// lowerbound wildcard
	public static double multiply(List<? super Number> number) {
		double prod = 1;
		for (Object obj : number) {
			Number num = (Number) obj;
			prod *= num.doubleValue();
		}
		return prod;
	}

	@Override
	public String toString() {
		return list.toString();
	}

}