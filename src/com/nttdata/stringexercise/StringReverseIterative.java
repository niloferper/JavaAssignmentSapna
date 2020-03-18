package com.nttdata.stringexercise;

public class StringReverseIterative {

	public static void main(String[] args) {
		
		//System.out.println("Enter the string to be reversed : ");
		String inputString = ReadInput.myString();
		int i,j,n;
		n = inputString.length();
		char[] reverseString = inputString.toCharArray();
		char temp;
		// Swap character from begining to end
	     for ( i=0, j=n-1; i<j; i++,j--) 
	     { 
	         temp = reverseString[i]; 
	         reverseString[i] = reverseString[j]; 
	         reverseString[j] = temp; 
	     } 
	     System.out.print("Reverse string is : ");
	     System.out.println( reverseString);
	}

}
