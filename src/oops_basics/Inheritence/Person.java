package oops_basics.Inheritence;

public class Person {
	private String name;
	private long phone;
	private String email;

	public Person(String name, long phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("Name:%s\nPhone:%d\nEmail:%s", name, phone, email);
	}

}