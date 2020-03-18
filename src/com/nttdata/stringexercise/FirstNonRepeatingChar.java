package com.nttdata.stringexercise;

import java.util.ArrayList;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {

		String sourceString = ReadInput.myString();
		chkString(sourceString);

	}

	public static void chkString(String stringEntered) {

		// change string to character array
		char[] inputString = stringEntered.toCharArray();

		// create arraylist to hold duplicate characters
		ArrayList<Character> duplicateCharacters = new ArrayList<Character>();
		ArrayList<Character> uniqueCharacters = new ArrayList<Character>();
		boolean isDuplicate;
		// loop thru the array to find dupicates
		for (int i = 0; i < stringEntered.length(); i++) {
			isDuplicate = false;
			for (int j = i + 1; j < stringEntered.length(); j++) {
				if (inputString[i] == inputString[j]) {
					// add character to duplicates list
					duplicateCharacters.add(inputString[j]);
					isDuplicate = true;
					break;
				}

			}
			if ((!isDuplicate) && !duplicateCharacters.contains(inputString[i]))
				uniqueCharacters.add(inputString[i]);

		}
		
		if (!uniqueCharacters.isEmpty())
			System.out.println(uniqueCharacters.get(0));
		else
			System.out.println("No non repeating character");
	}
	

}
