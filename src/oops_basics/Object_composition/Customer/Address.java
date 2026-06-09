package oops_basics.Object_composition.Customer;

public class Address {
	private String line1;
	private String city;
	private String country;
	private String zip;

	// constructor
	public Address(String line1, String city, String country, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.country = country;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return line1 + " " + city + " " + country + " " + zip;
	}

}