package oops_basics.Inheritence;

public class Employee_runner {

	public static void main(String[] args) {
		Employee employee = new Employee("Ayushi", 5978462581L, "ayushi@gmail.com");
		employee.setTitle("SWE II");
		employee.setEmployer("Google");
		employee.setGrade(6);
		employee.setSalary(1500000);
		System.out.println(employee);
	}

}