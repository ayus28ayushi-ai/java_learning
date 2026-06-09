package oops_basics.Interface;

interface Flyable {
	void fly();
}

class Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("with wings");
	}
}

class Aeroplane implements Flyable {
	@Override
	public void fly() {
		System.out.println("with fuel");
	}
}

public class Flyable_runner {

	public static void main(String[] args) {
		Flyable[] fly = { new Bird(), new Aeroplane() };
		for (Flyable object : fly) {
			object.fly();
		}

	}

}