package java_basics.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_runner {

	public static void main(String[] args) {
		List<Character> charValue = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		Set<Character> treeSet = new TreeSet<>(charValue);
		System.out.println("TreeSet: " + treeSet);

		Set<Character> linkedHashSet = new LinkedHashSet<>(charValue);
		System.out.println("LinkedTreeSet: " + linkedHashSet);

		Set<Character> hashSet = new HashSet<>(charValue);
		System.out.println("HashSet: " + hashSet);

	}

}