package java_basics.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics_runner {

	public static void main(String[] args) {
		Generics<String> listString = new Generics<>();
		listString.addElem("Elem 1");
		listString.addElem("Elem 2");
		System.out.println(listString);
		System.out.println(listString.get(1));

		ArrayList<Integer> listType = new ArrayList<>(List.of(1, 2, 3));
		Generics.duplicate(listType);
		System.out.println(listType);

		Generics<Integer> listInteger = new Generics<>();
		listInteger.addElem(Integer.valueOf(19));
		listInteger.addElem(100);
		System.out.println(listInteger);
		System.out.println(listInteger.get(0));

		System.out.println("\nWildcard practice:");
		System.out.println(Generics.sum(List.of(1, 2, 3, 4, 5)));
		System.out.println(Generics.sum(List.of(1.1, 2.1, 3.1, 4.1, 5.1)));
		System.out.println(Generics.sum(List.of(1l, 2l, 3l, 4l, 5l)));

		System.out.println(Generics.multiply(List.of(1, 2, 3, 4, 5)));
		System.out.println(Generics.multiply(List.of(1.1, 2.1, 3.1, 4.1, 5.1)));
		System.out.println(Generics.multiply(List.of(1l, 2l, 3l, 4l, 5l)));
	}

}