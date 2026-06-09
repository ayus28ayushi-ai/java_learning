package java_basics.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map_runner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion. This has never happened before.";

		Map<Character, Integer> charOccurance = new HashMap<>();
		char[] character = str.toCharArray();
		for (char ch : character) {
			Integer integer1 = charOccurance.get(ch);
			if (integer1 == null) {
				charOccurance.put(ch, 1);
			} else {
				charOccurance.put(ch, integer1 + 1);
			}
		}

		System.out.println("Character occurances:\n" + charOccurance);

		Map<String, Integer> wordOccurance = new HashMap<>();
		String[] string = str.split(" ");
		for (String st : string) {
			Integer integer2 = wordOccurance.get(st);
			if (integer2 == null) {
				wordOccurance.put(st, 1);
			} else {
				wordOccurance.put(st, integer2 + 1);
			}
		}
		System.out.println("Word Occurance:\n" + wordOccurance);

	}

}