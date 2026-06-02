package java_basics.arraypractice;

public class String_Array {

	private String[] daysOfWeek;

	public String_Array(String[] daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	public String getLongestDay() {
		String longest = "";
		for (String longestDay : daysOfWeek) {
			if (longestDay.length() > longest.length()) {
				longest = longestDay;
			}
		}
		return longest;
	}

	public void printDaysBackwards() {
		System.out.println("Days of the week Backwards:");
		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.print(daysOfWeek[i]);
			System.out.println(" ");
		}

	}

}