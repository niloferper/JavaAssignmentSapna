package com.nttdata.stringexercise;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class HighestOcrdCharInStr {
	
	static final int ASCII_SIZE = 256;
	public static void main(String[] args) {
		
	//	final 
		String inputString = ReadInput.myString();
		char[] strToCharArr = inputString.toCharArray();
		int count;
		//create a HashMap to store character , count pair
		HashMap<Character,Integer> charCount = new HashMap<Character, Integer>();
		for (char ch : strToCharArr)
		{
			if (charCount.containsKey(ch)) {
				count = charCount.get(ch);
				charCount.replace(ch, count, count+1);
			}else charCount.put(ch, 1);
		}

        int maxValueInMap=Collections.max(charCount.values());
        //System.out.println(maxValueInMap);
        for (Entry<Character, Integer> entry : charCount.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }
        System.out.println(" is/are the highest occuring chars in the string with " + maxValueInMap + " occurance");
	}

}
