package oops_basics.Object_composition.Customer;

public class Customer_runner {

	public static void main(String[] args) {
		Address homeAddress = new Address("Amaatra Homes", "Chennai", "India", "600127");
		Customer customer = new Customer("Ayushi", homeAddress);

		Address workAddress = new Address("IIITDM", "Chennai", "India", "900678");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}

}