package com.nttdata.stringexercise;

public class StringReverseRecursive {
	

		 
		public static void main(String[] args) {
	 
	 
			String inputString = ReadInput.myString();
	 
			//create Method and pass and input parameter string 
			String reversedString = reverseString(inputString);
			System.out.println("The reversed string is: " + reversedString);
			
		}
	 
	 
		//Method take string parameter and check string is empty or not
		public static String reverseString(String inputString)
		{
			if (inputString.isEmpty()){
			// System.out.println("String in now Empty");	
			 return inputString;
			}
			//Calling Function Recursively
			//System.out.println("String to be passed in Recursive Function: "+inputString.substring(1));
			//System.out.println(inputString.charAt(0));
			return reverseString(inputString.substring(1)) + inputString.charAt(0);
		}
	 


}
