package java_basics.collections.list;

public class ArrayList_prac_runner {

	public static void main(String[] args) {
		ArrayList_prac student = new ArrayList_prac("Ayushi", 56, 89, 84, 16, 58, 56);

		System.out.println("No. of Marks:" + student.getNumberOfMarks());
		System.out.println("Total Sum:" + student.getTotalSum());
		System.out.println("Min:" + student.getMinMarks());
		System.out.println("Max:" + student.getMaxMarks());
		System.out.println("Avg:" + student.getAvg());
		System.out.println(student); // printing the content of the object

		student.addNewMark(97, 89);
		System.out.println(student);

		student.removeMark(56, 89, 16);
		System.out.println(student);

	}

}
