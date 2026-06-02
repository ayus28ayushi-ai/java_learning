package java_basics.arraypractice;

public class ArrayPractice_runner {

	public static void main(String[] args) {

		ArrayPractice student = new ArrayPractice("Ayushi", 56, 89, 84, 16, 58, 56);

		System.out.println("No. of Marks:" + student.getNumberOfMarks());
		System.out.println("Total Sum:" + student.getTotalSum());
		System.out.println("Min:" + student.getMinMarks());
		System.out.println("Max:" + student.getMaxMarks());
		System.out.println("Avg:" + student.getAvg());
	}
}