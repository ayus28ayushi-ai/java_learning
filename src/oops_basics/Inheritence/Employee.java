package oops_basics.Inheritence;

public class Employee extends Person {
	private String title;
	private String employer;
	private int grade;
	private int salary;

	public Employee(String name, long phone, String email) {
		super(name, phone, email);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString()
				+ String.format("Title:%s\nEmployer:%s\nEmployee Grade:%d\nSalary:%d", title, employer, grade, salary);
	}

}