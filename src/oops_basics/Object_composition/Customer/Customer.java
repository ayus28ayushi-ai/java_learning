package oops_basics.Object_composition.Customer;

public class Customer {
	private String name;
	private Address homeAddress;
	private Address workAddress;

	// constructor
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	@Override
	public String toString() {
		return String.format("Name-%s\nHome Address-%s\nWork Address-%s", name, homeAddress, workAddress);
	}
}