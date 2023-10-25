package com.vis.s;
public class ReverseStringShiftUsingLoop {
    public static void main(String[] args) {
    	//virtusa
        String input = "Anakanna gari Viswanath";
        String reversed = reverseString(input);
        System.out.println("using inBuilt Methods :"+reversed);
    }

    public static String reverseString(String input) {
        char[] characters = input.toCharArray();
        int length = characters.length;

        for (int i = 0; i < length / 2; i++) {
            char temp = characters[i];
            characters[i] = characters[length - 1 - i];
            characters[length - 1 - i] = temp;
        }

        return new String(characters);
    }
}
