package java_basics.arraypractice;

import java.util.Scanner;

public class LongestWordFinder {

	public String findLongestWord(String sentence) {
		if (sentence == null || sentence.equals("")) {
			return "";
		}
		String[] wordsInSentence = sentence.split(" ");

		int longest = 0;
		String longestWord = "";
		for (String word : wordsInSentence) {
			if (word.length() > longest) {
				longest = word.length();
				longestWord = word;
			}
		}
		return longestWord;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the line:");
		String line = input.nextLine();

		LongestWordFinder wordFinder = new LongestWordFinder();
		System.out.println("Longest word: " + wordFinder.findLongestWord(line));
		input.close();
	}
}