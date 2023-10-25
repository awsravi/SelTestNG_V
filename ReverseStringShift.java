package com.vis.s;
public class ReverseStringShift {
    public static void main(String[] args) {
    	//virtusa
      String s = "ankanna gari viswanath";

		// Split the string into words
		String[] words = s.split(" ");

		if (words.length >= 3) {
			// Store the word at index 1
			String temp = words[1];

			// Shift the word at index 2 to index 1
			words[1] = words[0];

			// Shift the stored word to index 0
			words[0] = temp;

			// Reverse the entire string
			StringBuilder reversedString = new StringBuilder();
			for (int i = words.length - 1; i >= 0; i--) {
				reversedString.append(reverseWord(words[i]));
				if (i > 0) {
					reversedString.append(" ");
				}
			}

			// Print the reversed string
			System.out.println(reversedString.toString());

    }
}
