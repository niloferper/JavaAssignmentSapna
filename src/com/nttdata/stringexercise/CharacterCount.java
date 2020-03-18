package com.nttdata.stringexercise;

import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter String : " );
		 String inputString = input.nextLine();
		System.out.println("Enter Character : ");
		 String myChar =input.nextLine();
		 
		 input.close();
		 int count =0;
		for (int i=0;i<inputString.length();i++)
		{
			if ( myChar.isBlank())break;
			if (inputString.charAt(i)==myChar.charAt(0))count+=1;
		}
		if (myChar.isBlank())System.out.println("no character entered");
		else System.out.println("The Character " + myChar.charAt(0) + " appears " + count + " times in the string " + inputString );
		
		
	}

}
