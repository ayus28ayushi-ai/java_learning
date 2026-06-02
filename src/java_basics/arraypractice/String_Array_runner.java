package java_basics.arraypractice;

public class String_Array_runner {
	public static void main(String[] args) {
		String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		String_Array days = new String_Array(daysOfWeek);
		System.out.println("Day with longest number of letters:" + days.getLongestDay());
		days.printDaysBackwards();
	}
}
