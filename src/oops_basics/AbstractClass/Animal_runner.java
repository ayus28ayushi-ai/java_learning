package oops_basics.AbstractClass;

abstract class Animal {
	abstract public void bark();
}

class Dog extends Animal {

	@Override
	public void bark() {
		System.out.println("Bow Bow");

	}

}

class Cat extends Animal {

	@Override
	public void bark() {
		System.out.println("Meow Meow");

	}

}

public class Animal_runner {

	public static void main(String[] args) {
		Animal[] animal = { new Dog(), new Cat() };
		for (Animal pet : animal) {
			pet.bark();
		}
	}

}