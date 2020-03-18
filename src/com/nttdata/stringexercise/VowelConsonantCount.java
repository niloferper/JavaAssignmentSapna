package com.nttdata.stringexercise;

public class VowelConsonantCount {

	public static void main(String[] args) {
		
		int vowelCount = 0;
		int consonantCount = 0;
		String inputString = ReadInput.myString();
		inputString = inputString.toLowerCase();
		
		for (int i=0;i<inputString.length();i++) {
			//check for vowels and increment count if a vowel is found
			if (inputString.charAt(i)=='a' || inputString.charAt(i)=='e' || inputString.charAt(i)=='i' || inputString.charAt(i)=='o' || inputString.charAt(i)=='u')
				vowelCount+=1;
			//check for consonats and increment count if found
			else if(inputString.charAt(i)>'a' && inputString.charAt(i)<='z')
					consonantCount+=1;
		}
		
		System.out.println("The input string has ");
		System.out.println(vowelCount + " Vowels");
		System.out.println(consonantCount + " Consonants");
	}

}
