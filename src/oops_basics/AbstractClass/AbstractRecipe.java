package oops_basics.AbstractClass;

public abstract class AbstractRecipe {
	public void execute() {
		getReady();
		prepareDish();
		cleanup();
	}

	abstract void getReady();

	abstract void prepareDish();

	abstract void cleanup();

}