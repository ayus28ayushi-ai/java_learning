package java_basics.arraypractice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ArrayPractice {

//	private String name;
	private int[] marks;

	public ArrayPractice(String string, int... marks) {
//		name = string;
		this.marks = marks;
	}

	public int getNumberOfMarks() {

		return marks.length;
	}

	public int getTotalSum() {

		int sum = 0;
		for (int score : marks) {
			sum += score;
		}
		return sum;
	}

	public int getMinMarks() {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		for (int score : marks) {
			if (score < min) {
				min = score;
			}
		}
		return min;
	}

	public int getMaxMarks() {
		int max = Integer.MIN_VALUE;
		for (int score : marks) {
			if (score > max) {
				max = score;
			}
		}
		return max;
	}

	public BigDecimal getAvg() {
		int sum = getTotalSum();
		int num = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(num), 5, RoundingMode.UP);
	}

}