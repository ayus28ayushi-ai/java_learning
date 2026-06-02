package java_basics.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting_runner {

	public static void main(String[] args) {
		List<Sorting> studentList = List.of(new Sorting(7, "Ayushi"), new Sorting(2, "Subhi"), new Sorting(12, "Eva"));
		ArrayList<Sorting> nameList = new ArrayList<>(studentList);

		System.out.println(nameList);
		Collections.sort(nameList);
		System.out.println("Ascending: " + nameList);
		Collections.sort(nameList, new DescendingStudentComparator());
		System.out.println("Descending: " + nameList);
		// alternative method
		nameList.sort(new DescendingStudentComparator());
		System.out.println(nameList);
		Collections.sort(nameList, (s1, s2) -> Integer.compare(s1.getId(), s2.getId()));
		System.out.println("Lambda way: nameList);  " + nameList);
		Collections.sort(nameList, Comparator.comparingInt(Sorting::getId).reversed());
		System.out.println("Method chaining method: " + nameList);

	}

}