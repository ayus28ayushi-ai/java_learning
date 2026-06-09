package java_basics;

import java.util.Arrays;

enum Season {
	SUMMER(10), WINTER(20), SPRING(30), FALL(40);

	private int val;

	private Season(int val) {
		this.val = val;
	}

	public int getVal() {
		return val;
	}

}
public class enumsRunner {

	public static void main(String[] args) {
		Season season1 = Season.FALL;
		Season season2 = Season.valueOf("SUMMER");

		System.out.println(season1.name());
		System.out.println(season2.ordinal());
		System.out.println(season2.name() + season2.getVal());
		System.out.println(Arrays.toString(Season.values()));

	}
}
