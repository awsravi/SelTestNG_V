package com.vis.s;
public class ReverseStringShift {
    public static void main(String[] args) {
    	//virtusa
        String input = "Anakanna gari Viswanath";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    public static String reverseString(String input) {
        char[] characters = input.toCharArray();
        int start = 0;
        int end = characters.length - 1;

        while (start < end) {
            // Swap the characters at the start and end positions
            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;

            // Move the start and end pointers toward each other
            start++;
            end--;
        }

        return new String(characters);
    }
}
