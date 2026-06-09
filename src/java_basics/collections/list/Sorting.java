package java_basics.collections.list;

import java.util.Comparator;

class DescendingStudentComparator implements Comparator<Sorting> {

	@Override
	public int compare(Sorting student1, Sorting student2) {
		return Integer.compare(student2.getId(), student1.getId());
	}

}

public class Sorting implements Comparable<Sorting> {
	private int id;
	private String name;

	public Sorting(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Sorting that) {

		return Integer.compare(this.id, that.id);
	}

	@Override
	public String toString() {
		return id + " " + name;
	}
}
