package com.nttdata.stringexercise;

import java.util.ArrayList;

public class DuplicateCharacterCount {

	public static void main(String[] args) {
		// TODO 	public static void main(String argu[]) {

		String stringEntered = ReadInput.myString();
		chkString(stringEntered);

	}

	public static void chkString(String stringEntered) {

		// change string to character array
		char[] inputString = stringEntered.toCharArray();
		// create arraylist to hold duplicate characters
		ArrayList<Character> duplicateCharacters = new ArrayList<Character>();

		// loop thru the array to find duplicates
		for (int i = 0; i < stringEntered.length(); i++) {
			for (int j = i + 1; j < stringEntered.length(); j++) {
				if (inputString[i] == inputString[j]) {
					// check the duplicate character list to see if character already found
					if (!duplicateCharacters.contains(inputString[j]))
						duplicateCharacters.add(inputString[j]);
					break;
				}
			}
		}
		int count;
		// if duplicates exist then print
		if (!duplicateCharacters.isEmpty()) {
			System.out.println(duplicateCharacters.size() + " Duplicates found");
			for (char ch : duplicateCharacters)
				{count = 0;
				for (char ch1 : inputString)if (ch == ch1)count += 1;
				System.out.println(ch + " " + count);
				}
		} else {
			System.out.println("No duplicate characters");
		}


	}

}
