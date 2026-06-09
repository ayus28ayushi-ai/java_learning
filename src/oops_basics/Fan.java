package oops_basics;

public class Fan {
	private String make;
	private double radius;
	private String color;
	private Boolean isOn;
	private byte speed;

	// constructor
	public Fan(String maker, double radius, String color) {
		make = maker;
		this.radius = radius;
		this.color = color;
	}

	public void switchOn() {
		isOn = true;
		setSpeed((byte) 5);
	}

	public void switchOff() {
		isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return String.format("make-%s, radius-%f, color-%s, isOn=%b, speed=%d", make, radius, color, isOn, speed);
	}

}