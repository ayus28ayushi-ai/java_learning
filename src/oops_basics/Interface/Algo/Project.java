package oops_basics.Interface.Algo;

public class Project {
	interface Test {
		void nothing();

		default void nothing2() {
			System.out.println("Default nothing");
		}
	}

	class Class1 implements Test {

		@Override
		public void nothing() {
			System.out.println("Nothing");

		}

	}

	class Class2 implements Test {

		@Override
		public void nothing() {
			System.out.println("Nothing2");

		}

	}

	public static void main(String[] args) {
		ComplexAlgo project = new RealAlgo();
		System.out.println(project.complexAlgo(30, 20));
		Project projectTest = new Project();
		Test test = projectTest.new Class1();
		test.nothing();
		test.nothing2();
		Test test1 = projectTest.new Class2();
		test1.nothing();
		test1.nothing2();
	}

}