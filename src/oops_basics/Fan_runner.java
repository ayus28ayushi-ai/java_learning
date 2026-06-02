package oops_basics;

public class Fan_runner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer1", 32.123, "Yellow");
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte) 3);
		System.out.println(fan);

		fan.switchOff();
		System.out.println(fan);
	}

}