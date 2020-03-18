package com.nttdata.stringexercise;

public class OnlyDigitsString {

		   public static void main(String []args) {
		      String inputString= ReadInput.myString();
		      String regularExpession = "\\d+";
		      if(inputString.matches(regularExpession) ) {
		         System.out.println("String contains only digits!");		     
		      }
		      else {
			    	 System.out.println("String contains characters other than digits");
			     }
		   }	
}
