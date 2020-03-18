package com.nttdata.stringexercise;

import java.util.Scanner;
import java.util.Stack;

public class RemoveCharacter {

	public static void main(String[] args) {

		// read the string and character
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String : ");
		String inputString = input.nextLine();
		char[] inputCharArr = inputString.toCharArray();
		System.out.println("Enter Character : ");
		String myChar = input.nextLine();
		char[] inputChar = myChar.toCharArray();
		char ch = inputChar[0];

		input.close();
		// create a stack to push chars
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < inputString.length(); i++) {
			if (inputCharArr[i] != ch)
				st.add(inputCharArr[i]);
		}
		char[] newArr = new char[st.size()];
		int charCount = st.size();
		if (charCount > 0) {
			for (int j = charCount; j > 0; j--)
				newArr[j - 1] = st.pop();
		}
		System.out.println(newArr);
	}

}
