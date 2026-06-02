package java_basics.collections.list;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_prac {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public ArrayList_prac(String string, int... marks) {
		name = string;
		for (int score : marks) {
			this.marks.add(score); // adding marks in the ArrayList
		}
	}

	public int getNumberOfMarks() {

		return marks.size();
	}

	public int getTotalSum() {

		int sum = 0;
		for (int score : marks) {
			sum += score;
		}
		return sum;
	}

	public int getMinMarks() {
		return Collections.min(marks);
	}

	public int getMaxMarks() {
		return Collections.max(marks);
	}

	public BigDecimal getAvg() {
		int sum = getTotalSum();
		int num = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(num), 5, RoundingMode.UP);
	}

	@Override // parent class(Object) gives default toString() which priparent class(Object)
				// gives default toString() which prints the hashcode but when we override it
				// then we can modify what we print.nts the ClassName@hashcode but when we
				// override it then we can modify what we print.
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int... mark) {
		for (int score : mark) {
			marks.add(score);
		}
	}

	public void removeMark(int... mark) {
		for (int score : mark) {
			marks.remove(Integer.valueOf(score)); // using Integer.valueOf() because the score itself was being treated
													// as an index
		}

	}

}
