package com.telus.programmingfundamentals;

import java.util.Scanner;

/* An exception is a program that occurs during the execution of a program,
 * it occurs due to coding errors made by the the programmers, errors due to invalid input etc.,
 * When an exception occurs, program execution will stop and generate an error message.
 * To handle such scenario we use java exception.
 */

public class ExceptionSample {

	public static void main(String[] args) {
		//System.out.println(10/0);

		// 1. Arithmetic Exception :-
		int a = 10;
		int b = 0;
		try
		{
			int result = a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont divide any number by zero. The error message is " + e);
		}

		// 2. Null Pointer Exception :-
		/*
		 * In Java, a special null value be assigned to an object reference.
		 * NullPointerException is thrown when program attempts to use an object reference that has the null value.
		 */

		String name = null;
		try
		{
			if (name.equals("Java")) {
				System.out.println("The Strings  are same");				
			}
			else
			{
				System.out.println("The String are not same");
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("Dont enter the null value. The error message is " + e);
		}

		// 3. Array Index out of bounds exception
		int [] num = new int[4];
		try {
			num[10]= 100;
			System.out.println(num[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Mention the value within the array limit"); 
			System.out.println("The Error message is " + e);
		}

		// 4. Number Format Exception :-
		Scanner scan = new Scanner(System.in);
		System.out.println("Read Two Number");
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		try {
			int c = Integer.parseInt(s1);
			int d = Integer.parseInt(s2);
			System.out.println(c+d);

		}
		catch(NumberFormatException e5) {
			System.out.println(e5);
		}

		// try catch finally concept using DB example :-
		try {
			//Connect to data base
			//Run the query
			//Display the output
		}
		catch(Exception e) {
			// Exception code for data base issue

		}
		finally {
			// This code will be executed as compulsary
			System.out.println("Finally Block is exexuted");
		}

	}

}
