package com.nttdata.stringexercise;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean isAnagram = true;
		System.out.println("Enter String1 ");
		String string1 = in.next();
		System.out.println("Enter String2 ");
		String string2 = in.next();
		in.close();	
		// convert to char Array
		char[] inputString1 = string1.toCharArray();
		char[] inputString2 = string2.toCharArray();
		// sort both strings
		Arrays.sort(inputString1);
		Arrays.sort(inputString2);
		// if length is different strings cannot be anagram
		if (string1.length() == string2.length()) {
			// Compare sorted strings
			for (int i = 0; i < string1.length(); i++)
				if (inputString1[i] != inputString2[i])
					isAnagram = false;
		} else {
			isAnagram = false;
		}

		if (isAnagram)
			System.out.println("Entered strings are Anagram");
		else
			System.out.println("not an anagram");
	}

}
