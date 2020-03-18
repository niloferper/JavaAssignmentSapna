package com.nttdata.stringexercise;

import java.util.Scanner;

public class ReadInput {
	public static boolean mybool() {
		Scanner in = new Scanner(System.in);
		boolean i = false;
		boolean gotValue = true;
		do {
			System.out.print("Enter true or false ");
			while (!in.hasNextBoolean()) {
				System.out.println("That's not a condition, Enter a true or false :\n ");
				in.next(); // this is important!
			}

			i = in.nextBoolean();
			gotValue = false;
		} while (gotValue);
		in.close();
		return i;
	}

	public static String myString() {

		Scanner in = new Scanner(System.in);
		String i;
			System.out.print("Enter String ");
			i = in.nextLine();
		in.close();
		return i;
	}

	public static int myNum() {
		Scanner input = new Scanner(System.in);
		int i = 0;
		boolean gotValue = true;
		do {
			System.out.print("Enter a number:(0 to exit) ");
			while (!input.hasNextInt()) {
				System.out.println("That's not a number! Enter a number (0 to exit) :\n ");
				input.next(); // this is important!
			}

			i = input.nextInt();
			gotValue = false;
		} while (gotValue);
		input.close();
		return i;
	}

	

	public static float myFloat() {
		Scanner input = new Scanner(System.in);
		float myNum = 0.0f;
		boolean gotValue = true;
		do {
			System.out.print("Enter a number: ");
			while (!input.hasNextFloat()) {
				System.out.println("That's not a number! Enter a number :\n ");
				input.next(); // this is important!
			}

			myNum = input.nextFloat();
			gotValue = false;
		} while (gotValue);
		input.close();
		return myNum;
	}
}
