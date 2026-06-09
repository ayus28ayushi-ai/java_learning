package oops_basics.AbstractClass;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the ingredients.");
		System.out.println("Set the utensils.");

	}

	@Override
	void prepareDish() {
		System.out.println("Put the ingredients in the bowl and cook it in microwave for 30 min.");
		System.out.println("Add icecream in the bowl for dessert");

	}

	@Override
	void cleanup() {
		System.out.println("Wash the dishes and kitchen.");

	}

}