package java_basics.exceptionhandling;

class Amount {

	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) throws Exception {
		if (!this.currency.equals(that.currency)) {
			throw new Exception("Currencies don't match");
		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}

}

public class ThrowingExceptionRunner {
	public static void main(String[] args) throws Exception {
		Amount amt1 = new Amount("USD", 10);
		Amount amt2 = new Amount("USD", 20);

		amt1.add(amt2);
		System.out.println(amt1);
	}
}
